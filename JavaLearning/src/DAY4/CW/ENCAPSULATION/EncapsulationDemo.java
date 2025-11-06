package DAY4.CW.ENCAPSULATION;

class Student{
    private int rno;
    private String name;
    private int marks;
    public void setRno(int rno){
        this.rno=rno;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public int getRno(){
        return rno;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }

}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setRno(205036);
        s1.setName("Hasan");
        s1.setMarks(100);
        System.out.println(s1.getRno()+" "+s1.getName()+" "+s1.getMarks());
    }
}