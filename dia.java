package assignment;

public class dia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=4;i++) {
			for(int w = 1;w<=4-i;w++) {
				System.out.print(" ");
			}
			for(int a =1;a<=2*i-1;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 3;i>=1;i--) {
			for(int w = 1;w<=4-i;w++) {
				System.out.print(" ");
			}
			for(int a =1;a<=2*i-1;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
