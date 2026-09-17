interface I2 {
    void method2();
}

interface I3 {
    void method3();
}

interface I1 extends I2, I3 {
    void method1();
}

class C1 implements I1 {

    public void method1() {
        System.out.println("Method of I1");
    }

    public void method2() {
        System.out.println("Method of I2");
    }

    public void method3() {
        System.out.println("Method of I3");
    }
}

public class Case8 {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.method1();
        obj.method2();
        obj.method3();
    }
}
