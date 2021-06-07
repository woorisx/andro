<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>member_form.php</title>
</head>
<script>
    function check_input(){
        if(!document.member_form.id.value){
            alert("아이디를 입력하세요!");
            document.member_for.id.focus();
            return;
        }
        if(!document.member_form.pass.value){
            alert("비밀번호를 입력하세요!");
            document.member_for.pass.focus();
            return;
        }
        if(!document.member_form.pass_confirm.value){
            alert("비밀번호 확인을 입력하세요!");
            document.member_form.pass_confirm.focus();
            return;
        }
        if(!document.member_form.name.value){
            alert("이름을 입력하세요!");
            document.member_form.name.focus();
            return;
        }
        if(!document.member_form.email1.value){
            alert("이메일 주소를 입력하세요!");
            document.member_form.email1.focus();
            return;
        }
        if(!document.member_form.email2.value){
            alert("이메일 주소를 확인해주세요!");
            document.member_form.eamil2.focus();
            return;
        }
        if(document.member_form.pass.value !=
            document.member_form.pass_confirm.value){
                alert("비밀번호가 일치하지 않습니다. \n다시 입력해 주세요!")
                document.member_form.pass.focus();
                document.member_form.pass.select();
                return;
            }
            document.member_form.submit();
    }

    function reset_form() {
        document.member_form.id.value = "";
        document.member_form.pass.value = "";
        document.member_form.pass_confirm.value = "";
        document.member_form.name.value = "";
        document.member_form.email1.value = "";
        document.member_form.email2.value = "";
        document.member_form.id.focus();
        return;
    }

    function check_id(){
        window.open("member_check_id.php?id=" + document.member_form.id.value,
        "IDcheck", "left=700, top=300, width=350, height=200, scrollbars=no, resizable=yes");
    }
</script>
<body>
    <header> <?PHP include "header.php"; ?></header><hr>
    <section>

        <form name="member_form" method="post" action="member_insert.php">

            <h2>회원가입</h2><br>
            <p>
                아이디 : <input type="text" name="id">
                        <input type="button" value="중복확인" onclick="check_id()"><br>
                        비밀번호 : <input type="password" name="pass"><br>
                        비밀번호 확인 : <input type="password" name="pass_confirm"><br>
                        이름 : <input type="text" name="name"><br>
                        이메일 : <input type="text" name="email1">
                                @ <input type="text" name="email2"><br>
                        <input type="button" value="가입신청" onclick="check_input()">
                        <input type="button" value="reset" onclick="reset_form()"><br>
            </p>
        </form>
    </section><hr>
    <footer>
        <?php include "footer.php"; ?>
    </footer>
</body>
</html>