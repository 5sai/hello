package com.company;

public class MultipleInheritence {
    int a;
    String b;
    int d;
    public MultipleInheritence(int a, String b, int d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }
    public void Base(){
        System.out.println(a*d+b);
    }
}
class mm1 extends MultipleInheritence
{
    public mm1(int a, String b, int d) {
        super(a, b, d);
    }
    public void Base1(){

        System.out.println(a*d+b);
    }
}
class m2 extends mm1
{

    String cas;

    public m2(int a, String b, int d, String cas) {
        super(a, b, d);
        this.cas = cas;
    }


    public void Base2() {

        System.out.println(a*d+b+cas);
    }
}
class ede
{
    public static void main(String[] args)
    {
        m2 obj=new m2(5,"Hello",8,"Sai");
        obj.Base2();
        obj.Base1();
        obj.Base();

    }
}
