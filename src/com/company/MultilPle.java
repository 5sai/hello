package com.company;

interface lPle1 {
    void display1();
}
interface Multiple2
{
    void display2();
}
interface kinder extends lPle1,Multiple2
{
    /**
     *
     */

    void display1();
}
class kill implements kinder
{
    public void display1(){
        System.out.println("Hello world");
    }
    public void display2(){
        System.out.println("I am Sai Kumar");
    }
}
class mk
{
    public static void main(String[] args)
    {
        kill obj=new kill();
        obj.display1();
        obj.display2();
    }
}