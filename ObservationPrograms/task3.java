class person {
    String name;
    int age;

    void getperson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class student extends person {
    int rollno;

    void getstudent(int rollno) {
        this.rollno = rollno;
    }

    void show() {
        System.out.println("---- student details ----");
        System.out.println("name is " + name);
        System.out.println("age is " + age);
        System.out.println("rollno is " + rollno);
    }
}

class faculty extends person {
    String subject;

    void getfaculty(String subject) {
        this.subject = subject;
    }

    void show() {
        System.out.println("---- faculty details ----");
        System.out.println("name of faculty " + name);
        System.out.println("age of faculty " + age);
        System.out.println("subject name " + subject);
    }
}

public class task3 {
    public static void main(String[] args) {

        student s = new student();
        s.getperson("Srinci", 35);
        s.getstudent(2449);
        s.show();

        faculty f = new faculty();
        f.getperson("gopi ", 19);
        f.getfaculty("java programming");
        f.show();
    }
}
