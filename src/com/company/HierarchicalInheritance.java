package com.company;

public class HierarchicalInheritance {
    int a;
    String b;

    public HierarchicalInheritance(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public void h1(){
        System.out.println("This is Parent");
    }
    public void St(){
        System.out.println(a+b);
    }
}
class Child1 extends HierarchicalInheritance
{

    public Child1(int a, String b) {
        super(a, b);
    }
    public void Ch1(int d){
        System.out.println(a*d);
        System.out.println(b);
    }
}
class child2 extends HierarchicalInheritance
{

    public child2(int a, String b) {
        super(a, b);
    }
    public void ch2(String d){
        System.out.println(a+b+d);
    }
}
class ef
{
    public static void main(String[] args)
    {
        child2 obj=new child2(5,"Hai");
        obj.St();
        obj.ch2("Sindhu");
        Child1 obj2=new Child1(6,"How");
        obj2.St();
        obj2.Ch1(6);
    }
}