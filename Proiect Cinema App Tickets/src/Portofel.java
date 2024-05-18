import java.util.Scanner;
import java.io.IOException;
public class Portofel {
	private double suma = 30.0;
	private double subtotal;
	private double sumatotala;
	private double rasp;
	public int aventura = 0;
	public int drama =0;
	public int groaza = 0;
	public int comedie = 0;
	public Portofel(double suma) {
		this.suma = suma;
	}
	public double getSuma() {
		return this.suma;
	}
	public void setSuma(double value) {
		
		this.suma = value;
	}
	public double getSubtotal() {
		return this.subtotal;
	}
	public void setSubtotal(double value) {
		this.subtotal = value;
	}
	public double getSumaTotala() {
		return this.sumatotala;
	}
	public void setSumaTotala(double value) {
		this.sumatotala = value;
	}
	public void Plata() {
		Scanner s = new Scanner(System.in);
		if(aventura > 0 && drama == 0) {
			sumatotala = aventura * 20;
			subtotal = sumatotala * suma;
			rasp = subtotal + sumatotala;
			System.out.println("Ai cumparat" + aventura + "bilet(e) in valoare de " + rasp + "la acest film de aventura");
			Lista_Filme lf = new Lista_Filme();
			lf.ListaFilmeAventura();
		}
		else if(drama > 0 && aventura == 0) {
			sumatotala = drama * 10;
			subtotal = sumatotala * suma;
			rasp = subtotal + sumatotala;
			System.out.println("Ai cumparat" + drama + "bilet(e) in valoare de " + rasp + "la acest film de drama");
			Lista_Filme lf = new Lista_Filme();
			lf.ListaFilmeDrama();
		}
		else if(groaza > 0 && comedie == 0) {
			sumatotala = groaza * 25;
			subtotal = sumatotala * suma;
			rasp = subtotal + sumatotala;
			System.out.println("Ai cumparat" + groaza + "bilet(e) in valoare de " + rasp + "la acest film de groaza");
			Lista_Filme lf = new Lista_Filme();
			lf.ListaFilmeGroaza();
		}
		else if(comedie > 0 && groaza == 0) {
			sumatotala = comedie * 21;
			subtotal = sumatotala * suma;
			rasp = subtotal + sumatotala;
			System.out.println("Ai cumparat" + comedie + "bilet(e) in valoare de " + rasp + "la acest film de comedie");
			Lista_Filme lf = new Lista_Filme();
			lf.ListaFilmeComedie();
		}
	}
	public Portofel() {
		
	}
}
