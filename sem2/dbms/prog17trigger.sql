create or replace trigger display_salary_changes
before delete or insert or update on customers 
for each row 
when (new.id > 0)
declare
    sal_diff number;
begin
    sal_diff := :new.salary - :old.salary;
    dbms_output.put_line(chr(10)||'Old salary : '||:old.salary);
    dbms_output.put_line('New salary : '||:new.salary);
    dbms_output.put_line('Salary Difference : '||sal_diff);
end;
/