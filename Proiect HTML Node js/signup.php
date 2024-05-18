<!DOCTYPE html>
<html>
    <head>
        <title>Sign Up</title>
    </head>
    <style>
        body{
            background: #222;
        }
        form{
            padding-top: 120px;
            text-align: center;
            font-size: 2.3em;
        }
        input{
            width: 250px;
            height: 50px;
            font-size: 1.1em;
            align-items: center;
            text-align: center;
            background-color: #222;
            border: none;
            border-bottom: 2px solid #000;
        }
        label{
            color: forestgreen;
        }
        
    </style>
    <body>
        <form method="post" action="index.php">
            <label>User:</label>
            <br>
            <input type="text" name="username"><br><br>
            <label>Password:</label>
            <br>
            <input type="password" name="password"><br><br>
            
            <input type="submit" value="Summit" style="background-color: forestgreen;">
        </form>
    </body>
</html>