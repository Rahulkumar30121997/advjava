// program showing the concept of Bean class

import java.io.Serializable;
class Student implements Serializable
{
    private int rno;
    private double per;
    private String name;    

    Student(){}
    // setter methods
    public void setRno(int rno)
    {
        this.rno=rno;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPer(double per)
    {
        this.per=per;
    }
    
    // getter methods
    public String getName()
    {
        return name;
    }
    public int getRno()
    {
        return rno;
    }
    public double getPer()
    {
        return per;
    }
}
class Demo2
{
    public static void main(String args[])
    {
        Student s = new Student();
          s.setRno(101);
          s.setPer(67.78);
          s.setName("Andrew Anderson");

          System.out.println("\nName : "+s.getName());
          System.out.println("Roll Number : "+s.getRno());
          System.out.println("Percentage : "+s.getPer());
    }
}