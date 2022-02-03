package com.company;
//final and static methods are used.
abstract class AbstractC4 {
    abstract void meth();
    final void fun(int a,int b){
        System.out.println((a*b));
    }
    static void kinder(){
        System.out.println("i am gonna kill you");
    }
}
class hgh extends AbstractC4
{
    public void meth(){
        System.out.println("Hello");
    }
    public static void main(String[] args)
    {
        AbstractC4 obj=new hgh();
        obj.meth();
        obj.fun(5,9);
        AbstractC4.kinder();
    }
}
