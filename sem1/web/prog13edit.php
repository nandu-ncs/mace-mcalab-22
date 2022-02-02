<?php
$conn= mysqli_connect('localhost', 'root', '', 'hospital');
if (!$conn) {
    die('Connection error : ' . mysqli_connect_error());
}
if(isset($_POST['update'])) {
    $sql="update patient set name='$_POST[name]',gender='$_POST[gender]',dob='$_POST[dob]',address='$_POST[address]',email='$_POST[email]',phone='$_POST[phone]',doctor='$_POST[dname]',addate='$_POST[addate]' where patientid=$_GET[id]";
    $result= mysqli_query($conn, $sql);
    if($result) {
        echo "<script>alert('Details updated Successfully')</script>";
        echo "<script>window.location.replace('prog13.php')</script>";    
    }
    
}
$sql="select * from patient where patientid=$_GET[id]";
$result= mysqli_query($conn,$sql);
$row= mysqli_fetch_assoc($result);
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
    <form method="post" action="">
        <table cellpadding="5px" cellspacing="5px"  align="center">
            <tr>
                <th colspan="2"><h1 align="center">Edit Patient Details</h1></th>
            </tr>
            <tr>
                <th>Name</th>
                <td><input type="text" name="name" value="<?php echo $row['name']?>"></td>
            </tr>
            <tr>
                <th>Gender</th>
                <td style="text-align: center;">
                    <input type="radio" name="gender" value="Male" required="" <?php if($row['gender']=='Male'){echo "checked";}?>>Male&nbsp;
                    <input type="radio" name="gender" value="Female" required="" <?php if($row['gender']=='Female'){echo "checked";}?>>Female&nbsp;
                    <input type="radio" name="gender" value="other" required="" <?php if($row['gender']=='Other'){echo "checked";}?>>Other                        
                </td>
            </tr>

            <tr>
                <th>Date of birth</th>
                <td><input type="date" name="dob" value="<?php echo $row['dob']?>"></td>
            </tr>
            <tr>
                <th>Address</th>
                <td><textarea name="address" rows="5" style="height: auto;border-style: inset;border-width: 2px;" ><?php echo $row['address']?></textarea></td>
            </tr>
            <tr>
                <th>Email</th>
                <td><input type="email" name="email" value="<?php echo $row['email']?>"></td>
            </tr>
            <tr>
                <th>Phone</th>
                <td><input type="text" name="phone" minlength="10" maxlength="10" value="<?php echo $row['phone']?>"></td>
            </tr>
            <tr>
                <th>Doctor</th>
                <td><input type="text" name="dname" value="<?php echo $row['doctor']?>"></td>
            </tr>
            <tr>
                <th>Admitted Date</th>
                <td><input type="date" name="addate" value="<?php echo $row['addate']?>"></td>
            </tr>
            <tr>
                <th colspan="2" style="text-align: center;">
                    <input type="submit" value=Update name="update" style="background-color: lawngreen;">
                </th>
            </tr>
        </table>
    </form>
</body>
</html>