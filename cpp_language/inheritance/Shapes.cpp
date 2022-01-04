#include<iostream>
using namespace std;
class Shape
{
    public :
    double ar,peri,a,b,c;
    virtual void display()=0;
    virtual void read()=0;
    virtual void perimeter()=0;
    virtual void area()=0;
};
class Rectangle : virtual public Shape
{
    public :
    void read()
    {
        cin>>a>>b;
    }
    void area()
    {
        ar = a*b;
    }
    void perimeter()
    {
        peri = 2*(a+b);
    }
    void display()
    {
        cout<<"Rectangle"<<endl<<ar<<endl<<peri<<endl;
    }
};
class Rhombus : virtual public Shape
{
    public :
    void read()
    {
        cin>>a>>b>>c;
    }
    void area()
    {
        ar=(b*c)/2;
    }
    void perimeter()
    {
        peri=4*a;
        cout<<peri <<endl;
    }
    void display()
    {
        cout<<"Rhombus"<<endl<<ar<<endl<<peri<<endl;
    }
};
class Square : public Rectangle ,public  Rhombus
{
    public :
    void read()
    {
        Rectangle :: read();
    }
    void area()
    {
        Rectangle :: area();
    }
    void perimeter()
    {
        Rhombus :: perimeter();
    }
    void display()
    {
        cout<<"Square"<<endl<<ar<<endl<<peri<<endl;
    }
};
int main()
{
    char cho;
    cin>>cho;
    Shape *ob;
    if(cho=='R' || cho == 'r')
    {
        Rhombus ob1;
        ob = &ob1;
        ob->read();
        ob->area();
        ob->perimeter();
        ob->display();
    }
    else if(cho=='H' || cho=='h')
    {
        Rectangle ob1;
        ob = &ob1;
        ob->read();
        ob->area();
        ob->perimeter();
        ob->display();
    }
    else if(cho=='S' || cho=='s')
    {
        Square ob1;
        ob = &ob1;
        ob->read();
        ob->area();
        ob->perimeter();
        ob->display();
    }
    
}