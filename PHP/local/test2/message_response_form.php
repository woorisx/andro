<!DOCTYPE html>
<html>
<head>
     <meta charset="utf-8">
     <script>
         function check_input() {
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
    <header><?php include "header.php";?></header>  <hr>
    <section>
         답변 쪽지 보내기 <br><br>
	
    <?php
	$num  = $_GET["num"];
	$con = mysqli_connect("localhost", "user1", "12345", "sample");
	$sql = "select * from message where num=$num";
	$result = mysqli_query($con, $sql);

	$row = mysqli_fetch_array($result);
	$send_id      = $row["send_id"];
	$rv_id      = $row["rv_id"];
	$subject    = $row["subject"];
	$content    = $row["content"];

	$subject = "RE: ".$subject; 

	$content = "> ".$content; 
	$content = str_replace("\n", "\n>", $content);
	$content = "\n\n\n-----------------------------------------------\n".$content;

	$result2 = mysqli_query($con, "select name from member where id='$send_id'");
	$record = mysqli_fetch_array($result2);
	$send_name    = $record["name"];
    ?>		
	<form  name="message_form" method="post" action="message_insert.php?send_id=<?=$userid?>">
	    <input type="hidden" name="rv_id" value="<?=$send_id?>">
	    보내는 사람 : <?=$userid?> <br>
	    수신 아이디 : <?=$send_name?>(<?=$send_id?>) <br><br>
	    제목 : <input name="subject" type="text" value="<?=$subject?>"> <br>
	    글 내용 : <textarea name="content"><?=$content?></textarea> <br><br>
    	    <button type="button" onclick="check_input()">보내기</button>
   	</form>
	
    </section> <hr>
    <footer><?php include "footer.php";?></footer>
</body>
</html>
