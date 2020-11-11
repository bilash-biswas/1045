a,b,c=gets().chomp().split(' ');
a=a.to_f
b=b.to_f
c=c.to_f
if a>b &&a>c
    if b>c
     x=a
     y=b
     z=c
    else
        x=a
        y=c
        z=b
    end
elsif b>a&&b>c
    if a>c
        x=b
        y=a
        z=c
    else
        x=b
        y=c
        z=a
    end
elsif c>a&&c>b
    if a>b
        x=c
        y=a
        z=b
    else
        x=c
        y=b
        z=a
    end
else
    x=a
    y=b
    z=c
end
if x>=y+z
    printf("NAO FORMA TRIANGULO\n");
elsif (x*x)==(y*y+z*z)
    printf("TRIANGULO RETANGULO\n");
elsif (x*x)>(y*y+z*z)
    printf("TRIANGULO OBTUSANGULO\n");
elsif (x*x)<(y*y+z*z)
    printf("TRIANGULO ACUTANGULO\n");
end
if x==y&&x==z&&y==z
    printf("TRIANGULO EQUILATERO\n");
elsif (x==y&&x!=z)||(x==z&&x!=y)||(y==z&&y!=x)||(y==x&&y!=z)||(z==x&&z!=y)||(z==y&&z!=x)
    printf("TRIANGULO ISOSCELES\n");
end
