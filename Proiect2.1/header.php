<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta charset="UTF-8" />
	<title>Proiect 2</title>
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
            background: transparent;
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
            cursor: pointer;
        }
        :root{
            --primary-color: aliceblue;
            --secondary-color:forestgreen;
        }
        .dark{
            --primary-color: #222;
            --secondary-color: green;
        }

    </style>
    <body>
        <header>
            <a href="start.php"><p style="text-decoration: none; color: forestgreen;font-size:3.2em;font-weight:bold;">LO>GO</p></a>
            <ul style="display: flex;gap: 40px;">
                <li style="list-style: none;"><a href="index.php" style="text-decoration: none;color: var(--secondary-color);text-transform: uppercase;letter-spacing: 0.2em;transition: 0.5s;font-weight: bold;">Home</a></li>
                <li style="list-style: none;"><a href="about.php" style="text-decoration: none;color: var(--secondary-color);text-transform: uppercase;letter-spacing: 0.2em;transition: 0.5s;font-weight: bold;">About</a></li>
                <li style="list-style: none;"><a href="pricing.php" style="text-decoration: none;var(--secondary-color);text-transform: uppercase;letter-spacing: 0.2em;transition: 0.5s;font-weight: bold;">Pricing</a></li>
                <li style="list-style: none;"><a href="help.php" style="text-decoration: none;var(--secondary-color);text-transform: uppercase;letter-spacing: 0.2em;transition: 0.5s;font-weight: bold;">Help</a></li>
            </ul>
            <br>
            <a href="login.php" style="text-decoration: none;color:forestgreen;font-weight: bold;font-size:1.1em;background:#green;">LOG IN</a>
            <br>
            <img src="moon.png" id="darklight">
            <div class="search">
                <form action="" method="get" class="search-bar">
                    <input type="text" placeholder="search anything" name="s">
                    <button type="submit"><ion-icon name="search-outline"></ion-icon></button>
                </form>
            </div>
        </header>