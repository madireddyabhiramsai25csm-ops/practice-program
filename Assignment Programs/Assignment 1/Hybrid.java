interface A 
{
    void sample1();
}

interface B extends A
{
    void sample2();
}

interface C extends A 
{
    void sample3();
}

class D implements B, C {
    public void sample1()
    {
        System.out.println("THIS FROM INTERFACE A");
    }

    public void sample2() 
    {
        System.out.println("INHERIT FROM INTERFACE B");
    }

    public void sample3() 
    {
        System.out.println("INHERIT FROM INTERFACE C");
    }
    void sample4()
    {
        System.out.println("this from class D");
    }

}

public class Hybrid {
    public static void main(String[] args) {
        D obj=new D();
        obj.sample1();
        obj.sample2();
        obj.sample3();
        obj.sample4();
    }
}
