<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
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
        <div>
        
        <?php
            if(!$userid) {
        ?>
                <a href="member_form.php">회원 가입</a>
                | 
                <a href ="login_form.php">로그인</a>
        <?php
            } 
            else {
                $logged = $username."(".$userid.")님[Level:".$userlevel.",point:".$userpoint."]";
        ?> 
                <?= $logged ?> | <a href="logout.php"> 로그아웃 </a> |
                <a href="member_modify_form.php"> 정보수정 </a> <br>
        </div> <br>
        <div>
            HOME
            |
            <a href="message_form.php"> 쪽지 만들기 </a>
            |                                
            게시판 만들기
        </div>
        <?php
            }
        ?>
    </body>
</html>