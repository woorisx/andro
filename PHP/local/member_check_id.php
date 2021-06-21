<?php

echo "ID 중복체크 <br><br>";

$id = $_GET["id"];
if(!$id){
    echo("아이디를 입력해 주세요!");
}else{
    $con = mysqli_connect("localhost", "user1", "12345", "sample");

    $sql = "select * from member where id='$id'";
    $result = mysqli_query($con, $sql);
    $num_record = mysqli_num_rows($result);

    if($num_record){
        echo "아이디 중복 : ".$id."<br>";
        echo "다른 아이디를 사용해 주세요!";

    } else{
        echo "아이디 " .$id." 사용 가능";
    }

    mysqli_close($con);
}



?>