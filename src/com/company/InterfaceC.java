package com.company;



interface  InterfaceC {
    void  Aname(String Name);
    void Anumber(int Number);
    void Amount(double amount);

}
class   Anm implements InterfaceC
{
    String Name;
    int Number;
    double amount;
    public void Aname(String Name)
    {

        this.Number=Number;

    }

    @Override
    public void Anumber(int Number) {

    }

    public void Amount(double amount)
    {
        this.amount=amount;
    }

    public void report(){
        System.out.println("Transection successfully");
    }

    public void tostring(){
    System.out.println("AName:"+Name+"\n"+"ANumber:"+Number+"\n"+"Amount:"+amount);
}
}
class msm
{
    public static void main(String[] args)
    {
        Anm obj=new Anm();
        obj.Aname("Ram");
        obj.Anumber(2455423);
        obj.Amount(50000);
        obj.report();
        obj.tostring();
    }
}

