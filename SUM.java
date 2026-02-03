import java.util.Scanner;
public class SUM{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number");
    int num=sc.nextInt();
    int sum=0;
    while(num!=0){
      sum=sum+(num%10);
      num=num/10;
    }
    System.out.println("sum of digits"+sum);
    sc.close();
  }
}