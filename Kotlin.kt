import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    val x:Double
    val y:Double
    val z:Double
    var a = read.nextDouble()
    var b = read.nextDouble()
    var c = read.nextDouble()
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
        println("NAO FORMA TRIANGULO");
    }
    else if((x * x) == (y * y + z * z))
    {
        println("TRIANGULO RETANGULO");
    }
   else if((x * x) > (y * y + z * z))
    {
        println("TRIANGULO OBTUSANGULO");
    }
    else if((x * x) < (y * y + z * z))
    {
        println("TRIANGULO ACUTANGULO");
    }
    if(x == y && x == z && y == z)
    {
        println("TRIANGULO EQUILATERO");
    }
    else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x))
    {
        println("TRIANGULO ISOSCELES");
    }
}
