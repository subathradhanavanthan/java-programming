public class firstPrimeNumbers{
  public static void main(String[]args){
    for(int num=51;num<=100; num++){
      int count=0;
      for(int i=1;i<=num;i++){
        if (num%i==0){
          count++;
        }
      }
      if(count==2){
        System.out.println("frirst prime number b/w 50 and 100 is:"+num);
         break;
      }
     }
   }
}
        