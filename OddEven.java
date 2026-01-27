import java.util.Scanner;
class OddEven{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    switch(n%2){
      case 1:
        System.out.println("even");break;
      case 2:
        System.out.println("odd");
    }
  }
}
        