import java.util.Scanner;
 class ex1{
  public static void main(String[]args){
  try{
    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int a=10/b;
    arr[7]=5;
}
catch(ArithmeticException e){
  System.out.println("Arithmetic error");
}
catch (ArrayIndexOutOfBoundsException e){
  System.out.println("Array Index Value is Wrong");
}
finally{
 System.out.println("good bye"); 
   }
  }
}
  