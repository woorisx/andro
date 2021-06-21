<!DOCTYPE html>
<html>
<head> <meta charset="utf-8"> </head>
<body> 
<header> <?php include "header.php";?> </header> <hr>
<section>
<?php
	$mode 	= $_GET["mode"];
	$num  	= $_GET["num"];

	$con 		= mysqli_connect("localhost", "user1", "12345", "sample");
	$sql 		= "select * from message where num=$num";
	$result 	= mysqli_query($con, $sql);
	$row 		= mysqli_fetch_array($result);

	$send_id	= $row["send_id"];
	$rv_id	= $row["rv_id"];
	$regist_day	= $row["regist_day"];
	$subject	= $row["subject"];
	$content	= $row["content"];

	$content 	= str_replace(" ", "&nbsp;", $content);
	$content 	= str_replace("\n", "<br>", $content);

	if ($mode=="send")
	      $result2	= mysqli_query($con, "select name from member where id='$rv_id'");
	else 
              $result2 	= mysqli_query($con, "select name from member where id='$send_id'");

	$record 	= mysqli_fetch_array($result2);
	$msg_name	= $record["name"];
	if ($mode == "send") echo "송신 쪽지함 > 내용보기";
	else echo "수신 쪽지함 > 내용보기";
?>
	<br><br>
	    	제목 :</td> <?=$subject?> <br>
		<?=$msg_name?> | <?=$regist_day?><br><br>
		<?=$content?>	
	<br><br>
	<button onclick="location.href='message_box.php?mode=rv'">수신 쪽지함</button>
	<button onclick="location.href='message_box.php?mode=send'">송신 쪽지함</button>
	<button onclick="location.href='message_response_form.php?num=<?=$num?>'">답변 쪽지</button>
	<button onclick="location.href='message_delete.php?num=<?=$num?>&mode=<?=$mode?>'">삭제</button>
	</section> <hr>
<footer> <?php include "footer.php";?> </footer>
</body>
</html>