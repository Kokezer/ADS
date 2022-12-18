package pract_2.zd6;

class Circle{
    final double pi = 3.14;
    private double x;
    private double y;
    private double r;

    Circle(){}
    Circle(double x, double y, double r){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getR() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double area(){
        return pi*r*r;
    }
    public double lenCirc(){
        return 2*pi*r;
    }



    public String toString(){
        return "Длина:"+lenCirc()+
                "Площадь:"+area();
    }
}

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(3.4,3.5,5);
        System.out.println(circle.toString());

    }
}
