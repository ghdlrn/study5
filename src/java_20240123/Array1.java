package java_20240123;

public class Array1 {

	public static void main(String[] args) {

		//int형 배열
		
		int[] arrNum = new int[5];
		
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 30;
		arrNum[3] = 40;
		arrNum[4] = 50;

		for(int i=0; i<5; i++)
			System.out.print(arrNum[i] + " ");
		System.out.println("\n---------------------------------");
		
		int[] arrNum2 = {10, 20, 30, 40, 50};
		
		for(int i = 0; i<5; i++)
			System.out.print(arrNum2[i] + " "); 
		
		System.out.println("\n---------------------------------");
		
		int[] arrNum3 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		System.out.println(arrNum3.length);
		
		for(int i = 0; i<arrNum3.length; i++)
			System.out.print(arrNum3[i] + " "); 
		
	}

}
