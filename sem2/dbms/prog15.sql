declare
    a number; 
    b number; 
    c number;
procedure max(x in number, y in number, z out number) is 
begin
    if x > y then 
    z:= x; 
    else 
    z:= y; 
    end if; 
end;   
begin 
    a:= 5; 
    b:= 3; 
    max(a, b, c); 
    dbms_output.put_line(chr(10)||'Maximum = ' || c); 
end; 
/