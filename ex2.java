import java.util.Scanner;
 class ex2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    try{
      String s=sc.next();
      int a=Integer.parseInt(s);
    }
    catch(NumberFormatException e){
       System.out.println("NumberFormat Executed");
    }
  }
 }
      