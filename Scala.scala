import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    var a = input.nextDouble()
    var b = input.nextDouble()
    var c = input.nextDouble()
    if(a > b && a > c)
    {
        if(b > c)
        {
         var x = a
         var y = b
         var z = c
          if(x >= y + z)
    {
        println("NAO FORMA TRIANGULO")
    }
    else if((x * x) == (y * y + z * z))
    {
        println("TRIANGULO RETANGULO")
    }
   else if((x * x) > (y * y + z * z))
    {
        println("TRIANGULO OBTUSANGULO")
    }
    else if((x * x) < (y * y + z * z))
    {
        println("TRIANGULO ACUTANGULO")
    }
    if(x == y && x == z && y == z)
    {
        println("TRIANGULO EQUILATERO")
    }
    else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x))
    {
        println("TRIANGULO ISOSCELES")
    }
        }
        else
        {
            var x = a
            var y = c
            var z = b
            if(x >= y + z)
    {
        println("NAO FORMA TRIANGULO")
    }
    else if((x * x) == (y * y + z * z))
    {
        println("TRIANGULO RETANGULO")
    }
   else if((x * x) > (y * y + z * z))
    {
        println("TRIANGULO OBTUSANGULO")
    }
    else if((x * x) < (y * y + z * z))
    {
        println("TRIANGULO ACUTANGULO")
    }
    if(x == y && x == z && y == z)
    {
        println("TRIANGULO EQUILATERO")
    }
    else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x))
    {
        println("TRIANGULO ISOSCELES")
    }
        }
    }
    else if(b > a && b > c)
    {
        if(a > c)
        {
            var x = b
            var y = a
            var z = c
             if(x >= y + z)
    {
        println("NAO FORMA TRIANGULO")
    }
    else if((x * x) == (y * y +z * z))
    {
        println("TRIANGULO RETANGULO")
    }
   else if((x * x) > (y * y + z * z))
    {
        println("TRIANGULO OBTUSANGULO")
    }
    else if((x * x) < (y * y + z * z))
    {
        println("TRIANGULO ACUTANGULO")
    }
    if(x == y && x == z && y == z)
    {
        println("TRIANGULO EQUILATERO")
    }
    else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x))
    {
        println("TRIANGULO ISOSCELES")
    }
        }
        else
        {
            var x = b
            var y = c
            var z = a
             if(x >= y + z)
    {
        println("NAO FORMA TRIANGULO")
    }
    else if((x * x) == (y * y + z * z))
    {
        println("TRIANGULO RETANGULO")
    }
   else if((x * x) > (y * y + z * z))
    {
        println("TRIANGULO OBTUSANGULO")
    }
    else if((x * x) < (y * y + z * z))
    {
        println("TRIANGULO ACUTANGULO")
    }
    if(x == y && x == z && y == z)
    {
        println("TRIANGULO EQUILATERO")
    }
    else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x))
    {
        println("TRIANGULO ISOSCELES")
    }
        }
    }
    else if(c > a && c > b)
    {
        if(a > b)
        {
            var x = c
            var y = a
            var z = b
             if(x >= y + z)
    {
        println("NAO FORMA TRIANGULO")
    }
    else if((x * x) == (y * y + z * z))
    {
        println("TRIANGULO RETANGULO")
    }
   else if((x * x) > (y * y + z * z))
    {
        println("TRIANGULO OBTUSANGULO")
    }
    else if((x * x) < (y * y + z * z))
    {
        println("TRIANGULO ACUTANGULO")
    }
    if(x == y && x == z && y == z)
    {
        println("TRIANGULO EQUILATERO")
    }
    else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x))
    {
        println("TRIANGULO ISOSCELES")
    }
        }
        else
        {
            var x = c
            var y = b
            var z = a
             if(x >= y + z)
    {
        println("NAO FORMA TRIANGULO")
    }
    else if((x * x) == (y * y + z * z))
    {
        println("TRIANGULO RETANGULO")
    }
   else if((x * x) > (y * y + z * z))
    {
        println("TRIANGULO OBTUSANGULO")
    }
    else if((x * x) < (y * y + z * z))
    {
        println("TRIANGULO ACUTANGULO")
    }
    if(x == y && x == z && y == z)
    {
        println("TRIANGULO EQUILATERO")
    }
    else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x))
    {
        println("TRIANGULO ISOSCELES")
    }
        }
    }
    else
    {
        var x = a
        var y = b
        var z = c
         if(x >= y + z)
    {
        println("NAO FORMA TRIANGULO")
    }
    else if((x * x) == (y * y + z * z))
    {
        println("TRIANGULO RETANGULO")
    }
   else if((x * x) > (y * y + z * z))
    {
        println("TRIANGULO OBTUSANGULO")
    }
    else if((x * x) < (y * y + z * z))
    {
        println("TRIANGULO ACUTANGULO")
    }
    if(x == y && x == z && y == z)
    {
        println("TRIANGULO EQUILATERO")
    }
    else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x))
    {
        println("TRIANGULO ISOSCELES")
    }
   }
  }
}

 
