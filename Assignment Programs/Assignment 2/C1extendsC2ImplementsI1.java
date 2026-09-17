class C2 {
    void displayC2() {
        System.out.println("Method of C2");
    }
}

interface I1 {
    void displayI1();
}

class C1 extends C2 implements I1 {

    public void displayI1() {
        System.out.println("Method of I1");
    }
}

public class Case5 {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.displayC2();
        obj.displayI1();
    }
}
