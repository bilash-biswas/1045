#include<stdio.h>
int main()
{
    double a,b,c,x,y,z;
    scanf("%lf",&a);
    scanf("%lf",&b);
    scanf("%lf",&c);
    if(a>b &&a>c)
    {
        if(b>c)
        {
         x=a;y=b;z=c;
        }
        else
        {
            x=a;y=c;z=b;
        }
    }
    else if(b>a&&b>c)
    {
        if(a>c)
        {
            x=b;y=a;z=c;
        }
        else
        {
            x=b;y=c;z=a;
        }
    }
    else if(c>a&&c>b)
    {
        if(a>b)
        {
            x=c;y=a;z=b;
        }
        else
        {
            x=c;y=b;z=a;
        }
    }
    else
    {
        x=a;y=b;z=c;
    }
    if(x>=y+z)
    {
        printf("NAO FORMA TRIANGULO\n");
    }
    else if((x*x)==(y*y+z*z))
    {
        printf("TRIANGULO RETANGULO\n");
    }
   else if((x*x)>(y*y+z*z))
    {
        printf("TRIANGULO OBTUSANGULO\n");
    }
    else if((x*x)<(y*y+z*z))
    {
        printf("TRIANGULO ACUTANGULO\n");
    }
    if(x==y&&x==z&&y==z)
    {
        printf("TRIANGULO EQUILATERO\n");
    }
    else if((x==y&&x!=z)||(x==z&&x!=y)||(y==z&&y!=x)||(y==x&&y!=z)||(z==x&&z!=y)||(z==y&&z!=x))
    {
        printf("TRIANGULO ISOSCELES\n");
    }

    return 0;
}
