package java_20240123;

public class Array2 {

	public static void main(String[] args) {

		//int형 배열 생성 후 랜덤을 이용해서 1~100사이의  10개의 값 저장
		//그 배열의 총점, 평균 구하기
		
		double avg = 0;
		int total = 0;
		
		int[] arrNum = new int[10];
		
		//1~100의 값을 랜덤하게 추출해서 저장
		
		for(int i=0; i<arrNum.length; i++) {
			int num = (int)(Math.random()*100)+1;
			arrNum[i] =num;
		}
		
		//배열 10개값 출력
		
		for(int i=0; i<arrNum.length; i++)
			System.out.print(arrNum[i] + " ");
		
		System.out.println("\n----------------------------");
		
		//배열 총점, 평균 구하기
		
		for(int i = 0; i<arrNum.length; i++)
			total += arrNum[i];
		
		avg = (double)total/arrNum.length;
		System.out.println("총점 : " + total + "평균 : " + avg);
		
		//최대값 구하기
		int max = 0;
		
		for(int i=0; i<arrNum.length; i++) {
			
			max = Math.max( max , arrNum[i]);
			
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("\n----------------------------");
		
		//정렬

		
		
	}

}
