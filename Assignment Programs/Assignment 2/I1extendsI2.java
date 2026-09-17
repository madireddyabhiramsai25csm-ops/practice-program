interface I2 {
    void method2();
}

interface I1 extends I2 {
    void method1();
}

class C1 implements I1 {

    public void method1() {
        System.out.println("Method of I1");
    }

    public void method2() {
        System.out.println("Method inherited from I2");
    }
}

public class Case6 {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.method1();
        obj.method2();
    }
}
