<?php include 'header.php'; ?>
        <style>
            img{
                width: 300px;
                height: 300px;
                border: 1px soild forestgreen;
            }
            img:hover{
                background-color: forestgreen;
                color: forestgreen;
            }
</style>
        <br>
        <div class="content" style="color: #fff;padding-top:200px;">
            <?php echo '
                <h1 style="color: forestgreen;font-size: 2.2em;text-align:center;">Our Team</h1>
                <br><br>
                <img src="t1.png"/> <img src="t2.png"/>
                <img src="t3.png"/>
                <img src="t4.png"/>
                <img src="t5.png"/>
                ';
                ?>
        </div>
        <div class="details" style="justify-content:space-between;">
            <?php echo '
                <p style="color: #222;font-size: 1.1em;text-align:center;padding-top:30px;">We have a devoted team that are working weekly at all the important projects of the company.</p>
            ';
            
            ?>
</div>

<?php include 'footer.php'; ?>