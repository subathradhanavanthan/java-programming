import java.util.Scanner;
class Student {
    int rollNo;
    String name;

    void getStudentDetails(Scanner sc){
        System.out.print("Enter Roll Number: ");
        rollNo =sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}
class Marks extends Student {
    int mark1, mark2, mark3;
    int total;
    double average;
   
    void getMarks(Scanner sc) {
      System.out.println("Enter Mark 1:");
      mark1=sc.nextInt();
      
      System.out.println("Enter Mark 2:");
      mark2=sc.nextInt();
      
     System.out.println("Enter Mark 3:");
      mark3=sc.nextInt();
      
      total=mark1+mark2+mark3;
      average=total/3.0;
    }
    void displayResult(){
      displayStudentDetails();
      System.out.println("Total Marks: " + total);
        System.out.println("Average Marks " + average);
    }
}
public class InheritanceExample{
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     Marks student=new Marks();
     student.getStudentDetails(sc);
     student.getMarks(sc);
     System.out.println("Student Result");
     student.displayResult();
     
     sc.close();
   }
}    
       
