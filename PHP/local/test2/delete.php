<?php
    session_start();
    $userid     = $_SESSION["userid"];

    unset($_SESSION["userid"]);
    unset($_SESSION["username"]);
    unset($_SESSION["userlevel"]);
    unset($_SESSION["userpoint"]);

    $con = mysqli_connect("localhost", "user1", "12345", "sample");
    $sql = "delete from member where id='$userid'";
    mysqli_query($con, $sql);

    mysqli_close($con);

    echo "
        <script>
            location.href = 'index.php';
        </script> "
?>