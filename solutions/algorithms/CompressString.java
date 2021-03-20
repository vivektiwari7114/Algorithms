/**
 * ClassName: 
 * Functionality:
 * Author: Vivek Tiwari
 */
package practise.com;

/**
 * @author VivekTiwari
 *
 */
public class CompressString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( compress("a") );
		

	}
	public static String compress(String str){
		
        if (str.length() < 2)
        {
            return str;
        }
        char[] chars = str.toCharArray();
        int insertIndex = 0;
        int i = 0;
        while (i < chars.length)
        {
            int j = i + 1;
            int counter = 1;
            while (j < chars.length && chars[j] == chars[i])
            {
                i++;
                j++;
                counter++;
            }
            chars[insertIndex] = chars[i];
            if (counter > 1)
            {
                  String countAsString= Integer.toString(counter);
                for (int k =0 ; k < countAsString.length(); k++)
                {
                    chars[++insertIndex] = countAsString.charAt(k);
                }
            }
            insertIndex++;
            i = j;
        }
        return new String(chars, 0, insertIndex);
	}

}
