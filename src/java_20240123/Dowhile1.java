package java_20240123;

public class Dowhile1 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0; //초기값
		
		do {
			sum += i;
			i++; //증가값
		}while(i < 10); //조건
		
		System.out.println("sum : " + sum);
	}

}
