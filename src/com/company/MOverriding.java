package com.company;

class MOverriding {
     void A(){
        System.out.println("Hello");
    }
}
class Len extends MOverloading
{
     void A(){
    System.out.println("How");
    }
}
class Nen extends MOverloading
{
     void A(){
    System.out.println("Ram");
}
}
class gfg
{
    public static void main(String[] args)
    {
        MOverriding obj=new MOverriding();
        Len obj1=new Len();
        Nen obj2=new Nen();
        obj.A();
        obj1.A();
        obj2.A();

    }
}
