<?php include 'header.php'; ?>
        <style>
            td{
                justify-content: space-between;
                
            }
            img{
                width: 10%;
                height: 10%;
                align-items: center;
                justify-content: space-between;
                margin-bottom: 30px;
                padding-bottom: 30px;
            }
</style>
       <br>
       <center>
           <br>
           <br>
           <br>
         <table border="1" style="align-items:center;width:50%;height:50%;">
                <tr style="background-color: forestgreen;">
                    <td>Email</td><br>
                    <td>Telefon</td><br>
                    <td>Github</td>
                </tr>
            </table>
        <?php
            for($i=1;$i<=1;$i++){
                echo "
              <tr>
                    <td>$i</td>
                    <td>lihatpaul10@gmail.com</td>
                    <td>$i</td>
                    <td>0742952311</td>
                    <td>$i</td>
                    <td>Lihat Paul</td>
              </tr>
              ";
            }?>
           <?php echo "h1";?>
        </center>
       <div class="content" style="color: #fff;">
                    <h1 style="color: forestgreen;font-size: 1.2em;padding-bottom:300px;">Puteti contacta la urmatoarele:</h1>
                    
                <center>
                    <img src="mail.png"/>
                    <img src="phone.png"/>
                    <img src="github.png"/>
                </center>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    
       </div>
    

<?php include 'footer.php'; ?>