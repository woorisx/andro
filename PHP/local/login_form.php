<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login_form.php</title>
</head>
    <title>PHP 회원가입 연습</title>
    <script type="text/javascript">
        function check_input() {
            if(!document.login_form.pass.value){
                alert("아이디를 입력하세요");
                document.login_form.id.focus();
                return;
            }
            if(!document.login_form.pass.value){
                alert("비밀번호를 입력하세요");
                document.login_form.pass.focus();
                return;
            }
            document.login_form.submit();
        }
    </script>
<body>
    <header> <?php include "header.php"; ?></header>
    <hr>
    <section>
    <form name="login_form" action="login.php" method="post">
        <p>아이디 : <input type="text" name="id"><br>
           비밀번호 : <input type="password" name="pass"><br>
           <input type="button" value="Click" onclick="check_input()">
        </p> 
    </form>
    </section>
    <hr>
    <footer><?php include "footer.php"; ?></footer>
</body>
</html>