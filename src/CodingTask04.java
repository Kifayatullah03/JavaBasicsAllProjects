
public class CodingTask04 {

	public static void main(String[] args) {
		
		
/*Create a 2D array or integer type where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only.
*/		
		int [][] intArray = {{10,20,30},
				{40,50,60},
				{70,80,90}};

		for(int x = 0; x < intArray.length; x++) {
			for(int i = 0; i < intArray.length; i++) {
				if(intArray[x][i] % 2 ==0) {
					System.out.println(intArray[x][i]);
				}
			}
		}
		
		
		
	}

}
