<html>
<head>
    <title>Electricity Bill</title>
    <style type="text/css">
      th {
        text-align: left;
    }
    td {
        text-align: center;
    }
    span {
        color:  red;
    }
    input[type="text"],input[type="email"],input[type="date"],input[type="number"],textarea {
        width: 280px;
        height: 25px;
        border-radius: 5px;
    }
    select,input[type="date"] {
        width: 100%;
        height: 27px;
        border-radius: 5px;
    }
    input[type="submit"],input[type="reset"] {
        width: 100px;
        height: 35px;
        border-radius: 5px;
    }
    
</style>
</head>
<body>
    <form method="post" action="prog14back.php">
        <table cellpadding="5px" cellspacing="5px"  align="center">
            <tr>
                <th colspan="2"><h1 align="center">Electricty Consumption Details</h1></th>
            </tr>
            <tr>
                <th>Consumer Number</th>
                <td><input type="number" name="id"></td>
            </tr>
            <tr>
                <th>Consumer Name</th>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <th>Category</th>
                <td style="text-align: center;">
                    <input type="radio" name="cat" value="d" required="">Domestic&nbsp;
                    <input type="radio" name="cat" value="c" required="">Commercial                    
                </td>
            </tr>
            
            <tr>
                <th>Current Reading</th>
                <td><input type="number" name="cread"></td>
            </tr>
            <tr>
                <th>Previous Reading</th>
                <td><input type="number" name="pread"></td>
            </tr>
            <tr>
                <th colspan="2" style="text-align: center;">
                    <input type="submit" value="Submit" name="bill" style="background-color: lawngreen;">
                </th>
            </tr>
        </table>
    </form>
</body>
</html>