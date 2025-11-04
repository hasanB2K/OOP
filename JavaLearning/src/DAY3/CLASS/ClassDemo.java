package DAY3.CLASS;

class Student{
    int rno;
    String name;
    String dept;
    public void display(){
        System.out.println("RNo: "+rno+"\nName: "+name+"\nDept: "+dept);
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="hasan";
        s1.rno=001;
        s1.dept="IT";
        s1.display();
        System.out.println("---------------------------");
        Student s2=new Student();
        s2.name="kavi";
        s2.rno=002;
        s2.dept="CSE";
        s2.display();

    }
}