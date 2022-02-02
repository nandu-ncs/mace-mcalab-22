<?php
$conn= mysqli_connect('localhost', 'root', '', 'railway');
if (!$conn) {
    die('Connection error : ' . mysqli_connect_error());
}
if(isset($_POST['book'])) {
    $sql="insert into bookticket(name,address,trainno,trainname,journeydate,boardtime) values ('$_POST[name]','$_POST[address]',$_POST[trainno],'$_POST[trainname]','$_POST[journeydate]','$_POST[boardtime]')";
    $result= mysqli_query($conn, $sql);
    if($result) {
        echo "<script>alert('Details Added Successfully')</script>";
        echo "<script>window.location.href=window.location.href</script>";    
    }    
}
?>
<html>
<head>
    <title>Railway Ticket Reservation Management System</title>
    <style type="text/css">
      th {
        text-align: left;
    }
    span {
        color:  red;
    }
    input[type="text"],input[type="email"],input[type="date"],input[type="number"],input[type="time"],textarea {
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
    .row {
        display: grid;
        grid-template-columns: repeat(12, 1fr);
        grid-gap: 20px;
    }
    .col-md-5 {
        grid-column: span 5;
    }
    .col-md-7 {
        grid-column: span 7;
    }

</style>
<script type="text/javascript">
    function validate() {        
        if(!document.form.name.value.match(/^[a-zA-Z][A-Za-z\s]*[a-zA-Z]$/)) {
            alert("Name should contain alphabets only!");
            document.form.name.focus();
            return false;
        } 
    }
</script>
</head>
<body>
    <div class="row" style="margin-top: 50px;">
        <div class="col-md-5" style="display: block;border-right: solid;border-width: 1px;">
            <form method="post" name="form" action="" onsubmit="return(validate())">
                <table cellpadding="5px" cellspacing="5px"  align="center">
                    <tr>
                        <th colspan="2"><h1 align="center">Book Ticket</h1></th>
                    </tr>
                    <tr>
                        <th>Name</th>
                        <td><input type="text" name="name" required></td>
                    </tr>                    
                    <tr>
                        <th>Address</th>
                        <td><textarea name="address" rows="5" style="height: auto;border-style: inset;border-width: 2px;" required></textarea></td>
                    </tr>
                    <tr>
                        <th>Train Number</th>
                        <td><input type="number" name="trainno" required></td>
                    </tr>
                    <tr>
                        <th>Train Name</th>
                        <td><input type="text" name="trainname" required></td>
                    </tr>
                    <tr>
                        <th>Date of Journey</th>
                        <td><input type="date" name="journeydate" min="<?php echo date('Y-m-d')?>" required></td>
                    </tr>
                    <tr>
                        <th>Boarding Time</th>
                        <td><input type="time" name="boardtime" required></td>
                    </tr>
                    <tr>
                        <th colspan="2" style="text-align: center;">
                            <input type="submit" value="Book" name="book" style="background-color: lawngreen;">
                        </th>
                    </tr>
                </table>
            </form>
        </div>
        <div class="col-md-7" style="display: block;overflow-x: auto;">
            <table cellpadding="5px" cellspacing="5px"  align="center">
                <tr>
                    <th colspan="10"><h1 align="center">Booking Details</h1></th>
                </tr>
                <tr>
                    <th>#</th>
                    <th>Name</th>
                    <th>Train Number</th>
                    <th>Boarding Time</th>
                </tr>
                <?php 
                $n=1;
                $sql="select * from bookticket";
                $res= mysqli_query($conn, $sql);
                while($row=mysqli_fetch_assoc($res)) {
                    ?>
                    <tr>
                        <td><?php echo $n++?></td>
                        <td><?php echo $row['name']?></td>
                        <td><?php echo $row['trainno']?></td>
                        <td><?php echo $row['boardtime']?></td>
                    </tr>
                    <?php
                }
                ?>
            </table>
        </div>
    </div>
</body>
</html>