<?php
session_start();
 include("connect.php");

 if($_SERVER['REQUEST_METHOD'] == "POST")
	{
		
		$user_name = $_POST['user_name'];
		$password = $_POST['password'];

		if(!empty($user_name) && !empty($password) && !is_numeric($user_name))
		{

			
			$query = "select * from registerblazerunner where user_name = '$user_name' limit 1"; //aici este citirea din baze de date
			$result = mysqli_query($con, $query);

			if($result)
			{
				if($result && mysqli_num_rows($result) > 0)
				{

					$user_data = mysqli_fetch_assoc($result);
					
					if($user_data['password'] === $password)
					{

						$_SESSION['user_id'] = $user_data['user_id'];
						header("Location: menu.php");
						die;
					}
				}
			}
			
			echo "wrong username or password!";
		}else
		{
			echo "wrong username or password!";
		}
	}
?>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Proiect Final</title>
	<link rel="stylesheet" href="style.css">
</head>
    <style>
        #background{
            background-image: url("resources/backgroundsignup");
            background-color: black transparent;
            background-repeat: no-repeat;
            background-size: cover;
        }
        #button{
            padding: 10px;
		    width: 100px;
		    color: white;
		    background-color: blueviolet;
		    border: none;
            text-align: center;
        }
        #button:hover{
            background-color: violet;
            cursor: pointer;
        }
        #text{
            height: 25px;
            border-radius: 5px;
            padding: 4px;
            border: solid thin #aaa;
            width: 100%;
        }
       
    </style>
<body id="background" style="background-color: #222;">
    <br><br><br><br>
    <div id="box" style="border: 2px solid violet;box-shadow: 2px 2px 4px violet;margin: auto;width: 300px;padding: 20px;">
            <form method="post">
                <h2 style="font-size: 20px;margin: 10px;color: white;">Log In</h2>
                <label style="color: violet;">Username</label>
                <input id="text" type="text" name="user_name"><br><br>
                <label style="color: violet;">Password</label>
                <input id="text" type="password" name="password"><br><br>

                <input id="button" type="submit" value="Signup"><br><br>

                <a href="signup.php" style="color: #fff;">You don't have account?Sign up here</a><br><br>
            </form>
        </div>
    </body>
</html>