<?php
$units=$_POST['cread']-$_POST['pread'];
if($_POST['cat']=='d') {
    if($units<=100) 
        $amt=$units*1;
    else if($units>100 && $units<=200)
        $amt=100*1+($units-100)*2.5;
    else if($units>200 && $units<=500)
        $amt=100*1+100*2.5+($units-200)*4;
    else
        $amt=100*1+100*2.5+300*4+($units-500)*4;
}
if($_POST['cat']=='c') {
    if($units<=100) 
        $amt=$units*2;
    else if($units>100 && $units<=200)
        $amt=100*2+($units-100)*4.5;
    else if($units>200 && $units<=500)
        $amt=100*2+100*4.5+($units-200)*6;
    else
        $amt=100*2+100*4.5+300*6+($units-500)*7;
}

?>
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

</style>
</head>
<body>
    <div style="border: inset;width: 350px;display: block;margin: auto;">
        <table cellpadding="5px" cellspacing="5px"  align="center">
            <tr>
                <th colspan="2"><h1 align="center">KSEB - Bill</h1></th>
            </tr>
            <tr>
                <th>Consumer Number : </th>
                <td><?php echo $_POST['id']?></td>
            </tr>
            <tr>
                <th>Consumer Name : </th>
                <td><?php echo $_POST['name']?></td>
            </tr>
            <tr>
                <th>Category : </th>
                <td><?php if($_POST['cat']=='d'){echo "Domestic";} else {echo "Commercial";}?></td>
            </tr>

            <tr>
                <th>Current Reading : </th>
                <td><?php echo $_POST['cread']?></td>
            </tr>
            <tr>
                <th>Previous Reading : </th>
                <td><?php echo $_POST['pread']?></td>
            </tr>
            <tr>
                <th>Unit Consumed : </th>
                <td><?php echo $units?></td>
            </tr>
            <tr>
                <th>Amount : </th>
                <td style="font-weight: bold;"><?php echo $amt?></td>
            </tr>
        </table>
    </div>
</body>
</html>