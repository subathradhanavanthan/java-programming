public class stringbufferEx{
  public static void main(String[]args){
    StringBuffer sb=new StringBuffer("Java");
    sb.append("programming");
    System.out.println("after append:"+sb);
    sb.insert(3,"language");
    System.out.println("after insert:"+sb);
    sb.replace(0,4,"python");
    System.out.println("after replace:"+sb);
    sb.delete(4,6);
    System.out.println("after delete:"+sb);
    sb.reverse();
     System.out.println("after reverse:"+sb);
  }
}
    
    
      
      