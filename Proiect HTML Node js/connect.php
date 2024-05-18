<?php
 $username = filter_input(INPUT_POST,'username');
 $password = filter_input(INPUT_POST,'password');
 if(!empty($username)){
     if(!empty($password)){
         $host = "localhost";
         $dbusername = "2022.lihat.paul.sorin";
         $dbpassword = "WWEvsVPW12";
         $dbname = "2022.lihat.paul.sorin";
         
         $conn = new mysqli($host,$dbusername,$dbpassword,$dbname);
         
         if(mysqli_connect_error()){
             die('Connect Error ('. mysqli_connect_errno() .')'. mysqli_connect_error());
         }
         else{
             $sql = "INSERT INTO Log(user,pass) values('$username','$password')";
             if($conn->query($sql)){
                 echo 'window.location.href = "index.php"';
             }
             else{
                 echo "Error". $sql ."<br>". $conn->error;
             }
             $conn->close();
         }
     }
     else{
         echo "Nu ai trecut parola";
         die();
     }
 }
else{
    echo "Numele de utilizator nu este trecut";
    die();
}

?>