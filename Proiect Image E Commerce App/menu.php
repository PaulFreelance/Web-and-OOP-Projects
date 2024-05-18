<?php include 'header and footer/header.php';?>
<?php 
//session_start();
include("connect.php");
 //$user_data = check_login($con);
?>
<style>
    .container
    {
        width: 100%;
        min-height: 100vh;
        background: #5c539d;
    }
    #categories{
        text-align: center;
        align-items: center;
        justify-content: space-between;
        text-transform: uppercase;
        font-weight: bold;
        padding: 20px;
        
    }
    #categories a{
        background-color: aliceblue;
        list-style: none;
        justify-content: space-between;
        text-decoration: none;
        color: blueviolet;
        border-radius: 10px;
        letter-spacing: 4px;
    }
    #categories a:hover, a.active{
        background-color: var(--secondary-color);
        color: aliceblue;
    }
    .products{
    width: 100%;
    align-self: center;
    height: 70%;
    display: flex;
    justify-content: center;
    flex-wrap: wrap;
    gap: 40px;
}
    .product{
    position: relative;
    background-color: #fff;
    width: 350px;
    height: 100%;
    box-shadow: 0 5px 20px rgba(0, 0, 0, .3);
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    padding: 20px 20px 40px;
    border-radius: 10px;
    transition: .3s;
}
    .image{
    width:100%;
    height: 60%;
    display: grid;
    place-content: center;
}
    .image img{
    width: 240px;
}
    .pret{
    width: 100%;
    display: flex;
    justify-content: space-between;
}
    .pret h3{
    font-size: 2em;
    text-transform: capitalize;
    
}
    .pret span{
    font-size: 1.5em;
    color: violet;
}
    .product p{
    font-size: 18px;
    line-height: 25px;
}
    .purchase{
    position: absolute;
    bottom: 20px;
    right: 20px;
}
    .purchase button{
    padding: 10px 20px;
    border-radius: 7px;
    border: none;
    background-color: blueviolet;
    color:darkkhaki;
    font-size: 18px;
    text-transform: capitalize;
    cursor: pointer;
    transition: .5s;
}
    .purchase button:hover{
     transform: scale(1.1);
}
    .stars svg{
    font-size: 1.3em;
    color: yellow;
}
</style>
    <br><br>
    <div class="container">
        <center>
             <div id="categories" style="text-align: center;align-items: center;justify-content: space-between;text-transform: uppercase;">
                <a href="menu.php" class="active">All</a></li>
                <a onclick="changeProducts()">Mountains</a>
                <a href="">City</a>
                <a href="">Kinghts/ Dragons</a>
                <a href="">Graphic Novel</a>
                <a href="">Comic book art</a>
            </div>
        </center>
        <br><br><br><br>
        <div class="products">
            <!--Mountains and Nature Section-->
            
            <div class="product" id="mountain">
                <div class="image">
                    <img src="resources/mountain/1.png" alt="">
                </div>
                <div class="pret">
                    <h3>mountain</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button><a href="product1.php" style="text-decoration: none;color:darkkhaki;"> Purchase</a> </button>
                </div>
            </div>
            <div class="product" id="mountain">
                <div class="image">
                    <img src="resources/mountain/2.png" alt="">
                </div>
                <div class="pret">
                    <h3>mountain</h3>
                    <span>FREE</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="mountain">
                <div class="image">
                    <img src="resources/mountain/3.png" alt="">
                </div>
                <div class="pret">
                    <h3>mountain</h3>
                    <span>$ 5.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="mountain">
                <div class="image">
                    <img src="resources/mountain/4.png" alt="">
                </div>
                <div class="pret">
                    <h3>mountain</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="mountain">
                <div class="image">
                    <img src="resources/mountain/5.png" alt="">
                </div>
                <div class="pret">
                    <h3>mountain</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="mountain">
                <div class="image">
                    <img src="resources/mountain/6.png" alt="">
                </div>
                <div class="pret">
                    <h3>mountain</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="mountain">
                <div class="image">
                    <img src="resources/mountain/7.png" alt="">
                </div>
                <div class="pret">
                    <h3>mountain</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="mountain">
                <div class="image">
                    <img src="resources/mountain/8.png" alt="">
                </div>
                <div class="pret">
                    <h3>mountain</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <!--Night City Section-->
           
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/1.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/2.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/3.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/4.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/5.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/6.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/7.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/8.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/9.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/10.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/11.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/12.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/13.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/14.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/15.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/16.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="city">
                <div class="image">
                    <img src="resources/city/17.png" alt="">
                </div>
                <div class="pret">
                    <h3>night city</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <!--Knights & Dragons Section-->
            
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/1.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/2.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/3.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/4.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/5.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/6.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/7.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/8.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/9.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/10.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/11.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <<div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/12.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="knights">
                <div class="image">
                    <img src="resources/knights and dragons/13.png" alt="">
                </div>
                <div class="pret">
                    <h3>dragons</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <!--Graphic Novel Section-->
            
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/1.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/2.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/3.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/4.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/5.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/6.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/7.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/8.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/9.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
               <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/10.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/11.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/12.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/13.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/14.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/15.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/16.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/17.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/18.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/graphic novel/19.png" alt="">
                </div>
                <div class="pret">
                    <h3>novel</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <!--Comic Book Art Section-->
            
            <div class="product" id="comic">
                <div class="image">
                    <img src="resources/comics/1.png" alt="">
                </div>
                <div class="pret">
                    <h3>issue #1</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="comic">
                <div class="image">
                    <img src="resources/comics/2.png" alt="">
                </div>
                <div class="pret">
                    <h3>issue #2</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="comic">
                <div class="image">
                    <img src="resources/comics/3.png" alt="">
                </div>
                <div class="pret">
                    <h3>issue #3</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
               <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="graphic">
                <div class="image">
                    <img src="resources/comics/4.png" alt="">
                </div>
                <div class="pret">
                    <h3>issue #4</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="comic">
                <div class="image">
                    <img src="resources/comics/5.png" alt="">
                </div>
                <div class="pret">
                    <h3>issue #5</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="comic">
                <div class="image">
                    <img src="resources/comics/6.png" alt="">
                </div>
                <div class="pret">
                    <h3>issue #6</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="comic">
                <div class="image">
                    <img src="resources/comics/7.png" alt="">
                </div>
                <div class="pret">
                    <h3>issue #7</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="comic">
                <div class="image">
                    <img src="resources/comics/8.png" alt="">
                </div>
                <div class="pret">
                    <h3>issue #8</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="comic">
                <div class="image">
                    <img src="resources/comics/9.png" alt="">
                </div>
                <div class="pret">
                    <h3>issue #9</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="comic">
                <div class="image">
                    <img src="resources/comics/10.png" alt="">
                </div>
                <div class="pret">
                    <h3>issue #10</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
            <div class="product" id="comic">
                <div class="image">
                    <img src="resources/comics/11.png" alt="">
                </div>
                <div class="pret">
                    <h3>issue #11</h3>
                    <span>$ 15.99</span>
                </div>
                <p>Lorem ipsum dolor sit amet consectetur...</p>
                <div class="stars" style="color: blueviolet;">
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-solid fa-star"></i>
                    <i class="fa-regular fa-star"></i>
                </div>
                <div class="purchase">
                    <br>
                    <button> Purchase </button>
                </div>
            </div>
        
</div>
	<br>
    <script>
        function changeProducts() {
            var img =document.getElementById('city');
            img.src = 'resources/mountain.png';
        }
    </script>
    	
   <?php include 'header and footer/footer.php'?>