package assignment;
import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b=new Scanner(System.in);
		
		System.out.println("Enter you name:");
		String name =b.nextLine();
		System.out.println("Enter you math score:");
		int m =b.nextInt();
		System.out.println("Enter you secience score:");
		int c =b.nextInt();
		System.out.println("Enter you English score:");
		int e =b.nextInt();
		int s =(m+c+e)/3;
		if (s<60) {
		System.out.println("F");
		}
		else if(s>=60&&s<70){
			System.out.println("D");
		}
		else if(s>=70&&s<80) {
			System.out.println("C");
		}
		else if(s>=80&&s<90) {
			System.out.println("B");
		}
		else  {
			System.out.println("A");
		}
			
		
		 
		
	
			
		
		

	}

}
