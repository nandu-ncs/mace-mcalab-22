declare 
    total_rows number(2);
begin
    update customers
    set salary = salary+5000;
    if sql%notfound then
        dbms_output.put_line('No customers updated');
    elsif sql%found then
        total_rows := sql%rowcount;
        dbms_output.put_line(total_rows|| ' customers updated');
    end if;
end;
/