<?php
$conn= mysqli_connect('localhost', 'root', '', 'bookdb');
if (!$conn) {
    die('Connection error : ' . mysqli_connect_error());
}
if(isset($_POST['add'])) {
    $sql="insert into book(accessno,title,author,edition,publisher) values ($_POST[accessno],'$_POST[title]','$_POST[author]','$_POST[edition]','$_POST[publisher]')";
    $result= mysqli_query($conn, $sql);
    if($result) {
        echo "<script>alert('Details Added Successfully')</script>";
        echo "<script>window.location.href=window.location.href</script>";    
    }    
}
?>
<html>
<head>
    <title>Book Management System</title>
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
    .sub1 {
        width: 100px;
        height: 35px;
        border-radius: 5px;
    }
    .sub2 {
        height: 25px;
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
        if(!document.addform.title.value.match(/^[a-zA-Z][A-Za-z\s]*[a-zA-Z]$/)) {
            alert("Title should contain alphabets only!");
            document.addform.title.focus();
            return false;
        } 
        if(!document.addform.author.value.match(/^[a-zA-Z][A-Za-z\s]*[a-zA-Z]$/)) {
            alert("Author name should contain alphabets only!");
            document.addform.author.focus();
            return false;
        } 
    }
</script>
</head>
<body>
    <div class="row" style="margin-top: 50px;">
        <div class="col-md-5" style="display: block;border-right: solid;border-width: 1px;">
            <form method="post" action="" name="addform" onsubmit="return(validate())">
                <table cellpadding="5px" cellspacing="5px"  align="center">
                    <tr>
                        <th colspan="2"><h1 align="center">Add Book</h1></th>
                    </tr>
                    <tr>
                        <th>Accession Number</th>
                        <td><input type="text" name="accessno" required></td>
                    </tr>
                    <tr>
                        <th>Title</th>
                        <td><input type="text" name="title" required></td>
                    </tr>
                    <tr>
                        <th>Author</th>
                        <td><input type="text" name="author" required></td>
                    </tr>
                    <tr>
                        <th>Edition</th>
                        <td><input type="number" name="edition" required></td>
                    </tr>
                    <tr>
                        <th>Publisher</th>
                        <td><input type="text" name="publisher" required></td>
                    </tr>
                    <tr>
                        <th colspan="2" style="text-align: center;">
                            <input class="sub1" type="submit" value="Add" name="add" style="background-color: lawngreen;">
                        </th>
                    </tr>
                </table>
            </form>
        </div>
        <div class="col-md-7" style="display: block;overflow-x: auto;">
            <table cellpadding="5px" cellspacing="5px"  align="center">
                <tr>
                    <th colspan="10"><h1 align="center">Search Book</h1></th>
                </tr>
                <tr>
                    <th colspan="10">
                        <form name="sform">
                            <input type="text" name="key" required="" style="align-content: center;" value="<?php if(isset($_GET['search'])) echo $_GET['search'];?>">
                            <input class="sub2" type="button" value="Search" name="search" style="background-color: deepskyblue;" onclick="window.location.replace('prog16.php?search='+document.sform.key.value)">
                        </form>
                    </th>
                </tr>
                <?php
                if(isset($_GET['search'])) {
                    ?>
                    <tr>
                        <th colspan="5">
                            <?php
                            $sql2="select * from book where title like '%$_GET[search]%'";
                            $res= mysqli_query($conn, $sql2);
                            $num=mysqli_num_rows($res);
                            ?> 
                            <p><?php echo $num?> Results found</p>                   
                        </th>
                    </tr>
                    <?php
                    if($num!=0) {
                        ?>
                        <tr>
                            <th>#</th>
                            <th>Book Id</th>
                            <th>Accession Number</th>
                            <th>Title</th>
                            <th>Author</th>
                            <th>Edition</th>
                            <th>Publisher</th>
                        </tr>
                        <?php 
                        $n=1;
                        while($row=mysqli_fetch_assoc($res)) {
                            ?>
                            <tr>
                                <td><?php echo $n++?></td>
                                <td><?php echo $row['bookid']?></td>
                                <td><?php echo $row['accessno']?></td>
                                <td><?php echo $row['title']?></td>
                                <td><?php echo $row['author']?></td>
                                <td><?php echo $row['edition']?></td>
                                <td><?php echo $row['publisher']?></td>
                            </tr>
                            <?php
                        }
                    }
                }
                ?>
            </table>
        </div>
    </div>
</body>
</html>