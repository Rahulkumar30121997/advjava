// program showing the concept of pojo class

class Student
{
    public int rno;
    protected double per;
    private String name;    

    Student(int rno,double per,String name)
    {
        this.rno=rno;
        this.per=per;
        this.name=name;
    }

    private void set()
    {
        System.out.println("set method called");
    }
    void display()
    {
        set();
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
    }
}
class Demo1
{
    public static void main(String args[])
    {
        Student s = new Student(101,67.78,"John Deo");
        s.display();
 // error      System.out.println("\nName : "+s.name);
 //       System.out.println("Roll Number : "+s.rno);
 //       System.out.println("Percentage : "+s.per);
    }
}