
public class Shape_Demo
{
    public static void main(String[] args) {

        Circle c1 = new Circle(5.0, "black", true);
        System.out.println(c1.toString());

        Square s1 = new Square(4.0, "White", false);
        System.out.println(s1.getArea());

    }
}
public class Shape
{
    public String color = "red";
    public boolean filled = true;
    Shape(){}
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    @Override
    public String toString()
    {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}

public class Circle extends Shape
{
    private double radius = 1.0;
    public Circle(){}
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return radius * radius * 3.4159;
    }
    public double getPerimeter()
    {
        return 2*3.14159*radius;
    }
    @Override
    public String toString()
    {
        return "Circle[Shape[color = " + color + ",filled = " + filled + "], radius = " + radius + "]";
    }
}
public class Rectangle extends Shape
{
    public double width = 1.0;
    public double length = 1.0;
    public Rectangle(){}
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    public double getArea()
    {
        return width*length;
    }
    public double getPerimeter()
    {
        return 2 * (width + length);
    }
    @Override
    public String toString()
    {
        return "Rectangle[Shape[color = " + color + ",filled = " + filled + "], width = " + width + ", length = " + length + "]";
    }
}

public class Square extends Rectangle
{
    Square(){}
    Square(double side)
    {
        width = side;
        length = side;
    }
    public Square(double side, String color, boolean filled)
    {
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide()
    {
        return width;
    }
    public void setSide(double side)
    {
        width = side;
        length = side;
    }
    @Override
    public void setWidth(double side)
    {
        width = side;
    }
    @Override
    public void setLength(double side)
    {
        length = side;
    }
    @Override
    public String toString()
    {
        return "Square[Shape[color = " + color + ",filled = " + filled + "], width = " + width + ", length = " + length + "]";
    }
}


