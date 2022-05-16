declare
    a integer := 5;
    b integer := 3;
    c integer;
begin
    c := a+b;
    dbms_output.put_line(chr(10)||a||' + '||b||' = '||c);
end;
/