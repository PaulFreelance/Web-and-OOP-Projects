<?php include 'header and footer/header.php';?>
<style>
    *{
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        
    }
    .container{
        width: 100%;
        min-height: 100vh;
        background: #5c539d;
    }
    .container h2{
        color: white;
        font-size: 32px;
        padding: 50px 0;
        text-align: center;
    }
    .price{
        width: 90%;
        max-width: 1100px;
        margin: auto;display: grid;
        grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
        grid-gap: 25px;
    }
    .details{
        background: #1f283b;
        padding: 10% 15%;
        border-radius: 10px;
        color: white;
        text-align: center;
    }
    .price p{
        font-size: 22px;
    }
    .price h3{
        font-size: 44px;
        margin: 20px 0 40px;
        font-weight: 500;
    }
    .price h3 span{
        font-size: 16px;
    }
    .price ul{
        text-align: left;
        margin: 20px 0;
        color: #ddd;
        list-style: none;
    }
    .price ul li{
        margin: 15px 0;
    }
    .price ul li:before{
        content: '\2023';
        color: crimson;
        font-weight: bold;
        margin-right: 8px;
    }
    .price button{
        width: 100%;
        padding: 14px 0;
        background: transparent;
        color: white;
        font-size: 15px;
        border: 1px solid crimson;
        border-radius: 6px;
        margin-top: 30px;
        cursor: pointer;
    }
    .price button:hover{
        background: crimson;
    }
</style>
    <div class="container">
        <h2>Choose your Account Type Plan</h2>
        <div class="price">
            <div class="details">
                <p>Starter</p>
                <h3>$0 <span>/ month</span></h3>
                <ul>
                    <li>Free account</li>
                    <li>100 downloads available for beginning</li>
                    <li>No commercial licensing</li>
                    <li>Limited downloads</li>
                    <li>Cancel anytime</li>
                </ul>
                <button style="background:crimson;">Free-<span style="font-weight:bold;">Activated</span></button>
            </div>
        </div>
        <br>
        <div class="price">
            <div class="details">
                <p>Pro</p>
                <h3>$9.99<span>/ month</span></h3>
                <ul>
                    <li>2000 downloads available</li>
                    <li>Millions of Creative Assets</li>
                    <li>25% off from images price</li>
                    <li>Simple commercial licensing</li>
                    <li>Teams save up to 34%</li>
                    <li>Cancel anytime</li>
                </ul>
                <button>Buy</button>
            </div>
        </div>
        <br>
        <div class="price">
            <div class="details">
                <p>Premium</p>
                <h3>$29.99<span>/ month</span></h3>
                <ul>
                    <li>Unlimited Downloads</li>
                    <li>Custom License</li>
                    <li>Free Creativity Lessons</li>
                    <li>Millions of Creative Assets</li>
                    <li>25% off from images price</li>
                    <li>Cancel anytime</li>
                </ul>
                <button>Buy</button>
            </div>
        </div>
    </div>
<?php include 'header and footer/footer.php'?>