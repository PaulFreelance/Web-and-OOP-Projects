<?php include 'header and footer/header.php';?>

<style>
    .cart{
        margin: 80px auto;
    }
    table{
        width: 100%;
        border-collapse: collapse;
    }
    .cartinfo{
        display: flex;
        flex-wrap: wrap;
    }
    th{
        text-align: left;
        padding: 5px;
        color: aliceblue;
        background: blueviolet;
        font-weight: normal;
    }
    td{
        padding: 10px 5px;
    }
    td input{
        width: 40px;
        height: 30px;
        padding: 5px;
    }
    td a{
        color: blueviolet;
        font-size: 12px;
    }
    td img{
        width: 80px;
        height: 80px;
        margin-right: 10px;
    }
</style>
<br>
<div class="cointainer cart">
    <table>
        <tr>
            <th>Product</th>
            <th>Quantity</th>
            <th>Total</th>
        </tr>
        <tr>
            <div class="cartinfo">
                <img src="resources/mountain/1.png">
                <div>
                    <p>Mountain</p>
                    <small>$15.99</small>
                    <br>
                    <a href="">Remove</a>
                </div>
            </div>
        </tr>
        <tr>
            <td>Product name</td>
            <td><input type="number" value="1"></td>
            <td>$15.99</td>
        </tr>
    </table>
    <a href="card.php" style=" text-decoration;width: 100px;height:100px;border-radius:10px;background:crimson;color:#fff;padding:2px 2px;">Plateste</a>
</div>

<?php include 'header and footer/footer.php';?>