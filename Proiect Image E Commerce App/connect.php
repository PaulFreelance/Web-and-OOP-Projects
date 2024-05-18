<?php

$dbhost = "localhost";
$dbusername = "2022.lihat.paul.sorin";
$dbpassword = "WWEvsVPW12";
$dbname = "2022.lihat.paul.sorin";


if(!$con = mysqli_connect($dbhost,$dbusername,$dbpassword,$dbname))
{

	die("failed to connect!");
}

function check_login($con)
{

	if(isset($_SESSION['user_id']))
	{

		$id = $_SESSION['user_id'];
		$query = "select * from users where user_id = '$id' limit 1";

		$result = mysqli_query($con,$query);
		if($result && mysqli_num_rows($result) > 0)
		{

			$user_data = mysqli_fetch_assoc($result);
			return $user_data;
		}
	}

	//v-a redirecta la pagina de login
	header("Location: login.php");
	die;

}

function random_num($l)
{

	$text = "";
	if($l < 5)
	{
		$l = 5;
	}

	$lungime = rand(4,$l);

	for ($i=0; $i < $lungime; $i++) { 
		

		$text .= rand(0,9);
	}

	return $text;
}
?>