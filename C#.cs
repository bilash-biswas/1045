using System.IO;
using System;

class Program
{
    static void Main()
    {
        double a,b,c,x,y,z;
        var p = Console.ReadLine().Split();
        a = double.Parse(p[0]);
        b = double.Parse(p[1]);
        c = double.Parse(p[2]);
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
        if(a > c)
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
        Console.WriteLine("NAO FORMA TRIANGULO");
    }
    else if((x * x) == (y * y + z * z))
    {
        Console.WriteLine("TRIANGULO RETANGULO");
    }
   else if((x * x) > (y * y + z * z))
    {
        Console.WriteLine("TRIANGULO OBTUSANGULO");
    }
    else if((x * x) < (y * y + z * z))
    {
        Console.WriteLine("TRIANGULO ACUTANGULO");
    }
    if(x == y && x == z && y == z)
    {
        Console.WriteLine("TRIANGULO EQUILATERO");
    }
    else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x))
    {
        Console.WriteLine("TRIANGULO ISOSCELES");
    }
  }
}
