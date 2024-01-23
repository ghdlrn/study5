package java_20240123;

public class continue1 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=1; i<10; ++i) {
			
			if (i%2==1)
				sum += i;
		}
			System.out.println("1~10 사이의 홀수 합은" + sum + "입니다.");
		
		
		int sum2 = 0;
		
		for(int i=1; i<=10; i++) {
			
			if(i%2==0)
				continue;
			sum2 += i;
			
		}
		System.out.println("홀수 합 : " + sum2);
		
	}

}
