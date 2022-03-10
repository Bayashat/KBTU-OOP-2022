public class Point_Demo
{
    public static void main(String[] args) {

        MovablePoint m1 = new MovablePoint(5,10,2,2);
        System.out.println(m1.move()); // (7.0, 12.0),speed = (2.0, 2.0)

    }
}
public class Point
{
    public float x = 0.0f;
    public float y = 0.0f;
    Point(){}
    public Point(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    public float getX()
    {
        return x;
    }
    public void setX(float x)
    {
        this.x = x;
    }
    public float getY()
    {
        return y;
    }
    public void setY(float y)
    {
        this.y = y;
    }
    public void setXY(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    public float[] getXY()
    {
        float[] f = {x,y};
        return f;
    }
    public String toString()
    {
        return "( " + x + ", " + y + " )";
    }
}

public class MovablePoint extends Point
{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    MovablePoint(){}
    public MovablePoint(float xSpeed, float ySpeed)
    {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y,float xSpeed, float ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed()
    {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed)
    {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed()
    {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed)
    {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed)
    {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed()
    {
        float[] f = {xSpeed,ySpeed};
        return f;
    }
    public String toString()
    {
        return "(" + x + ", " + y + "),speed = (" + xSpeed + ", " + ySpeed + ")";
    }
    public MovablePoint move()
    {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}


