class Student{
    int rollno;
    String name, course;
    float fee;
    Student(int rollno,String name,String course,float fee)
    {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }
    void display()
    {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}
public class Eample05 {
    public static void main(String arg[])
    {
        Student s1 = new Student(001, "Parvesh", "java", 1000);
        Student s2 = new Student(002, "Sachin", "java", 100);
        s1.display();
        s2.display();
    }
}
