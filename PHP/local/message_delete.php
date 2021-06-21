<meta charset="utf-8">

<?php

$num = $_GET["num"];
$mode = $_GET["mode"];

$con = mysqli_connect("localhost", "user1", "12345", "sample");
$sql = "delete from message where num=$num";
mysqli_query($con, $sql);
mysqli_close