package practice;
import java.util.Scanner;
import java.util.ArrayList;
public class highlyGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b =new Scanner(System.in);
		
     ArrayList<String> student=new ArrayList<>();
     ArrayList<Integer> mathscore=new ArrayList<>();
     ArrayList<Integer> sciencescore=new ArrayList<>();
     ArrayList<Integer> englishscore=new ArrayList<>();
     ArrayList<Integer> average=new ArrayList<>();
     ArrayList<String> Grade=new ArrayList<>();
     ArrayList<Integer> totalmark =new ArrayList<>();
     for(int i = 0;i<5-1;i++) {
     System.out.println("Enter student name,Id(Kevin,234)");
     student.add(b.nextLine());
     System.out.println("enter student math score");
     mathscore.add(b.nextInt());
     System.out.println("Enter student science score");
     sciencescore.add(b.nextInt());
     System.out.println("Enter student ENglish score");
     englishscore.add(b.nextInt());
     }
      average.add(mathscore.get(0)+sciencescore.get(0)+englishscore.get(0)/3);
      average.add(mathscore.get(1)+sciencescore.get(1)+englishscore.get(1)/3);
      average.add(mathscore.get(2)+sciencescore.get(2)+englishscore.get(2)/3);
      average.add(mathscore.get(3)+sciencescore.get(3)+englishscore.get(3)/3);
      average.add(mathscore.get(4)+sciencescore.get(4)+englishscore.get(4)/3);
	for(int i = 0;i<5-1;i++) {
		if(average.get(i)>=90) {
			Grade.add("A+");
		}else if(average.get(i)>=80&&average.get(i)<=89) {
			Grade.add("A");
		}else if(average.get(i)>=70&&average.get(i)<=79) {
			Grade.add("B");
		}else if(average.get(i)>=60&&average.get(i)<=69) {
			Grade.add("C");
		}else {
			Grade.add("F");
		}
	}
		for(int c = 0;c<5-1;c++) {
			totalmark.add(mathscore.get(c)+sciencescore.get(c)+englishscore.get(c));
		}
		
			for(int d = 0;d<5-1;d++) {
				System.out.println("Name,Id:"+student.get(d)+"Total mark:"+ totalmark.get(d)+"Average score:"+ average.get(d)+"Grade:"+Grade.get(d));
			}
		
		
	
	}
}









