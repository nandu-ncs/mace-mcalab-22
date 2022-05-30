declare
    c_id customers.id%type;
    c_name customers.name%type;
    c_addr customers.address%type;
    cursor c_customers is
        select id,name,address from customers;
begin
    open c_customers;
    loop
        fetch c_customers into c_id, c_name, c_addr;
        exit when c_customers%notfound;
        dbms_output.put_line(c_id||' '||c_name||' '||c_addr);
    end loop;
    close c_customers;
end;
/