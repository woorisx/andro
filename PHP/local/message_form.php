<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>message_form.php</title>
</head>
<body>
    <script>
        function check_input(){
            if(!document.message_form.rv_id.value){
                alert("수신 아이디를 입력하세요.");
                document.message_form.rv_id.focus();
                return;
            }
            if(!document.message_form.subject.value){
                alert("제목을 입력하세요.");
                document.message_form.subject.focus();
                return;
            }
            if(!document.message_form.content.value){
                alert("내용을 입력하세요.");
                document.message_form.content.focus();
                return;
            }
            document.message_form.submit();
        }

    </script>

    <header>
        <?php include "header.php"; ?><hr>
    </header>

    <section>
        [쪽지보내기] <br><br>
        <a href="message_box.php?mode=rv">수신 쪽지함</a> |
        <a href="message_box.php?mode=send">송신 쪽지함</a> <br> <br>
        <form name="message_form" method="post" action="message_insert.php?send_id=<?=$userid?>">
        보내는 사람 : <?=$userid?> <br><br>
        수신 아이디 : <input type="text" name="rv_id"> <br> <br>
        제목 :  <input type="text" name="subject"><br>
        내용 :  <textarea name="content"></textarea><br><br>
        <button type="button" onclick="check_input()">보내기</button>
    </form>

    </section><hr>
    <footer>
        <?php include "footer.php"; ?>
    </footer>
</body>
</html>