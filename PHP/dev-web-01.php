<?php
    // echo "Hello World <br>";

    // $a = 10;

    // $b = 20;

    // $sum = $a + $b;

    // echo "Test, $sum  <br><br>";

    // echo  $a + $b ;  // 문자열과 같이 출력은 불가능하지만 독립적인 연산은 출력이 가능.

    // $num1 = 10;
    // $num2 = 10;

    // if($num1 == $num2){
    //     echo "{$num1}과 {$num2}은 같은 수 "; }
    
    // if($num1 > $num2){
    //     echo "{$num1}은 {$num2}보다 큰 수 "; }

    // if($num1 < $num2){
    //     echo "{$num1}은 {$num2}보다 작은 수 "; }
    // echo "<br>";

?>

<?php

    // $num1 = 10;
    // $num2 = 20;

    // if($num1 == $num2){
    //     echo $num1."과".$num2."은 같은수";
    // }else{
    //     echo "{$num1}과 {$num2}은 틀린 수";
    // }
    // echo "<br>"

?>

<?php

    // $num1 = 10;
    // $num2 = 20;
    
    // echo "<br><br><br>";
    // if($num1 == $num2){
    //     echo "{$num1}과 {$num2}은 같은 수";
    // }
    // if($num1 > $num2){
    //     echo "{$num1}은 {$num2}보다 큰 수";
    // }
    // if($num1 < $num2){
    //     echo "{$num1}은 {$num2}보다 작은 수";
    // }
    // echo "<br>";

    ?>


<?php

    // $num1 = 10; $num2 = 20; $num3 = 30;

    // if($num1 > $num2){
    //     if($num1 > $num3) echo "큰 수: $num1";
    //     else{ echo "큰 수: $num3"; }
    // }else{
    //     if($num2 > $num3) echo "큰 수 : $num2";
    //     else echo "큰 수 : $num3";  }

?>



<?php

    //     $var = 70;

    // switch ($var){
    //     case 90 :
    //         echo "학점 A";
    //         break;
    //     case 80 : 
    //         echo "학점 B";
    //         break;
    //     case 70 :
    //         echo "학점 C";
    //         break;

    //     default :
    //         echo "학점 F";
    //         break;
    // }

    // echo "<br>";


?>

<?php
    // 반복문

    // for($i =0; $i < 5; $i++){
    //     echo "{$i}<br>";
    // }


    // $sum = 0 ;
    // for ($i = 1; $i <= 10; $i++){
    //     $sum = $sum + $i;
    // }
    // echo "합 = $sum <br>";



        // $i = 1;
        // while($i <= 9){
        //     echo "5X".$i."=".($i*5)."<br>";
        //     $i++;
        // }


            // $arr = array();

            // $arr[0] = "apple";
            // $arr[1] = "banana";
            // $arr[2] = "orange";

            // echo "$arr[0] : $arr[1] : $arr[2]";


            // $num = array();
            // for($i = 0; $i < 10; $i++){
            //     $num[$i] = $i + 1;
            // }

            // for($i = 0; $i<10; $i++){
            //     echo "num[".$i."]=".$num[$i]."<br>";
            // }
            

            // $arr = array("apple","banana", "orange");
            // for($i =0; $i< count($arr); $i++){
            //     echo "arr[".$i."]=".$arr[$i]."<br>";
            // }



            function f1(){
                echo "Hello function <br>";
            }

            function f2($a, $b){
                $sum  = $a + $b;
                echo "$sum <br>";
            }

            function f3(){
                $num = 100;
                echo "$num <br>";
                return $num;
            }

            function f4($a, $b){
                $sub = $a - $b;
                echo "$sub <br>";
                return $sub;
            }

            echo "--- Type f1 <br>";
            f1();
            
            echo "--- Type f2 <br>";
            f2(10, 20);

            echo "--- Type f3 <br>";
            f3();
            // $num = f3();
            //echo "$num <br>";

            echo "--- Type f4 <br>";
            f4(300, 100);
            //$sub = f4(300, 100);
            //echo "$sub <br>";



 ?>













