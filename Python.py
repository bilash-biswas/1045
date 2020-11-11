x,y,z=input().split()
a=float(x)
b=float(y)
c=float(z)
if a>b and a>c:
    A=a
    B=b
    C=c
elif b>c and b>a:
    A=b
    B=c
    C=a
else:
    A=c
    B=b
    C=a
if A>=B+C:
    print("NAO FORMA TRIANGULO")
elif A*A == B*B+C*C:
    print("TRIANGULO RETANGULO")
elif A*A > B*B+C*C:
    print("TRIANGULO OBTUSANGULO")
elif A*A < B*B+C*C:
    print("TRIANGULO ACUTANGULO")
if A==B==C:
    print("TRIANGULO EQUILATERO")
elif (A==B and A!=C)or(B==A and B!=C)or(C==A and C!=B)or(B==C and B!=A)or(A==C and A!=B)or(C==B and C!=A):
    print("TRIANGULO ISOSCELES")
