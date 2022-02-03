package com.company;

abstract class AbstractC {
    String color;
    public AbstractC(String color){
        this.color=color;
    }
    abstract double area();
    public abstract String toString();
    public String getColor(){
        return color;
    }
}
class circle extends AbstractC
{
    double radius;
    public circle(String color,double radius){
        super(color);
        this.radius=radius;
    }
    @Override
    double area() {
        return (3.14*radius*radius);
    }

    @Override
    public String toString() {
        return ("radius"+" "+super.getColor()+" "+area());
    }
}
class rectangle extends AbstractC
{
    double length;
    double width;
    public rectangle(String color,double length,double width)
    {
        super(color);
        this.length=length;
        this.width=width;
    }

    @Override
    double area() {
        return (length*width);
    }

    @Override
    public String toString() {
        return (super.getColor()+" "+area());
    }
}
class mgm
{
    public static void main(String[] args)
    {
        AbstractC a;
        a = new circle("Red",3.25556);
        System.out.println(a.toString());
        a = new rectangle("Green",2.58,3.54);
        System.out.println(a.toString());
    }
}
