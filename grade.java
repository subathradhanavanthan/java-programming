import java.util.Scanner;
class Grade{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      if(m>=90)
        System.out.println("A");
      else if(m>=75)
        System.out.println("B");
      else if(m>=60)
        System.out.println("C");
      else if (m>=40)
        System.out.println("D");
      else
        System.out.println("fail");
  }
}