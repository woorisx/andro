<!DOCTYPE html>
<html>
    <head> <meta charset="utf-8">
        <script>
            function check_input() {
                // if (!document.member_form.id.value) {
                //    alert("아이디를 입력하세요!");    
                //    document.member_form.id.focus();
                //    return;
                //}
                if (!document.member_form.pass.value) {
                    alert("비밀번호를 입력하세요!");    
                    document.member_form.pass.focus();
                    return;
                }
                if (!document.member_form.pass_confirm.value) {
                    alert("비밀번호 확인을 입력하세요!");    
                    document.member_form.pass_confirm.focus();
                    return;
                }
                if (!document.member_form.name.value) {
                    alert("이름을 입력하세요!");    
                    document.member_form.name.focus();
                    return;
                }
                if (!document.member_form.email1.value) {
                    alert("이메일 주소를 입력하세요!");    
                    document.member_form.email1.focus();
                    return;
                }
                if (!document.member_form.email2.value) {
                    alert("이메일 주소를 입력하세요!");    
                    document.member_form.email2.focus();
                    return;
                }
                if (document.member_form.pass.value != 
                        document.member_form.pass_confirm.value) {
                    alert("비밀번호가 일치하지 않습니다.\n다시 입력해 주세요!");
                    document.member_form.pass.focus();
                    document.member_form.pass.select();
                    return;
                }
                document.member_form.submit();
            }

            function reset_form() {
                // document.member_form.id.value = "";  
                document.member_form.pass.value = "";
                document.member_form.pass_confirm.value = "";
                document.member_form.name.value = "";
                document.member_form.email1.value = "";
                document.member_form.email2.value = "";
                document.member_form.id.focus();
                return;
            }

            function check_id() {
                window.open("member_check_id.php?id=" + document.member_form.id.value,
                    "IDcheck", "left=700, top=300, width=350, height=200, scrollbars=no, resizable=yes"); 
            }
        </script>
    </head>
    <body> 
        <header> <?php include "header.php";?> </header> <hr>
        <?php
            $con    = mysqli_connect("localhost", "user1", "12345", "sample");
            $sql    = "select * from member where id='$userid'";
            $result = mysqli_query($con, $sql);
            $row    = mysqli_fetch_array($result);
            $pass   = $row["pass"];
            $name   = $row["name"];
            $email  = explode("@", $row["email"]);
            $email1 = $email[0];
            $email2 = $email[1];

            mysqli_close($con);
        ?>

        <section>
            <form  name="member_form" method="post" action="member_modify.php?id=<?= $userid ?>">
                <h2>[ 정보 수정 ]</h2> <a href="delete.php?id=">회원탈퇴</a><br>
                <p>
                    아이디 : <?= $userid ?><br> 
                    비밀번호 : <input type="password" name="pass" value="<?= $pass ?>"><br>
                    비밀번호 확인 : <input type="password" name="pass_confirm" value="<?= $pass ?>"><br>
                    이름 : <input type="text" name="name" value="<?= $name ?>"><br>
                    이메일 : <input type="text" name="email1" value="<?= $email1 ?>">
                                            @<input type="text" name="email2" value="<?= $email2 ?>"><br>
                    <input type="button" value="저장하기" onclick="check_input()"/>
                    <input type="button" value="취소하기" onclick="reset_form()"/><br>
                </p>
            </form>
        </section> <hr>
        <footer> <?php include "footer.php";?> </footer>
    </body>
</html>