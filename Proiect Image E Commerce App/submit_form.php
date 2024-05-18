<?php
$servername = "localhost";
$username = "2022.lihat.paul.sorin";
$password = "WWEvsVPW12";
$dbname = "2022.lihat.paul.sorin";


$conn = new mysqli($servername, $username, $password, $dbname);


if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$user = $_POST["user_name"];
$pass = $_POST["password"];


$sql = "INSERT INTO registerblazerunner (user_name, password)
VALUES ('$user', '$pass')";

if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
    echo '<a href="menu.php">main page</a>';
    echo '<br>';
    echo "$user";
    echo '<br>';
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>