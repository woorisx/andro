<!DOCTYPE html>
<html>
    <head> 
        <meta charset="utf-8">
        <title>PHP 회원가입 연습</title>
        <script type="text/javascript">
            function check_input() {
                if (!document.login_form.id.value)  {
                    alert("아이디를 입력하세요");    
                    document.login_form.id.focus();
                    return;
                }
                if (!document.login_form.pass.value) {
                    alert("비밀번호를 입력하세요");    
                    document.login_form.pass.focus();
                    return;
                }
                document.login_form.submit();
            }
        </script>
    </head>
    <body>
        <header> <?php include "header.php";?></header>
        <hr>
        <section> 
            <form  name="login_form" method="post" action="login.php">            
                <p>
                아이디 : <input type="text" name="id"><br>
                비밀번호 : <input type="password" name="pass"><br>
                <input type="button" value="Click" onclick="check_input()">
                </p>     
            </form>
        </section>  
        <hr>
        <footer> <?php include "footer.php";?></footer> 
    </body>
</html>