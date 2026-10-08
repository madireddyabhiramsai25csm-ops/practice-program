class Student {

    private int rollNumber;
    private String studentName;
    private int[] marks;

    // Constructor
    Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Calculate total marks
    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Calculate average
    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    // Find highest mark
    int findHighest() {
        int highest = marks[0];

        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }

        return highest;
    }

    // Find lowest mark
    int findLowest() {
        int lowest = marks[0];

        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }

        return lowest;
    }

    // Calculate percentage
    double calculatePercentage() {
        double percentage =
                ((double) calculateTotal() / (marks.length * 100)) * 100;

        return Math.round(percentage * 100.0) / 100.0;
    }

    // Calculate grade
    String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    // Determine pass or fail
    String getResult() {
        if (calculatePercentage() >= 50)
            return "PASS";
        else
            return "FAIL";
    }

    // Performance remark
    String getRemark() {
        String grade = calculateGrade();

        switch (grade) {
            case "A+":
                return "Outstanding Performance";

            case "A":
                return "Excellent Performance";

            case "B":
                return "Very Good Performance";

            case "C":
                return "Good Performance";

            case "D":
                return "Satisfactory Performance";

            default:
                return "Needs Improvement";
        }
    }

    // Display complete student details
    void displayDetails() {

        String formattedName = studentName.trim().toUpperCase();

        System.out.println("====================================");
        System.out.println("     STUDENT PERFORMANCE REPORT");
        System.out.println("====================================");

        System.out.println("Roll Number     : " + rollNumber);
        System.out.println("Student Name    : " + formattedName);
        System.out.println("Name Length     : " + formattedName.length());

        System.out.println("------------------------------------");

        System.out.println("Subject Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + "       : " + marks[i]);
        }

        System.out.println("------------------------------------");

        System.out.println("Total Marks     : " + calculateTotal());
        System.out.printf("Average Marks   : %.2f%n", calculateAverage());
        System.out.println("Highest Mark    : " + findHighest());
        System.out.println("Lowest Mark     : " + findLowest());
        System.out.printf("Percentage      : %.2f%%%n",
                calculatePercentage());
        System.out.println("Grade           : " + calculateGrade());
        System.out.println("Result          : " + getResult());
        System.out.println("Remark          : " + getRemark());

        System.out.println("====================================");
    }
}


// Main class
public class StudentPerformance {

    public static void main(String[] args) {

        int[] marks = {92, 85, 78, 88, 95};

        Student student = new Student(
                101,
                "  rahul kumar  ",
                marks
        );

        student.displayDetails();
    }
}
