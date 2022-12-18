package pract_2.zd2;

class Ball{
    private double x =0.0;
    private double y = 0.0;

    Ball(double x,double y){
        this.x=x;
        this.y=y;
    }
    Ball(){}

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }

    public void move(double xDisp, double yDisp){
        this.x+=xDisp;
        this.y+=yDisp;
    }
    public String toString(){
        return "Точка х:"+x+"\n"+"Точка y"+"\n";
    }

}

public class testBall {
    public static void main(String[] args){
        Ball b = new Ball(1,2);
        b.toString();
        b.move(3,-6);
        b.toString();
    }
}
