<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>header.php`</title>
</head>
<body>
    <?php
        session_start();
        if(isset($_SESSION["userid"])) $userid = $_SESSION["userid"];
        else $userid = "";
        if(isset($_SESSION["username"])) $username = $_SESSION["username"];
        else $username = "";
        if(isset($_SESSION["userlevel"])) $userlevel = $_SESSION["userlevel"];
        else $userlevel = "";
        if(isset($_SESSION["userpoint"])) $userpoint = $_SESSION["userpoint"];
        else $userpoint = "";

    ?>
    <?php
        if(!$userid){
    ?>
        
    <div><a href="member_form.php">회원가입</a>
         <a href="login_form.php">로그인</a>
    
    <?php
        }
        else{
            $logged = $username."(".$userid.")님[Level:".$userlevel.",point:".$userpoint."]";
            ?>

        <? = $logged ?> | <a href="logout.php"> 로그아웃 </a> |
        <a href="member_modify_form.php"> 정보수정 </a>
    </div><br>

    <div>
        HOME
        |
        <a href="message_form.php">쪽지 만들기</a>
        |
        <a href="board_form.php">게시판 만들기</a>
    </div>
    <?php
        }
    ?>
</body>
</html>