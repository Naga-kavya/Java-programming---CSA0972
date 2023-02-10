import java.util.Scanner;

interface Subject1 {
    void getSubject1Marks();
}

interface Subject2 {
    void getSubject2Marks();
}

interface Subject3 {
    void getSubject3Marks();
}

interface Subject4 {
    void getSubject4Marks();
}

interface Subject5 {
    void getSubject5Marks();
}

interface Subject6 {
    void getSubject6Marks();
}

class Student implements Subject1, Subject2, Subject3, Subject4, Subject5, Subject6 {
    int pythonMarks, cMarks, mathematicsMarks, physicsMarks, chemistryMarks, ethicsMarks;
    int total;
    float aggregate;

    Scanner sc = new Scanner(System.in);

    public void getSubject1Marks() {
        System.out.print("Enter the marks in python: ");
        pythonMarks = sc.nextInt();
    }

    public void getSubject2Marks() {
        System.out.print("Enter the marks in c programming: ");
        cMarks = sc.nextInt();
    }

    public void getSubject3Marks() {
        System.out.print("Enter the marks in Mathematics: ");
        mathematicsMarks = sc.nextInt();
    }

    public void getSubject4Marks() {
        System.out.print("Enter the marks in Physics: ");
        physicsMarks = sc.nextInt();
    }

    public void getSubject5Marks() {
        System.out.print("Enter the marks in Chemistry: ");
        chemistryMarks = sc.nextInt();
    }

    public void getSubject6Marks() {
        System.out.print("Enter the marks in Professional Ethics: ");
        ethicsMarks = sc.nextInt();
    }

    public void calculateTotal() {
        total = pythonMarks + cMarks + mathematicsMarks + physicsMarks + chemistryMarks + ethicsMarks;
    }

    public void calculateAggregate() {
        aggregate = (float) total / 6;
    }

    public void displayResult() {
        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + aggregate);
        if (aggregate > 75) {
            System.out.println("Class: DISTINCTION");
        } else if (aggregate >= 60 && aggregate <= 75) {
            System.out.println("Class: FIRST DIVISION");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("Class: SECOND DIVISION");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("Class: THIRD DIVISION");
        } else {
            System.out.println("Class: FAIL");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.getSubject1Marks();
        s.getSubject2Marks();
        s.getSubject3Marks();
        s.getSubject
}}
