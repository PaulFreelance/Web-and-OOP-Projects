<?php include 'headlog.php';?>
<?php

include 'config.php';
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
<div class="container">

   <div class="profile">
      <?php
         $select = mysqli_query($conn, "SELECT * FROM `user_form` WHERE id = '$user_id'") or die('query failed');
        ?>
      <h3><?php echo $fetch['name']; ?></h3>
      <a href="" class="btn">update profile</a>
      <a href="index.php" class="delete-btn">logout</a>
      <p>new <a href="login.php">login</a> or <a href="signup.php">register</a></p>
   </div>

</div>
<?php include 'footer.php'?>