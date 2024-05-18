<?php include 'header and footer/header.php';?>

<style>
  
        .details{
        padding: 2px 2px;
        border: 0;
        display: flex;
        justify-content: flex-end;
        text-align: end;
        color: aliceblue;
        flex-wrap: wrap;
    }
</style>
<br>
<section style="align-items: center;display: flex;background:#5c539d;padding-top:20px;">
    <div style="width: 100%;justify-content: space-between;align-items:center;">
        <div style="position:relative;">
            <img src="resources/mountain/1.png" style="width: 10%;heigh: 10%;position:relative; border-radius: 10pz;padding-top:30px;">
        </div><br>
        <div class="details">
            <h4>Mountains</h4>
            <h1>Nature Artwork</h1>
            <h2>$15.99</h2>
            <p>Description</p>
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.<br> Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.<br> It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.<br> It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,<br> and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
            </div>
            <div>
                <button style="padding: 2px 2px;alig-items: center;justify-content:center;text-align:center;background: violet;color:blueviolet;font-weight:300;">
                    <i class="fa-regular fa-heart"></i>
                    <span style="font-weight:300;">Favorites</span>
                </button>
                <button style="padding: 2px 2px;alig-items: center;justify-content:center;text-align:center;background: crimson;color:#fff;cursor:pointer;">
                    <a href="cart.php" style="text-decoration: none;color:#fff;"><span>Add in Cart</span></a>
                </button>
            </div>
        </div>
    </div>
</section>

<?php include 'header and footer/footer.php';?>