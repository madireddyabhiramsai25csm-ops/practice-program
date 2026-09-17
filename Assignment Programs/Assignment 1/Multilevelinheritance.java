package inheritance;

class Cow {
 void drink() {
     System.out.println("cow is drinking");
 }
}


class Duck extends Cow {
 void bark() {
     System.out.println("Duck is barking");
 }
}


class Puppy extends Duck {
 void weep() {
     System.out.println("Puppy is weeping");
 }
}


public class MultiLevel {
 public static void main(String[] args) {
     Puppy p = new Puppy();

     p.drink();   
     p.bark();  
     p.weep();  
 }
}
