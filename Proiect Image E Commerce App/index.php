<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Proiect Final</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <style>
        body{
            background-image: url("resources/background.png");
            background-color: black transparent;
            background-repeat: no-repeat;
            background-size: cover;
            
        }
        body::after{
            content: '';
            
            background-color: black transparent;
            opacity: 0.5;
            top: 0;
            left: 0;
            bottom: 0;
            right: 0;
        }
        .begin{
            align-items: center;
            padding-top: 200px;
            justify-content: center;
            text-align: center;
            font-size: 2.1em;
        }
        .begin h1{
            color: white;
            text-shadow: 2px 2px 4px #000;
        }
        .begin a{
            background-color: blueviolet;
            border-radius: 20px;
            font-size: 1.1em;
            text-align: center;
            box-shadow: 2px 2px 4px violet;
            text-decoration: none;
            color: darkkhaki;
            width: 50px;
        }
        .begin a:hover{
            background-color: black;
            color: crimson;
            box-shadow: 2px 2px 4px crimson;
        }
        .begin p{
            color: violet;
            text-shadow: 2px 2px 4px #000;
        }
        .begin img{
            box-shadow: 1px 1px 4px violet;
        }
    </style>
    <body>
        <div class="begin">
            <img src="resources/BlazeRunnerlogo.png">
            <h1>Welcome to the Blaze Runner</h1>
            <p>Get your all favorite images, assets and all you need to develop your creativity with our help.</p>
            <a href="signup.php">Sign Up</a>
            <a href="login.php">Log In</a>
        </div>
    </body>
</html>