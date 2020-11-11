var
a,b,c,x,y,z : double;
begin
    read(a);
    read(b);
    read(c);
   begin
   if((a > b) and (a > c))then
   begin
      if(b > c)then
      begin
         x := a;
         y := b;
         z := c;
      end
      else
      begin
         x := a;
         y := c;
         z := b;
      end
   end
   else if((b > a) and (b > c))then
   begin
      if(a > c)then
      begin
         x := b;
         y := a;
         z := c;
      end
      else
      begin
         x := b;
         y := c;
         z := a;
      end
   end
   else if((c > a) and (c > b))then
   begin
      if(a > b)then
      begin
         x := c;
         y := a;
         z := b;
      end
      else
      begin
         x := c;
         y := b;
         z := a;
      end
   end
   else
   begin
      x := a;
      y := b;
      z := c;
   end
   end;
   begin
   if(x >= y + z)then
   begin
      writeln('NAO FORMA TRIANGULO');
   end
   else if((x * x) = (y * y + z * z))then
   begin
      writeln('TRIANGULO RETANGULO');
   end
   else if((x * x) > (y * y + z * z))then
   begin
      writeln('TRIANGULO OBTUSANGULO');
   end
   else if((x * x) < (y * y + z * z))then
   begin
      writeln('TRIANGULO ACUTANGULO');
   end;
   if((x = y) and (x = z) and (y = z))then
   begin
      writeln('TRIANGULO EQUILATERO');
   end
   else if(((x = y) and (x <> z)) or ((x = z) and (x <> y)) or ((y = z) and (y <> x)) or ((y = x) and (y <> z)) or ((z = x) and (z <> y)) or ((z = y) and (z <> x)))then
   begin
      writeln('TRIANGULO ISOSCELES');
   end
   end
 end.
