## Program List

<ol type='1'>
<h3>SQL</h3>
<li>
Execute DDL statements
<ol type='a'>
<li>Create a table Student with fields (RollNo,Name,Course,Year).</li>
<li>Alter table.</li>
<li>Drop table.</li>
<li>Truncate table.</li>
</ol>
Write necessary
query statements.
</li>
<li>
Execute DML statements
<ol type='a'>
<li>Create table 
Employee (EmployeeId,Name,Department,salary) 

Also create another table 
Department (DepartmentId,DeptName,HeadOfDepartment)
<li>Insert minimum of 5 rows.</li>
<li>Set Primary Key and Foreign Key constraints.</li>
<li>Display the records.</li>
<li>Update a record.</li>
<li>Delete a record.</li>
</ol>
</li>
<li>Create a table and execute DCL statements (grant,revoke).</li>
<li>Create a table and execute TCL statements (commit,rollback,savepoint).</li>
<li>
Consider the CUSTOMERS table having the following records
<table>
<tr>
<th>ID</th>
<th>NAME</th>
<th>AGE</th>
<th>HOME-TOWN</th>
<th>SALARY</th>
</tr>
<tr>
<td>1</td>
<td>Ramesh</td>
<td>32</td>
<td>Ahmedabad</td>
<td>2000.00</td>
</tr>
<tr>
<td>2</td>
<td>Khilan</td>
<td>25</td>
<td>Delhi</td>
<td>1500.00</td>
</tr>
<tr>
<td>4</td>
<td>kaushik</td>
<td>23</td>
<td>Kota</td>
<td>2000.00</td>
</tr>
<tr>
<td>4</td>
<td>Chaitali</td>
<td>25</td>
<td>Mumbai</td>
<td>6500.00</td>
</tr>
<tr>
<td>5</td>
<td>Hardik</td>
<td>27</td>
<td>Bhopal</td>
<td>8500.00</td>
</tr>
<tr>
<td>6</td>
<td>Komal</td>
<td>22</td>
<td>MP</td>
<td>4500.00</td>
</tr>
<tr>
<td>7</td>
<td>Muffy</td>
<td>24</td>
<td>Indore</td>
<td>10000.00</td>
</tr>
<tr>
<td>8</td>
<td>Ramu</td>
<td>23</td>
<td>Delhi</td>
<td>6000.00</td>
</tr>
<tr>
<td>9</td>
<td>Rohit</td>
<td>24</td>
<td>Ahmedabad</td>
<td>5000.00</td>
</tr>
<tr>
<td>10</td>
<td>Shamli</td>
<td>23</td>
<td>Mumbai</td>
<td>10000.00</td>
</tr>
</table>
<ol type='a'>
<li>Display details of Customers whose ID is 4.(Simple select)</li>
<li>Display distinct home-town of customers.(DISTINCT)</li>
<li>Display total number of Salary of customers.(COUNT)</li>
</ol>
</li>
<li>
Consider we have an employee table created into the database with the following data:
<table>
<tr>
<th>ID</th>
<th>First_Name</th>
<th>Last_Name</th>
<th>Department</th>
<th>Location</th>
<th>Salary</th>
</tr>
<tr>
<td>1</td>
<td>Harshad</td>
<td>Kuwar</td>
<td>Marketing</td>
<td>Pune</td>
<td>10000</td>
</tr>
<tr>
<td>2</td>
<td>Anurag</td>
<td>Rajput</td>
<td>IT</td>
<td>Mumbai</td>
<td>20000</td>
</tr>
<tr>
<td>3</td>
<td>Chaitali</td>
<td>Tarle</td>
<td>IT</td>
<td>Chennai</td>
<td>30000</td>
</tr>
<tr>
<td>4</td>
<td>Pranjal</td>
<td>Patil</td>
<td>IT</td>
<td>Chennai</td>
<td>25000</td>
</tr>
<tr>
<td>5</td>
<td>Suraj</td>
<td>Tripathi</td>
<td>Marketing</td>
<td>Pune</td>
<td>15000</td>
</tr>
<tr>
<td>6</td>
<td>Roshni</td>
<td>Jadhav</td>
<td>Finance</td>
<td>Bangalore</td>
<td>20000</td>
</tr>
<tr>
<td>7</td>
<td>Sandhya</td>
<td>Jain</td>
<td>Finance</td>
<td>Bangalore</td>
<td>20000</td>
</tr>
</table>
<ol type='a'>
<li>Display details of employee from employee tables in which department of the employee is IT and location is Chennai.(Where,And)</li>
<li>Display details of employees from employee tables in which department of the employee is IT or location is Chennai.(Where,OR)</li>
<li>Display First_Name and Location number under the temporary column name &#39;EMP FN&#39; and ‘Address’, respectively.(AS)</li>
<li>List records of employees whose names start with “S”.(Like)</li>
<li>Add salary of employees for each city.(Groupby)</li>
<li>Show those Location whose total salary of employees is more than 10000. (Having)</li>
<li>Sort the records in the ascending order of the Employee names stored in the employee table.(Orderby)</li>
</ol>
</li>
<li>
Aggregate functions
<table>
<tr>
<th>StudentID</th>
<th>StudentName</th>
<th>Marks</th>
</tr>
<tr>
<td>1</td>
<td>Sanjay</td>
<td>64</td>
</tr>
<tr>
<td>2</td>
<td>Varun</td>
<td>72</td>
</tr>
<tr>
<td>3</td>
<td>Akash</td>
<td>45</td>
</tr>
<tr>
<td>4</td>
<td>Rohit</td>
<td>86</td>
</tr>
<tr>
<td>5</td>
<td>Anjali</td>
<td>92</td>
</tr>
<tr>
<td>6</td>
<td>Ammu</td>
<td>95</td>
</tr>
<tr>
<td>7</td>
<td>Rahul</td>
<td>80</td>
</tr>
<tr>
<td>8</td>
<td>Prathibha</td>
<td>62</td>
</tr>
<tr>
<td>9</td>
<td>Ravi</td>
<td>75</td>
</tr>
<tr>
<td>10</td>
<td>Pulkit</td>
<td>76</td>
</tr>
<tr>
</table>
<ol type='a'>
<li>Write a query to count the number of students scoring marks > 75 from the Students table.</li>
<li>Write a query to calculate the average marks of all students from the Students table.</li>
<li>Write a query to retrieve the minimum marks out of all students from the Students table.</li>
<li>Write a query to retrieve the maximum marks out of all studentsfrom the Students table.</li>
</ol>
</li>
<li>
Subquery<br>
Tables to be used:<br>
Sailors (sid:integer,sname:string,rating:integer,age:real)<br>
Boats (bid:integer,bname :string,color:string)<br>
Reserves (sid:integer,bid:integer,day:date)<br><br>
sailors
<table>
<tr>
<th>sid</th>
<th>sname</th>
<th>rating</th>
<th>age</th>
</tr>
<tr>
<td>22</td>
<td>Dustin</td>
<td>7</td>
<td>45.0</td>
</tr>
<tr>
<td>29</td>
<td>Brutus</td>
<td>1</td>
<td>33.0</td>
</tr>
<tr>
<td>31</td>
<td>Lubber</td>
<td>8</td>
<td>55.5</td>
</tr>
<tr>
<td>32</td>
<td>Andy</td>
<td>8</td>
<td>25.5</td>
</tr>
<tr>
<td>58</td>
<td>Rusty</td>
<td>10</td>
<td>35.0</td>
</tr>
<tr>
<td>64</td>
<td>Horatio</td>
<td>7</td>
<td>35.0</td>
</tr>
<tr>
<td>71</td>
<td>Zorba</td>
<td>10</td>
<td>16.0</td>
</tr>
<tr>
<td>74</td>
<td>Horatio</td>
<td>9</td>
<td>35.0</td>
</tr>
<tr>
<td>85</td>
<td>Art</td>
<td>3</td>
<td>25.5</td>
</tr>
<tr>
<td>95</td>
<td>Bob</td>
<td>3</td>
<td>63.5</td>
</tr>
</table>
<br>
reserves
<table>
<tr>
<th>sid</th>
<th>bid</th>
<th>day</th>
</tr>
<tr>
<td>22</td>
<td>101</td>
<td>10/10/98</td>
</tr>
<tr>
<td>22</td>
<td>102</td>
<td>10/10/98</td>
</tr>
<tr>
<td>22</td>
<td>103</td>
<td>10/8/98</td>
</tr>
<tr>
<td>22</td>
<td>104</td>
<td>10/7/98</td>
</tr>
<tr>
<td>31</td>
<td>102</td>
<td>11/10/98</td>
</tr>
<tr>
<td>31</td>
<td>103</td>
<td>11/6/98</td>
</tr>
<tr>
<td>31</td>
<td>104</td>
<td>11/12/98</td>
</tr>
<tr>
<td>64</td>
<td>101</td>
<td>9/5/98</td>
</tr>
<tr>
<td>64</td>
<td>102</td>
<td>9/8/98</td>
</tr>
<tr>
<td>74</td>
<td>103</td>
<td>9/8/98</td>
</tr>
</table>
<br>
boats
<table>
<tr>
<th>bid</th>
<th>bname</th>
<th>color</th>
</tr>
<tr>
<td>101</td>
<td>Interlake</td>
<td>blue</td>
</tr>
<tr>
<td>102</td>
<td>Interlake</td>
<td>red</td>
</tr>
<tr>
<td>103</td>
<td>Clipper</td>
<td>green</td>
</tr>
<tr>
<td>104</td>
<td>Marine</td>
<td>red</td>
</tr>
</table>
<br>
<ol type='a'>
<li>Create the tables.</li>
<li>Insert data.</li>
<li>Find disninct names of sailors.</li>
<li>Find all information of sailors who have reserved boat number 101.</li>
<li>Find names of sailors who have reserved at least one boat.</li>
<li>Find names of sailors who have reserved a red boat and list in the order of their age.</li>
<li>Find the ids and names of sailors who have reserved two different boats on the same day.</li>
</ol>
</li>
<li>
Union,Intersect and Except<br>
Using the same table
<ol type='a'>
<li>Find the ids of sailors who have reserved a red boat or a green boat.</li>
<li>Find the names of sailors who have reserved boat 103.</li>
<li>Find the name and the age of the youngest sailor.</li>
<li>Find the names of sailors who have reserved all boats.</li>
</ol>
</li>
<li>
Aggregation Operators<br>
Using the same table
<ol type='a'> 
<li>Find the name and the age of the youngest sailor.</li>
<li>Find the average age of sailors for each rating level.</li>
<li>Count the number of different sailor names.</li>
<li>Calculate the average age of all sailors.</li>
</ol>
</li>
<h3>PL/SQL</h3>
<li>Write a PL/SQL program to add two numbers.</li>
<li>Write a PL/SQL program to check whether a number is odd or even.</li>
<li>Write a PL/SQL program to find factorial of a number.</li>
<li>Write a PL/SQL program to find greatest of 3 numbers.
</li>
<li>Write a PL/SQL procedure to find maximum of two values.
</li>
<li>Write a PL/SQL procedure to compute square of a given value.</li>
<li>Execution of trigger.</li>
<li>Execution of cursor.</li>
<h3>MongoDB</h3>
<li>
Designing Databases using NoSQL
<ol type='a'>
<li>Create database Employee and Make Collection With name "EMPL" (Empno,Name,Salary,role).</li>
<li>Insert Records Into EMPL Collection(10 records).</li>
<li>Display Data in Proper Format.</li>
</ol>
</li>
<li>
Designing Databases using NoSQL
<ol type='a'>
<li>Create a database movie and make collection with name “MovieDetails”(Title,Writer,Year,Actor).</li>
<li>Insert Records Into MovieDetails Collection(10 records).</li>
<li>Display Data in Proper Format.</li>
</ol>
</li>
<li>
Performing CRUD operations<br>
Use Employee database
<ol type='a'>
<li>Find Document From the EMPL collection where name begins with S.</li>
<li>Find Document From the EMPL collection where name ends with K.</li>
<li>Find Document From the EMPL collection where name has S in any position.</li>
<li>Update Salary Of Employee where Name is "ST" by +8000.</li>
<li>Update Salary Of All Employee by giving an increment of +4000 each.</li>
<li>Add a New Field remark to document with name "RS" set Remark as WC.</li>
</ol>
</li>
<li>Program to create users and roles.</li>
<li>
<br>

```json
[
    { 
        "name":"Krish","age":35,"gender":"M","exp":10,
        "subjects":[
            "DS",
            "C",
            "OS"
        ],
        "type":"Full Time","qualification":"M.Tech" 
    },
    { 
        "name":"Manoj","age":38,"gender":"M","exp":12,
        "subjects":[
            "JAVA",
            "DBMS"
        ],
        "type":"Full Time", "qualification":"Ph.D"
    },
    { 
        "name":"Anush","age":32,"gender":"F","exp":8,
        "subjects":[
            "C",
            "CPP"
        ],
        "type":"Part Time","qualification":"M.Tech"
    },
    { 
        "name":"Suresh","age":40,"gender":"M","exp":9,
        "subjects":[
            "JAVA",
            "DBMS",
            "NETWORKING"
        ],
        "type":"Full Time", "qualification":"Ph.D"
    },
    { 
        "name":"Rajesh","age":35,"gender":"M","exp":7,
        "subjects":[
            "DS",
            "C",
            "OS"
        ],

        "type":"Full Time","qualification":"M.Tech" 
    },
    { 
        "name":"Mani","age":38,"gender":"F","exp":10,
        "subjects":[
            "JAVA",
            "DBMS",
            "OS"
        ],
        "type":"Part Time", "qualification":"Ph.D"
    },
    { 
        "name":"Sivani","age":32,"gender":"F","exp":8,
        "subjects":[
            "C",
            "CPP",
            "MATHS"
        ],
        "type":"Part Time","qualification":"M.Tech" 
    },
    { 
        "name":"Nagesh","age":39,"gender":"M","exp":11,
        "subjects":[
            "JAVA",
            "DBMS",
            "NETWORKING"
        ],
        "type":"Full Time", "qualification":"Ph.D"
    },
    { 
        "name":"Nagesh","age":35,"gender":"M","exp":9,
        "subjects":[
            "JAVA",
            ".Net",
            "NETWORKING"
        ],
        "type":"Full Time", "qualification":"Ph.D"
    },
    { 
        "name":"Latha","age":40,"gender":"F","exp":13,
        "subjects":[
            "MATHS"
        ],
        "type":"Full Time", "qualification":"Ph.D"
    }
]
```
<ol type='a'>
<li>Get the details of all the faculty.</li>
<li>Get the count of all faculty members.</li>
<li>Get all the faculty members whose qualification is “Ph.D”.</li>
<li>Get all the faculty members whose experience is between 8 to 12 years.</li>
<li>Get all the faculty members who teach “MATHS” or “NETWORKING”.</li>
<li>Get all the faculty members who teach “MATHS” and whose age is more than 30 years and qualification must be “Ph.D”.</li>
<li>Get all the faculty members who are working part-time or who teach “JAVA”.</li>
<li>Delete all faculty members whose age is more than 55 years.</li>
<li>Get the name, qualification and exp of all faculty members and display the same in ascending order of exp.</li>
<li>Sort the faculty details by their age (descending order) and get the details of the first five faculty members only.</li>
</li>
</ol>