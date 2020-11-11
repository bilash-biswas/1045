import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a,b,c,x,y,z;
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();
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
        System.out.printf("NAO FORMA TRIANGULO\n");
    }
    else if((x * x) == (y * y + z * z))
    {
        System.out.printf("TRIANGULO RETANGULO\n");
    }
   else if((x * x) > (y * y + z * z))
    {
        System.out.printf("TRIANGULO OBTUSANGULO\n");
    }
    else if((x * x) < (y * y + z * z))
    {
        System.out.printf("TRIANGULO ACUTANGULO\n");
    }
    if(x == y && x == z && y == z)
    {
        System.out.printf("TRIANGULO EQUILATERO\n");
    }
    else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x))
    {
        System.out.printf("TRIANGULO ISOSCELES\n");
    }
  }
}
