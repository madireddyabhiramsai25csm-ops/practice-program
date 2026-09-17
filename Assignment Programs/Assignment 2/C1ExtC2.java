interface I1 {
    int m = 20;

    void display();
}

class C2 {
    int n = 10;
}

class C1 extends C2 implements I1 {

    @Override
    public void display() {
        System.out.println("This is from interface I1");
        System.out.println("Sum of n and m is : " + (n + m));
    }
}

public class C1ExtC2 {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.display();
    }
}
/*
output

This is from interface I1
Sum of n and m is : 30

*/
