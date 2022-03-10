public class Person_Demo
{
    public static void main(String[] args) {

        Student s = new Student("Bayashat", "Almaty", "IT", 2022, 50.1);
        System.out.println(s.toString());

        Staff s2 = new Staff("John", "Astana", "Abay", 180.2);
        System.out.println(s2.toString());

    }
}
public class Person
{
    public String name;
    public String address;
    Person(){}
    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String toString()
    {
        return "Person[name = " + name + ",address = " + address + "]";
    }
}

public class Staff extends Person
{
    private String school;
    private double pay;
    Staff(String name, String address, String school, double pay)
    {
        this.name = name;
        this.address = address;
        this.school = school;
        this.pay = pay;
    }
    public String getSchool()
    {
        return school;
    }
    public void setSchool(String school)
    {
        this.school = school;
    }
    public double getPay()
    {
        return pay;
    }
    public void setPay(double pay)
    {
        this.pay = pay;
    }

    @Override
    public String toString()
    {
        return "Staff[Person[name = " + name + ",address = " + address + "], school = " + school + ", pay = " + pay + "]";
    }
}

public class Student extends Person
{
    private String program;
    private int year;
    private double fee;
    Student(String name, String address, String program, int year, double fee)
    {
        this.name = name;
        this.address = address;
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram()
    {
        return program;
    }
    public void setProgram()
    {
        this.program = program;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear()
    {
        this.year = year;
    }
    public double getFee()
    {
        return fee;
    }
    public void setFee()
    {
        this.fee = fee;
    }
    @Override
    public String toString()
    {
        return "Student[Person[name = " + name + ",address = " + address + "], program = " + program + ", year = " + year + ", fee = " + fee + "]";
    }
}



