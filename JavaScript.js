var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines = input.split(' ');
var a = parseFloat(lines.shift());
var b = parseFloat(lines.shift()); 
var c = parseFloat(lines.shift());
    var x,y,z;
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
        console.log("NAO FORMA TRIANGULO");
    }
    else if((x * x) == (y * y + z * z))
    {
        console.log("TRIANGULO RETANGULO");
    }
   else if((x * x) > (y * y + z * z))
    {
        console.log("TRIANGULO OBTUSANGULO");
    }
    else if((x * x) < (y * y + z * z))
    {
        console.log("TRIANGULO ACUTANGULO");
    }
    if(x == y && x == z && y == z)
    {
        console.log("TRIANGULO EQUILATERO");
    }
    else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x))
    { 
        console.log("TRIANGULO ISOSCELES");
    }
