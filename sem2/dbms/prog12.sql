declare
    a integer := 5;
begin
    if mod(a,2) = 0 then
        dbms_output.put_line(chr(10)||'Even');
    else
        dbms_output.put_line(chr(10)||'Odd');
    end if;
end;
/