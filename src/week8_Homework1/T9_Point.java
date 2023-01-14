package week8_Homework1;

public class T9_Point {

    int x, y; //declare instance variables

    //constructor without parameters
    public T9_Point() {
    }

    //constructor with parameters
    public T9_Point(int x, int y) {
        this.x = x; //initialise x
        this.y = y; //initialise y
    }

    //declare instance variable to return the value of x
    public int getX() {
        return x; //return the value of x
    }

    //declare instance variable to return the value of y
    public int getY() {
        return y; //return the value of y
    }

    //declare instance variable to set the value of x
    public void setX(int x) {
        this.x = x; //set the value of y
    }

    //declare instance variable to set the value of y
    public void setY(int y) {
        this.y = y; //set the value of y
    }

    //return distance between this point and point(0,0)
    public double distance() {
        return Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
    }

    //return the distance between this Point and Point x,y as double.
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    //return the distance between this Point and another Point as double
    public double distance(T9_Point p) {
        return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
    }

    //Main method
    public static void main(String[] args) {
        T9_Point first = new T9_Point(6, 5);
        T9_Point second = new T9_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        T9_Point point = new T9_Point();
        System.out.println("distance()= " + point.distance());
    }
}

