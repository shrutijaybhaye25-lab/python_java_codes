class Student {
    String name;
    int marks;
}

class StudentFactory {
    Student createStudent() {
        Student s = new Student();
        s.name = "xyz";
        s.marks = 95;
        return s;
    }
}

public class main5 {
    public static void main(String[] args) {
        StudentFactory f1 = new StudentFactory();
        Student s1 = f1.createStudent();

        System.out.println("The name is " + s1.name);
        System.out.println("The marks are " + s1.marks);
    }
}