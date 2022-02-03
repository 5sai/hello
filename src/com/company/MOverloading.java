package com.company;

public class MOverloading {
    static int a(int a,int b){
        return a*b;
    }
    static double a(int a,double b){
        return a*b;
    }
}
class result
{
    public static void main(String[] args)
    {
        MOverloading k=new MOverloading();
        System.out.println(k.a(5,6));
        System.out.println(k.a(2,3.654));
    }
}
