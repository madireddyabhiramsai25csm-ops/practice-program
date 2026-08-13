import java.util.Scanner;

public class PartB {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);

       System.out.println("Enter your choice:");
       System.out.println("1.Even or odd");
       System.out.println("2.largest of 3 numbers");
       System.out.println("3.Grade");
       System.out.println("4.Days of a Week");

       int ch=sc.nextInt();

       switch(ch){

         case 1:
             System.out.println("Enetr a number:");
             int num=sc.nextInt();

             if(num%2==0){
                System.out.println(num+"is a even number");
             }else{
                System.out.println(num+"is an odd number");

             }
             break;

         case 2:
            System.out.println("enter 3 numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if(a>b && a>c){
                System.out.println(a+"is the largest number");

            }else if(b>c){
                System.out.println(b+"is the largest number");

            }else{
                System.out.println(c+"is the largest number");
            }
            break;

         case 3:
            System.out.println("enetr teh percentage:");
            double per=sc.nextDouble();

            if(per>=90){
                System.out.println("Grade A");
            }else if(per>=80){
                System.out.println("Grade B");
            }else if(per>=70){
                System.out.println("Grade C");
            }else if(per>=60){
                System.out.println("Grade D");
            }else{
                System.out.println("Grade E");
            }
            break;

         case 4:
            System.out.println("enter the Day number(1-7)");
            int day=sc.nextInt();

            switch(day){
               case 1:
                System.out.println("Monday");
                break;
               case 2:
                System.out.println("Tuesday");
                break;
               case 3:
                System.out.println("wednesday");
                break;
               case 4:
                System.out.println("Thursday");
                break;
               case 5:
                System.out.println("Friday");
                break;
               case 6:
                System.out.println("satday");
                break;
               case 7:
                System.out.println("Sunday");
                break;
              default:
                System.out.println("enter a valid choice");
                break;
                
                
            }
        sc.close();


        }
    }

}
