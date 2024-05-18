<?php

include 'config.php';
session_start();

if(isset($_POST['submit'])){

   $email = mysqli_real_escape_string($conn, $_POST['email']);
   $pass = mysqli_real_escape_string($conn, md5($_POST['password']));

   $select = mysqli_query($conn, "SELECT * FROM `user_form` WHERE email = '$email' AND password = '$pass'") or die('query failed');

   if(mysqli_num_rows($select) > 0){
      $row = mysqli_fetch_assoc($select);
      $_SESSION['user_id'] = $row['id'];
      header('location:in.php');
   }else{
      $message[] = 'incorrect email or password!';
   }

}

?>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>login</title>
   <link rel="stylesheet" href="css/style.css">

</head>
    <style>
        body{
            background: green;
        }
        input{
            border: 0;
            padding: 2px 2px;
            font-weight: 500;
            border-radius: 10px;
            
        }
    </style>
<body>
   <center>
        <div class="form-container">

           <form action="in.php" method="post" enctype="multipart/form-data">
              <h3>login now</h3>
              <?php
              if(isset($message)){
                 foreach($message as $message){
                    echo '<div class="message">'.$message.'</div>';
                 }
              }
              ?>
               <label>Email here:</label><br>
              <input type="email" name="email" placeholder="enter email" class="box" required>
               <br><br>
               <label>Password here:</label><br>
              <input type="password" name="password" placeholder="enter password" class="box" required>
               <br><br>
              <input type="submit" name="submit" value="login now" class="btn">
           </form>

        </div>
    </center>
<script src="index.js"></script>
</body>
</html>