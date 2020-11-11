#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main()
{
    double a,b,c,x,y,z;
    cin>>a;
    cin>>b;
    cin>>c;
    if(a > b && a > c)
    {
        if(b > c)
        {
         x = a;
         y = b;
         z = c;
        }
        else
        {
            x = a;
            y = c;
            z = b;
        }
    }
    else if(b > a && b > c)
    {
        if(a>c)
        {
            x = b;
            y = a;
            z = c;
        }
        else
        {
            x = b;
            y = c;
            z = a;
        }
    }
    else if(c > a && c > b)
    {
        if(a > b)
        {
            x = c; 
            y = a;
            z = b;
        }
        else
        {
            x = c;
            y = b;
            z = a;
        }
    }
    else
    {
        x = a;
        y = b;
        z = c;
    }
    if(x >= y + z)
    {
        cout<<"NAO FORMA TRIANGULO"<<endl;
    }
    else if((x * x) == (y * y + z * z))
    {
        cout<<"TRIANGULO RETANGULO"<<endl;
    }
    else if((x * x) > (y * y + z * z))
    {
        cout<<"TRIANGULO OBTUSANGULO"<<endl;
    }
    else if((x * x) < (y * y + z * z))
    {
        cout<<"TRIANGULO ACUTANGULO"<<endl;
    }
    if(x == y && x == z && y == z)
    {
        cout<<"TRIANGULO EQUILATERO"<<endl;
    }
    else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x))
    {
        cout<<"TRIANGULO ISOSCELES"<<endl;
    }
    return 0;
}
