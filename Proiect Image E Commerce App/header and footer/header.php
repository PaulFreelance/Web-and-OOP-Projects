<?php 


if(isset($_POST["submit"])){
    $search = $_POST["search"];
    $search2 = $connect->prepare("SELECT * FROM 'search' WHERE Name = '$search'");
    
    $search2->setFetchMode(PDO:: FETCH_OBJ);
    $search2-> execute();
    
    if($linie = $search2->fetch())
    {
        ?>
        <br><br><br>
        <table>
            <tr>
                <td>Name</td>
                <td>Description</td>
            </tr>
            <tr>
                <td><?php echo $linie->Name; ?></td>
                 <td><?php echo $linie->Description; ?></td>
            </tr>
        </table>
    <?php
    }
    else
    {
        echo "Name does not exist";
    }
}
?>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta charset="UTF-8" />
	<title>Proiect Final</title>
	<link rel="stylesheet" href="style.css">
</head>
    <style>
        *
        {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Roboto', sans-serif;
        }

        body{
            max-height: 100vh;
            background: var(--primary-color);
        }
        header ul li a:hover, header ul li a.active
        {
            color: violet;
        }
        .search{
            display: flex;
            align-items: center;
            justify-content: flex-end;
            padding-bottom: 20px;
        }
        .search-bar{
            width: 100%;
            max-width: 300px;
            background: var(--secondary-color);
            display: flex;
            align-items: center;
            border-radius: 60px;
            padding: 10px 20px;
        }
        .search-bar input{
            background: transparent;
            flex: 1;
            border: 0;
            outline: none;
            padding: 1px;
            font-size: 20px;
            color: aliceblue;
        }
        ::placeholder{
            color: aliceblue;
        }
        .search-bar button{
            padding-left: 145px  5px;
            border: 0;
            border-radius: 50%;
            width: 20px;
            height: 20px;
            background: violet;
            cursor: pointer;
        }
        .search-bar button ion-icon{
            width: 25px;
            align-items: center;
        }
        #user{
            width: 40px;
            height: 40px;
            border-radius: 50%;
            display: flex;
            flex-wrap: wrap;
            justify-content: flex-end;
            padding-right: 2px 20px;
        }
        #darklight{
            width: 30px;
            height: 30px;
            cursor: pointer;
            border-radius: 50%;
            margin: 10px;
            position: relative;
        }
        :root{
            --primary-color: aliceblue;
            --secondary-color:blueviolet;
        }
        .dark{
            --primary-color: #222;
            --secondary-color: violet;
        }

    </style>
    <body>
        <header>
            <a href="menu.php"><img src="resources/BlazeRunnerlogo.png" alt="text"/></a>
            <ul style="display: flex;gap: 40px;">
                <li style="list-style: none;"><a href="menu.php" style="text-decoration: none;color: var(--secondary-color);text-transform: uppercase;letter-spacing: 0.2em;transition: 0.5s;font-weight: bold;">Home</a></li>
                <li style="list-style: none;"><a href="about.php" style="text-decoration: none;color: var(--secondary-color);text-transform: uppercase;letter-spacing: 0.2em;transition: 0.5s;font-weight: bold;">About</a></li>
                <li style="list-style: none;"><a href="pricing.php" style="text-decoration: none;var(--secondary-color);text-transform: uppercase;letter-spacing: 0.2em;transition: 0.5s;font-weight: bold;">Pricing</a></li>
                <li style="list-style: none;"><a href="help.php" style="text-decoration: none;var(--secondary-color);text-transform: uppercase;letter-spacing: 0.2em;transition: 0.5s;font-weight: bold;">Help</a></li>
            </ul><br>
            <a href="profile.php" style="text-decoration: none;color:var(--secondary-color);"><img src="resources/client.jpg" id="user"></a><br><br>
            <img src="resources/moon" id="darklight">
            <br>
            <div class="search">
                <form action="" method="get" class="search-bar">
                    <input type="text" placeholder="search anything" name="s">
                    <button type="submit"><ion-icon name="search-outline"></ion-icon></button>
                </form>
            </div>
        </header>
        <script>
            var darklight = document.getElementById("darklight");
            
            darklight.onclick = function(){
                document.body.classList.toggle("dark");
                /*if(document.body.classList.toggle("dark")){
                    darklight.src = "resources/moon.png";
                }else{
                     darklight.src = "resources/sun.png";
                }*/
            }
        </script>
