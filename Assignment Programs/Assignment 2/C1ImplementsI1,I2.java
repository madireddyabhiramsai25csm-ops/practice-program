interface I1 {
    void method1();
}

interface I2 {
    void method2();
}

class C1 implements I1, I2 {

    public void method1() {
        System.out.println("Method of I1");
    }

    public void method2() {
        System.out.println("Method of I2");
    }
}

public class Case4 {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.method1();
        obj.method2();
    }
}
