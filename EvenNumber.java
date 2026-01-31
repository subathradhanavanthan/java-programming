import java.util.Scanner;
public class EvenNumber{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number");
    int N=sc.nextInt();
    for(int i=2;i<=100;i+=2){
     System.out.println(i);
     }
    sc.close();
  }
}
    