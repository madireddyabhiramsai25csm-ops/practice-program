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
