package java_20240123;

public class while2 {

	public static void main(String[] args) {

			int sum = 0;
			int i = 1;
			boolean flag = true;
			
			while (true) {
				while (flag) {
					sum += i;
					i++;
					if(sum > 1000000)
						flag = false;
						System.out.println("while 누적합 : " + sum);
				}
			}
	}

}
