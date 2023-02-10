class Student {
    private String name;
    private int regNo;
    private int[] marks = new int[5];

    public Student(String name, int regNo, int[] marks) {
        this.name = name;
        this.regNo = regNo;
        this.marks = marks;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + regNo);
        System.out.println("Marks: ");
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            total += marks[i];
        }
        float average = (float) total / marks.length;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] marks = {80, 90, 85, 75, 95};
        Student student = new Student("John Doe", 12345, marks);
        student.displayStudentDetails();
    }
}
