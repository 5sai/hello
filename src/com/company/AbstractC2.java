package com.company;
//When we call Danger sub class base class constructer will be printed
abstract class AbstractC2 {
    AbstractC2(){
        System.out.println("Hay,This is Sai Kumar.Welcome to my World");
    }
    abstract void fun();
}
class Danger extends AbstractC2
{
    Danger(){
        System.out.println("Is this yout world?");
    }
    void fun(){
        System.out.println("I will Kill you.");
    }
}
class mnm
{
    public static void main(String[] args)
    {
        Danger obj=new Danger();
        obj.fun();
    }
}
