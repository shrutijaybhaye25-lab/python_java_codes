class Student {
    String name;
    int marks;
}

class StudentFactory {
    Student createStudent() {
        Student s = new Student();
        s.name = "Samruddhi";
        s.marks = 95;
        return s;
    }

public class Main3 {
    public static void main(String[] args) {
        StudentFactory f1 = new StudentFactory();
        Student s1 = f1.createStudent();

        System.out.println("The name of student: " + s1.name);
        System.out.println("The marks of student: " + s1.marks);
    }
}
}