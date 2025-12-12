import java.util.Scanner;
public class citizen{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    if (age>=60){
      System.out.println("you're a senior person");
    }
    else{
      System.out.println("you're a junior");
    }
  }
}