<?php
session_start();
$user_id = $_SESSION['user_id'];

if(!isset($user_id)){
   header('location:login.php');
};

if(isset($_GET['logout'])){
   unset($user_id);
   session_destroy();
   header('location:login.php');
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>profile</title>
   <link rel="stylesheet" href="css/style.css">

</head>
    <style>
        body{
            background: blueviolet;
        }
        h3{
            font-weight: 600;
            color: aliceblue;
        }
        a{
            text-decoration: none;
            color: aliceblue;
            background: violet;
            border-radius: 10px;
            padding: 2px 2px;
            text-align: center;
            align-items: center;
            letter-spacing: 0.2px;
            text-transform: uppercase;
            box-shadow: 2px 2px 4px violet;
        }
        a:hover{
            background: #000;
            box-shadow: 2px 2px 4px #000;
            color: blueviolet;
        }
        p{
            color: aliceblue;
            font-size: 1.2em;
        }
    </style>
<body>
   
<div class="container">

   <div class="profile">
      <?php
         /*$select = mysqli_query($conn, "SELECT * FROM `registerblazerunner` WHERE id = '$user_id'") or die('query failed');
         if(mysqli_num_rows($select) > 0){
            $fetch = mysqli_fetch_assoc($select);
         }*/
         ?>
      <h3><?php echo $fetch['user_name']; ?></h3>
       <a href="menu.php">go back</a>
      <a href="" class="btn">go pro account</a>
      <a href="connect/logout.php" class="delete-btn">logout</a>
      <p>new <a href="login.php">login</a> or <a href="register.php">register</a></p>
   </div>

</div>

</body>
</html>