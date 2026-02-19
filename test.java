class Animal {
  void eat() {
   System.out.println("Animal eat food");
 }
}
class dog extends Animal{
  void bark(){
    System.out.println("dog bark");
 }
}
public class test{
  public static void main(String[]args){
  dog d=new dog();
  d.eat();
  d.bark();
 }
}
  