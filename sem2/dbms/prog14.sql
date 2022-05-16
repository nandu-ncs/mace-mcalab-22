declare
    a integer := 2;
    b integer := 3;
    c integer := 1;
    g integer;
begin
    g:= a;
    if g<b then
        g:= b;
    end if;
    if g<c then
        g:= c;
    end if;
    dbms_output.put_line(chr(10)||'Greater number = '||g);
end;
/