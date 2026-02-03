import java.util.Scanner;
public class FactorialNumber{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number");
    int num=sc.nextInt();
    int fact=1;
    while(num>0){
      fact=fact*num;
      num--;
    }
    System.out.println("Factorial is "+fact);
      sc.close();
  }
}