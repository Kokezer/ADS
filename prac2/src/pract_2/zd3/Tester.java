package pract_2.zd3;

import java.util.Scanner;

class Point{
    protected double x;
    protected double y;

    Point(){}
    Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString(){
        return "Центр точки:"+x+" "+y;
    }
}

class Circle{
    private Point a;
    private double r;

  //  Point pt = new Point();

    Circle(Point a,double r){
        this.a=a;
        this.r=r;
    }

    Circle(){}

    public Point getA(){
        return a;
    }

    public void setA(Point a){
        this.a=a;
    }

    public String toString(){
        return  a+"\n"+
                "Радиус равен:"+r;
    }
}

public class Tester {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Circle p[]=new Circle[3];
        for(int i=0;i<3;i++) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            double r = in.nextDouble();
            Point a = new Point(x,y);
            p[i] = new Circle(a,r);
        }

        for (int i = 0; i<3;i++){
           System.out.println(p[i]);
        }

    }
}
