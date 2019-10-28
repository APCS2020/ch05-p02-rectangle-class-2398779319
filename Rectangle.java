package java;
public class Rectangle {
    private double length;
    private double width;
    private String color;

    public Rectangle(double l,double w,String c){
        this.length = l;
        this.width = w;
        this.color = c;
    }
    public double getlength(){
        return length;
    }
    public double getwidth(){
        return width;
    }
    public String getcolor(){
        return color;
    }
    public void setlength(double l){
        this.length = l;
    }
    public void setwidth(double w){
        this.width = w;
    }
    public void setcolor(String c){
        this.color = c;                                                                                               }
    public Rectangle(){
        this.color = "red";
        this.length = 1.0;
        this.width = 2.5;
    }
    public double getArea(){
        return length * width;
    }
}
