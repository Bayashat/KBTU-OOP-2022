public class Person_Demo
{
    public static void main(String[] args) {

        // Overload
        Person p = new Person("John", "Almaty");
        p.eat("Fish");

        Teacher T = new Teacher("Sara", "Astana", "20B030499", 20);
        T.eat(5);

        // Array of objects
        Student[] st = new Student[3];
        for(int i = 0; i < st.length; i++)
        {
            st[i] = new Student(i+2020, i + 11.5);
        }
        for(int i = 0; i < st.length; i++)
        {
            System.out.println(st[i].getYear() + " " + st[i].getFee());
        }

        // Polymorphism
        Person Pr = new Student(2022, 70.2);
        System.out.println(Pr.toString());

        // Dynamic binding
        Person Prs = new Student(2023, 78.4);
        Prs.speak(); // Student speaking!

        // Protected data field : we can't use it only in different package
        Student s = new Student(2024, 84.0);
        System.out.println(s.fee); // 84.0
        // System.out.println(Prs.fee); // error: because the Person class have no this field

        // Final method:
        System.out.println(s.toString()); // error: because the original toString method in Person class in FINAL, so it won't be overrited

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
    public void eat(String food)
    {
        System.out.println("Person eating " + food);
    }
    public final void speak()
    {
        System.out.println("Person spaeking!");
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
    protected double fee;
    Student(int year, double fee)
    {
        this.year = year;
        this.fee = fee;
    }
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
    @Override
    public void speak()
    {
        System.out.println("Student speaking!");
    }
}

public class Teacher extends Person
{
    private String id;
    private int age;
    Teacher(String name, String address, String id, int age)
    {
        this.name = name;
        this.address = address;
        this.id = id;
        this.age = age;
    }
    public String getId()
    {
        return id;
    }
    public void setId()
    {
        this.id = id;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge()
    {
        this.age = age;
    }
    public void eat(int num)
    {
        System.out.println("Teacher eating " + num + " apple");
    }
    @Override
    public String toString()
    {
        return "Teacher[Person[name = " + name + ",address = " + address + "], id = " + id + ", age = " + age + "]";
    }
}





