package practise.com;

import java.util.Random;

/* Name: Shuffle a  array randomly
 * Parameters: Not Applicable
 * Return :Not Applicable
 * Function: Shuffle a  array randomly
 */
public class RandomShuffleArray {

	public static void main(String[] args) {
		//Object array[] = {'a','b','c','d','e'};
		Object  array[] = {"a","b","c","d","e"};
		RandomShuffleArray.shuffle(array);
		

	}
	public static void shuffle(Object array[]){
		if(array == null || array.length == 0)
				return;
		int length = array.length;
		Random rm = new Random();
		
		for(int i=0; i < length; i++){
			int randomNumber = rm.nextInt(length);
			Object temp = array[randomNumber];
			array[randomNumber] = array[i];
			array[i] = temp;
		}
		
		//Display Array
		for(Object t : array)
				System.out.print(t+" ");
	}

}
