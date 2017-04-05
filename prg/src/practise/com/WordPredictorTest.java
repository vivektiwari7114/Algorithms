package practise.com;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class WordPredictorTest {
		WordPredictor instance = null;
		@Before
		public void setUp() {
			instance = new WordPredictor("data.txt");
		}
		@Test
		public void testGetMostLikelySuccessor() {
			String[] check = new String[]{"Alice", "was", "at"};
			String[] expected = new String[]{"was", "a", "the"};
			for (int i = 0; i < check.length; i++) {
					String result = instance.getMostLikelySuccessor(check[i]);
					//System.out.println(result);
						assertEquals(expected[i], result);
			}
		}
}