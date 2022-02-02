<?php
$conn= mysqli_connect('localhost', 'root', '', 'hospital');
if (!$conn) {
    die('Connection error : ' . mysqli_connect_error());
}

$sql="delete from patient where patientid=$_GET[id]";
$result= mysqli_query($conn, $sql);
if($result) {
    echo "<script>alert('Details deleted Successfully')</script>";
    echo "<script>window.location.replace('prog13.php')</script>";    
}

?>