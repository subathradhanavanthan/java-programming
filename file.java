import java.util.Scanner;
public class file{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a;
    String name=sc.next();
    a=sc.nextInt();
    String dept=sc.next();
    System.out.println("enter your name is "+name);
    System.out.println("roll no is "+a);
    System.out.println("enter your dept:"+dept);
  }
}