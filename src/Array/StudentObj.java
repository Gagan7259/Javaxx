package Array;

class Student {
    int rollno;
    String name;
    int marks;
}

public class StudentObj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 10;
        s1.name = "Gagan";
        s1.marks = 95;


        Student s2 = new Student();
        s2.rollno = 10;
        s2.name = "Gagan";
        s2.marks = 95;


        Student s3 = new Student();
        s3.rollno = 10;
        s3.name = "Gagan";
        s3.marks = 95;
        Student[] styy = new Student[3];
        styy[0] = s1;
        styy[1] = s2;
        styy[3] = s3;
        System.out.println(styy);

        for (Student std : styy) {
            System.out.println("student nameis " + std.name + "Roll num is:" + std.rollno + "And marks" + std.marks);
        }
    }
}
