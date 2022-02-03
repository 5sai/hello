package com.company;

abstract class AbstractC3 {
     void fun(int a,int b){
         System.out.println(a*b);
    }
    void fun(){
        System.out.println("Hello world");
    }
}
class kmk extends AbstractC3
{
   void fun(){
        System.out.println("U r changed");
    }
}
class trt
{
    public static void main(String[] args)
    {
        AbstractC3 obj=new kmk();
        obj.fun(5,6);
        obj.fun();
    }
}

