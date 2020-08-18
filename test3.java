package rennsyuuyou;

public class test3 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		int[] array2 = array.clone();
		
		System.out.println(array);
		
		System.out.println(array2); 

		array2[0] = 999;

		System.out.println(array[0]);

	}

}
