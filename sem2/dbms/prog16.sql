declare
    a number; 
    b number; 
procedure square(x in number, y out number) is 
begin
    y:= x*x;
end;   
begin 
    a:= 5;  
    square(a, b); 
    dbms_output.put_line(chr(10)||'Square = ' || b); 
end; 
/