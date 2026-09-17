interface I1 {
    int n = 10;

    void display();
}

class C implements I1 {

    @Override
    public void display() {
        System.out.println("This is from interface I1");
        System.out.println("Square of n is : " + (n * n));
    }
}

public class C1ImplI1 {
    public static void main(String[] args) {

        C obj=new C();
        obj.display();
    }
}
/*
output

This is from interface I1
Square of n is : 100

*/
