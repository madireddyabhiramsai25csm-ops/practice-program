import java.util.Scanner;

public class PartA {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);

       System.out.println("enter the name of student :");
       String name=sc.nextLine();

       System.out.println("enter the rollno. of student:");
       int rollno=sc.nextInt();

       System.out.println("enter the marks of student in four subjects: ");
       int S1=sc.nextInt();
       int S2=sc.nextInt();
       int S3=sc.nextInt();
       int S4=sc.nextInt();

       int totalmarks=S1+S2+S3+S4;
       Double Percentage=(totalmarks/4.00);

       System.out.println("Student information");
       System.out.println("name:"+name);
       System.out.println("RollNo.:"+rollno);
       System.out.println("Total marks:"+totalmarks);
       System.out.println("Percentage:"+Percentage+"%");

       sc.close();
    }
}

