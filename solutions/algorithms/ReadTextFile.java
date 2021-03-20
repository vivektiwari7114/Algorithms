/**
 * ClassName: Read text File throug java Program
 * Functionality:
 * Author: Vivek Tiwari
 */
package practise.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author VivekTiwari
 *
 */
public class ReadTextFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File ("data.txt");
		
		int n, m;
		int k = 2;
		
		char matrix[][];
		try{
			Scanner in = new Scanner(file);
			 n = in .nextInt();
			 m = in.nextInt();
			 matrix = new char[n][m];
			for(int i=0; i < n;i++){
				for(int j=0; j < m;j++){
					matrix[i][j] = in.next().charAt(0);
				}
			}
			in.close();
			
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < n; ++i) {
				char[] row = matrix[i];
				int count = 0;

				for (char c: row) 
					if (c == 'T') ++count;

				if (count == k || (k - count >= 0 && (k - count) % 2 != 0)) {
					String key = new String(row);
					if (map.containsKey(key))
						map.put(key, map.get(key)+1);
					else
						map.put(key, 1);
				}
			}
		
			int max = 0;
			for (int value: map.values())
				max = Math.max(value, max);
			System.out.println(map);

			System.out.println(max);
		
		
		
		
		}
		catch(FileNotFoundException e){
			e.printStackTrace();		
		}

	}

}
