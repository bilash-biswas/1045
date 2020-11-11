a = io.read("*n")
b = io.read("*n")
c = io.read("*n")
if (a > b and a > c) then
    if (b > c) then
        x = a
        y = b
        z = c
    else
        x = a
        y = c
        z = b
    end
elseif (b > a and b > c) then
    if (a > c) then
        x = b
        y = a
        z = c
    else
        x = b
        y = c
        z = a
    end
elseif (c > a and c > b) then
    if (a > b) then
        x = c
        y = a
        z = b
    else
        x = c
        y = b
        z = a
    end
else
    x = a
    y = b
    z = c
end
if (x >= y + z) then
    print("NAO FORMA TRIANGULO")
elseif ((x * x) == (y * y + z * z)) then
    print("TRIANGULO RETANGULO")
elseif ((x * x) > (y * y + z * z)) then
    print("TRIANGULO OBTUSANGULO")
elseif ((x * x) < (y * y + z * z)) then
    print("TRIANGULO ACUTANGULO")
end
if (x == y and x == z and y == z) then
    print("TRIANGULO EQUILATERO")
elseif ((x == y and x ~= z) or (x == z and x ~= y) or (y == z and y ~= x) or (y == x and y ~= z) or (z == x and z ~= y) or (z == y and z ~= x)) then
    print("TRIANGULO ISOSCELES")
end
