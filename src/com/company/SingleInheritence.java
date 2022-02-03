package com.company;
class SingleInheritence {
    int a;
    int b;
    int c;
    public SingleInheritence(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void fun()
    {
        System.out.println(a*b);
        System.out.println(b*c);
    }
}
class anam extends SingleInheritence
{
    public anam(int a, int b, int c) {
        super(a, b, c);
    }
    void meth(){
        System.out.println(super.a*super.b*super.c);
    }
}
class tuff
{
    public static void main(String[] args)
    {
        anam obj=new anam(2,3,5);
        obj.fun();
        obj.meth();
    }
}