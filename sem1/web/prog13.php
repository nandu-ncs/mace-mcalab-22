<?php
$conn= mysqli_connect('localhost', 'root', '', 'hospital');
if (!$conn) {
    die('Connection error : ' . mysqli_connect_error());
}
if(isset($_POST['add'])) {
    $sql="insert into patient(name,gender,dob,address,email,phone,doctor,addate) values ('$_POST[name]','$_POST[gender]','$_POST[dob]','$_POST[address]','$_POST[email]','$_POST[phone]','$_POST[dname]','$_POST[addate]')";
    $result= mysqli_query($conn, $sql);
    if($result) {
        echo "<script>alert('Details Added Successfully')</script>";
        echo "<script>window.location.href=window.location.href</script>";    
    }
    
}
?>
<html>
<head>
    <title>Hospital In-Patient Management System</title>
    <style type="text/css">
      th {
        text-align: left;
    }
    span {
        color:  red;
    }
    input[type="text"],input[type="email"],input[type="date"],input[type="number"],textarea {
        width: 220px;
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
    <div style="display: block;float: left;width: 27%;border-right: solid;border-width: 1px;">
        <form method="post" action="">
            <table cellpadding="5px" cellspacing="5px"  align="center">
                <tr>
                    <th colspan="2"><h1 align="center">Add Patient</h1></th>
                </tr>
                <tr>
                    <th>Name</th>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <th>Gender</th>
                    <td style="text-align: center;">
                        <input type="radio" name="gender" value="Male" required="">Male&nbsp;
                        <input type="radio" name="gender" value="Female" required="">Female&nbsp;
                        <input type="radio" name="gender" value="other" required="">Other                        
                    </td>
                </tr>
                
                <tr>
                    <th>Date of birth</th>
                    <td><input type="date" name="dob"></td>
                </tr>
                <tr>
                    <th>Address</th>
                    <td><textarea name="address" rows="5" style="height: auto;border-style: inset;border-width: 2px;"></textarea></td>
                </tr>
                <tr>
                    <th>Email</th>
                    <td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <th>Phone</th>
                    <td><input type="text" name="phone" minlength="10" maxlength="10"></td>
                </tr>
                <tr>
                    <th>Doctor</th>
                    <td><input type="text" name="dname"></td>
                </tr>
                <tr>
                    <th>Admitted Date</th>
                    <td><input type="date" name="addate"></td>
                </tr>
                <tr>
                    <th colspan="2" style="text-align: center;">
                        <input type="submit" value="Submit" name="add" style="background-color: lawngreen;">
                    </th>
                </tr>
            </table>
        </form>
    </div>
    <div style="display: block;float: right;width: 72%;overflow-x: auto;">
        <table cellpadding="5px" cellspacing="5px"  align="center">
            <tr>
                <th colspan="10"><h1 align="center">Patient Details</h1></th>
            </tr>
            <tr>
                <th>#</th>
                <th>Name</th>
                <th>Gender</th>
                <th style="min-width: 80px;">Date of Birth</th>
                <th>Address</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Doctor</th>
                <th style="min-width: 80px;">Admitted Date</th>
                <th style="min-width: 100px;">Action</th>
            </tr>
            <?php 
            $n=1;
            $sql="select * from patient";
            $res= mysqli_query($conn, $sql);
            while($row=mysqli_fetch_assoc($res)) {
                ?>
                <tr>
                    <td><?php echo $n++?></td>
                    <td><?php echo $row['name']?></td>
                    <td><?php echo $row['gender']?></td>
                    <td><?php echo $row['dob']?></td>
                    <td><?php echo $row['address']?></td>
                    <td><?php echo $row['email']?></td>
                    <td><?php echo $row['phone']?></td>
                    <td><?php echo $row['doctor']?></td>
                    <td><?php echo $row['addate']?></td>
                    <td>
                        <button style="background-color: deepskyblue;" onclick="window.location.href='prog13edit.php?id=<?php echo $row['patientid']?>'">Edit</button>
                        <button style="background-color: orangered;" onclick="window.location.href='prog13delete.php?id=<?php echo $row['patientid']?>'">Delete</button>
                    </td>
                </tr>
                <?php
            }
            ?>
        </table>
    </div>
</body>
</html>