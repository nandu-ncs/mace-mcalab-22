<?php
$conn= mysqli_connect('localhost', 'root', '', 'art');
if (!$conn) {
    die('Connection error : ' . mysqli_connect_error());
}
if(isset($_POST['add1'])) {
    $sql="insert into artwork(name,cdate,type) values ('$_POST[name]','$_POST[cdate]','$_POST[type]')";
    $result= mysqli_query($conn, $sql);
    if($result) {
        echo "<script>alert('Details Added Successfully')</script>";
        echo "<script>window.location.href=window.location.href</script>";    
    }    
}
if(isset($_POST['add2'])) {
    $sql="insert into artist(name,exp,category) values ('$_POST[name]',$_POST[exp],'$_POST[category]')";
    $result= mysqli_query($conn, $sql);
    if($result) {
        echo "<script>alert('Details Added Successfully')</script>";
        echo "<script>window.location.href=window.location.href</script>";    
    }    
}
if(isset($_POST['add3'])) {
    $sql="insert into customer(name,address,amount) values ('$_POST[name]','$_POST[address]',$_POST[amount])";
    $result= mysqli_query($conn, $sql);
    if($result) {
        echo "<script>alert('Details Added Successfully')</script>";
        echo "<script>window.location.href=window.location.href</script>";    
    }    
}
?>
<html>
<head>
    <title>Art Gallery Management System</title>
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
    function validate1() {        
        if(!document.form1.name.value.match(/^[a-zA-Z][A-Za-z\s]*[a-zA-Z]$/)) {
            alert("Name should contain alphabets only!");
            document.form1.name.focus();
            return false;
        } 
        if(!document.form1.type.value.match(/^[a-zA-Z][A-Za-z\s]*[a-zA-Z]$/)) {
            alert("Type should contain alphabets only!");
            document.form1.type.focus();
            return false;
        } 
    }
    function validate2() {        
        if(!document.form2.name.value.match(/^[a-zA-Z][A-Za-z\s]*[a-zA-Z]$/)) {
            alert("Name should contain alphabets only!");
            document.form2.name.focus();
            return false;
        } 
        if(!document.form2.category.value.match(/^[a-zA-Z][A-Za-z\s]*[a-zA-Z]$/)) {
            alert("Category should contain alphabets only!");
            document.form2.category.focus();
            return false;
        } 
    }
    function validate3() {        
        if(!document.form3.name.value.match(/^[a-zA-Z][A-Za-z\s]*[a-zA-Z]$/)) {
            alert("Name should contain alphabets only!");
            document.form3.name.focus();
            return false;
        }  
    }
</script>
</head>
<body>
    <div class="row">
        <div class="col-md-5" style="display: block;border-right: solid;border-width: 1px;">
            <form method="post" name="form1" action="" onsubmit="return(validate1())">
                <table cellpadding="5px" cellspacing="5px"  align="center">
                    <tr>
                        <th colspan="2"><h1 align="center">Add ArtWork</h1></th>
                    </tr>
                    <tr>
                        <th>Name</th>
                        <td><input type="text" name="name" required></td>
                    </tr>
                    <tr>
                        <th>Created Date</th>
                        <td><input type="date" name="cdate" required></td>
                    </tr>
                    <tr>
                        <th>Type</th>
                        <td><input type="text" name="type" required></td>
                    </tr>
                    <tr>
                        <th colspan="2" style="text-align: center;">
                            <input type="submit" value="Add" name="add1" style="background-color: lawngreen;">
                        </th>
                    </tr>
                </table>
            </form>
        </div>
        <div class="col-md-7" style="display: block;overflow-x: auto;">
            <table cellpadding="5px" cellspacing="5px"  align="center">
                <tr>
                    <th colspan="10"><h1 align="center">ArtWork Details</h1></th>
                </tr>
                <tr>
                    <th colspan="5">
                        <?php
                        $sql="select * from artwork";
                        $res= mysqli_query($conn, $sql);
                        ?> 
                        <p>No: of artworks : <?php echo mysqli_num_rows($res);?></p>                   
                    </th>
                </tr>
                <tr>
                    <th>#</th>
                    <th>Artwork Id</th>
                    <th>Name</th>
                    <th>Created Date</th>
                    <th>Type</th>
                </tr>
                <?php 
                $n=1;
                while($row=mysqli_fetch_assoc($res)) {
                    ?>
                    <tr>
                        <td><?php echo $n++?></td>
                        <td><?php echo $row['artid']?></td>
                        <td><?php echo $row['name']?></td>
                        <td><?php echo $row['cdate']?></td>
                        <td><?php echo $row['type']?></td>
                    </tr>
                    <?php
                }
                ?>
            </table>
        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col-md-5" style="display: block;border-right: solid;border-width: 1px;">
            <form method="post" name="form2" action="" onsubmit="return(validate2())">
                <table cellpadding="5px" cellspacing="5px"  align="center">
                    <tr>
                        <th colspan="2"><h1 align="center">Add Artist</h1></th>
                    </tr>
                    <tr>
                        <th>Name</th>
                        <td><input type="text" name="name" required></td>
                    </tr>
                    <tr>
                        <th>Experiance</th>
                        <td><input type="number" name="exp" required></td>
                    </tr>
                    <tr>
                        <th>Category</th>
                        <td><input type="text" name="category" required></td>
                    </tr>
                    <tr>
                        <th colspan="2" style="text-align: center;">
                            <input type="submit" value="Add" name="add2" style="background-color: lawngreen;">
                        </th>
                    </tr>
                </table>
            </form>
        </div>
        <div class="col-md-7" style="display: block;overflow-x: auto;">
            <table cellpadding="5px" cellspacing="5px"  align="center">
                <tr>
                    <th colspan="10"><h1 align="center">Artist Details</h1></th>
                </tr>
                <tr>
                    <th colspan="5">
                        <?php
                        $sql="select * from artist";
                        $res= mysqli_query($conn, $sql);
                        ?>      
                        <p>No: of artists : <?php echo mysqli_num_rows($res);?></p>              
                    </th>
                </tr>
                <tr>
                    <th>#</th>
                    <th>Artist Id</th>
                    <th>Name</th>
                    <th>Experiance</th>
                    <th>Category</th>
                </tr>
                <?php 
                $n=1;
                while($row=mysqli_fetch_assoc($res)) {
                    ?>
                    <tr>
                        <td><?php echo $n++?></td>
                        <td><?php echo $row['artistid']?></td>
                        <td><?php echo $row['name']?></td>
                        <td><?php echo $row['exp']?></td>
                        <td><?php echo $row['category']?></td>
                    </tr>
                    <?php
                }
                ?>
            </table>
        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col-md-5" style="display: block;border-right: solid;border-width: 1px;">
            <form method="post" name="form3" action="" onsubmit="return(validate3())">
                <table cellpadding="5px" cellspacing="5px"  align="center">
                    <tr>
                        <th colspan="2"><h1 align="center">Add Customer</h1></th>
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
                        <th>Amount</th>
                        <td><input type="number" name="amount" required></td>
                    </tr>
                    <tr>
                        <th colspan="2" style="text-align: center;">
                            <input type="submit" value="Add" name="add3" style="background-color: lawngreen;">
                        </th>
                    </tr>
                </table>
            </form>
        </div>
        <div class="col-md-7" style="display: block;overflow-x: auto;">
            <table cellpadding="5px" cellspacing="5px"  align="center">
                <tr>
                    <th colspan="10"><h1 align="center">Customer Details</h1></th>
                </tr>
                <tr>
                    <th colspan="5">
                        <?php
                        $sql="select * from customer";
                        $res= mysqli_query($conn, $sql);
                        ?>                    
                        <p>No: of customers : <?php echo mysqli_num_rows($res);?></p>
                    </th>
                </tr>
                <tr>
                    <th>#</th>
                    <th>Customer Id</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Amount</th>
                </tr>
                <?php 
                $n=1;
                while($row=mysqli_fetch_assoc($res)) {
                    ?>
                    <tr>
                        <td><?php echo $n++?></td>
                        <td><?php echo $row['customerid']?></td>
                        <td><?php echo $row['name']?></td>
                        <td><?php echo $row['address']?></td>
                        <td><?php echo $row['amount']?></td>
                    </tr>
                    <?php
                }
                ?>
            </table>
        </div>
    </div>
</body>
</html>