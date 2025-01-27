package ararylist;import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner b= new Scanner(System.in);

        while (true) {
           
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. View students");
            System.out.println("4. Calculate average grade");
            System.out.println("5. Exit");
            System.out.print("Enter what you want: ");
            int option = b.nextInt();
           b.nextLine();

            if (option == 1) {  
                System.out.println("Enter student name: ");
                String name = b.nextLine();
                System.out.println("Enter student grade: ");
                double grade = b.nextDouble();
                students.add(name);
                grades.add(grade);
            } 
            else if (option == 2) { 
                System.out.println("Current students: ");
                 System.out.println(students);
                System.out.println("Enter the serial number of student to remove: ");
                int n = b.nextInt() -1;
                students.remove(n);
                    grades.remove(n);
                    System.out.println("Student removed.");
             
                }
            
            else if (option == 3) { 
               
                    System.out.println("Current students: ");
                  System.out.println(students);
                  System.out.println(grades);}
                        
            
            else if (option == 4) {
                    double f = 0;
                    for(int i = 0;i<grades.size();i++) {
                    	
                        f=f+grades.get(i);
                        System.out.println(f);
                    }
                    double average = f / grades.size();
                    System.out.println("Average grade: " + average);
                
            } 
            else if (option == 5) {  
                System.out.println("Exiting...");
                
           
            }
        }
    }
        }
        
    

			
		
		
		
	


