<!DOCTYPE html>
<html>
    <head> 
        <meta charset="utf-8">
        <script>
            function check_input() {
                if (!document.message_form.rv_id.value) {
                    alert("수신 아이디를 입력하세요!");
                    document.message_form.rv_id.focus();
                    return; 
                }
                if (!document.message_form.subject.value) {
                    alert("제목을 입력하세요!");
                    document.message_form.subject.focus();
                    return; 
                }
                if (!document.message_form.content.value) {
                    alert("내용을 입력하세요!");    
                    document.message_form.content.focus();
                    return;  
                }
                document.message_form.submit();
            }
        </script>
    </head> 
    <body> 
        <header><?php include "header.php"; ?><hr></header>  
        <section>
            [ 쪽지 보내기 ] <br><br>
            <a href="message_box.php?mode=rv">수신 쪽지함</a> | 
            <a href="message_box.php?mode=send">송신 쪽지함</a> <br><br>
            <form name="message_form" method="post" action="message_insert.php?send_id=<?=$userid?>">
                보내는 사람 : <?=$userid?> <br><br>
                수신 아이디 : <input type="text" name="rv_id"><br><br>
                제목 : <input type="text" name="subject"><br><br>
                내용 : <textarea name="content"></textarea><br><br>
                <button type="button" onclick="check_input()">보내기</button>	 
            </form>
        </section> <hr>
        <footer><?php include "footer.php";?></footer>
    </body>
</html>