import java.util.Scanner;
class Salary{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    double sal=sc.nextDouble();
    double bonus;
    if (sal>=50000)
      bonus=sal*0.10;
    else
      bonus=sal*0.05;
    System.out.println("bonus"+bonus);
  }
}