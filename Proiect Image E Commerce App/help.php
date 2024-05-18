<?php include 'header and footer/header.php';?>
<style>
  .containerhelp
{
    margin: 0 40px;
    max-width: 600px;
    display: flex;
    flex-direction: column;
    gap: 20px;
}
.containerhelp h1
{
    color: blueviolet;
}
.containerhelp .tab
{
    position: relative;
    background: #fff;
    padding: 0 20px 20px;
    box-shadow: 0 15px 25px rgba(0,0,0,0.05);
    border-radius: 5px;
    overflow: hidden;
}
.containerhelp .tab input
{
    appearance: none;
}
.containerhelp .tab label
{
    display: flex;
    align-items: center;
    cursor: pointer;
}
.containerhelp .tab label::after
{
    content: '+';
    position: absolute;
    right: 20px;
    font-size: 2em;
    color: dimgray;
    transition: transform 1s;
}
.containerhelp .tab:hover label::after
{
    color: black;
}
.containerhelp .tab input:checked ~ label::after
{
    transform: rotate(135deg);
}
.containerhelp .tab label h2
{
    width: 40px;
    height: 40px;
    background: #333;
    display: flex;
    justify-content: center;
    align-items: center;
    color: violet;
    font-size: 1.25em;
    border-radius: 5px;
    margin-right: 10px;
}
.containerhelp .tab label h3
{
    position: relative;
    font-weight: 500;
    color: dimgray;
    z-index: 10;
}
.containerhelp .tab .answercontent
{
    max-height: 0;
    transition: 1s;
    overflow: hidden;
}
.containerhelp .tab input:checked ~ .answercontent
{
    max-height: 100vh;
}
.containerhelp .tab .answercontent p
{
    position: relative;
    padding: 10px 0;
    color: blueviolet;
    z-index: 10;
}

</style>
<center>
  <div class="containerhelp">
                  <section style=" justify-content: center;text-align: center; padding-top: 200px;padding-left: 200px;">
                     <center>
                         <h1>Ce doresti sa stii?</h1>
                         <div class="tab">
                            <input type="radio" name="acc" id="acc1">
                            <label for="acc1">
                                 <h2>01</h2>
                                <h3>Care este orarul in care va pot contacta?</h3>
                            </label>
                            <div class="answercontent"><p>Ma pute-ti contacta in orice zi a saptamanii in intervalul 12:00-17:00.Accept email-uri, apele telefonice si SMS-uri.</p></div>
                        </div>
                        <div class="tab">
                            <input type="radio" name="acc" id="acc2">
                            <label for="acc2">
                                 <h2>02</h2>
                                <h3>Cat de bine securizate pot fi?</h3>
                            </label>
                            <div class="answercontent"><p>Depinde de contractul pe care il facem inaite de a incepe comanda.De obicei pentru proiectele de tip ECommercial, platforme de streaming sau portofolii folosesc numeroase metode de criptare a datelor personale si a tuturor datelor inregistrate din respectivele baze de date a proiectului.In contracte mereu instiintez clientii mei de responsabilitatea pe care o au de asi schimba parolele date de mine in fiecare luna din motive de securitate si ca nu raspund in cazul de spargeri sau furturi de date daca din neatentia clientului i-a fost spartwebsite-ul.</p></div>
                        </div>
                        <div class="tab">
                            <input type="radio" name="acc" id="acc2">
                            <label for="acc2">
                                 <h2>03</h2>
                                <h3>Ce servere folositi ca hosting?</h3>
                            </label>
                            <div class="answercontent"><p>Pentru website-uri de incepator sau cu scop de reclama folosesc host pe Github cu domeniu de pe Netifly.Pentru proiecte cu scop comercial sau pentru alte scopuri folosesc severe si domenii de la Blue Server, etc.</p></div>
                        </div>
                    </center>
                </section>
            </div>
          </center>

<?php include 'header and footer/footer.php'?>