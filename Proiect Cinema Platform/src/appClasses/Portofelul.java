package appClasses;

import java.util.Scanner;

import appInterfaces.Cinema;
import appUI.FilmeAventura;
import appUI.FilmeComedie;
import appUI.FilmeDrama;
import appUI.FilmeGroaza;

public abstract class Portofelul implements  Cinema{
	private double suma = 30.0;
	private double subtotal;
	private double sumatotala;
	private double rasp;
	private double value;
	public int aventura = 0;
	public int drama =0;
	public int groaza = 0;
	public int comedie = 0;
	public Portofelul(double suma, double subtotal,double sumatotala) {
		this.suma = suma;
		this.subtotal = subtotal;
		this.sumatotala = sumatotala;
	}
	@Override
	public double getSuma() {
		return this.suma;
	}
	public void setSuma(double value,double suma) {
		
		this.suma = value;
		
	}
	@Override
	public double getSubtotal() {
		return this.subtotal;
	}
	public void setSubtotal(double value) {
		this.subtotal = value;
	}
	@Override
	public double getSumaTotala() {
		return this.sumatotala;
	}
	public void setSumaTotala(double value) {
		this.sumatotala = value;
	}
	@Override
	public void Plata() {
		Scanner s = new Scanner(System.in);
		if(aventura > 0 && drama == 0) {
			sumatotala = aventura * 20;
			subtotal = sumatotala * suma;
			rasp = subtotal + sumatotala;
			System.out.println("Ai cumparat" + aventura + "bilet(e) in valoare de " + rasp + "la acest film de aventura");
			FilmeAventura lf = new FilmeAventura();
			
		}
		else if(drama > 0 && aventura == 0) {
			sumatotala = drama * 10;
			subtotal = sumatotala * suma;
			rasp = subtotal + sumatotala;
			System.out.println("Ai cumparat" + drama + "bilet(e) in valoare de " + rasp + "la acest film de drama");
			FilmeDrama lf = new FilmeDrama();
			
		}
		else if(groaza > 0 && comedie == 0) {
			sumatotala = groaza * 25;
			subtotal = sumatotala * suma;
			rasp = subtotal + sumatotala;
			System.out.println("Ai cumparat" + groaza + "bilet(e) in valoare de " + rasp + "la acest film de groaza");
			FilmeGroaza lf = new FilmeGroaza();
			
		}
		else if(comedie > 0 && groaza == 0) {
			sumatotala = comedie * 21;
			subtotal = sumatotala * suma;
			rasp = subtotal + sumatotala;
			System.out.println("Ai cumparat" + comedie + "bilet(e) in valoare de " + rasp + "la acest film de comedie");
			FilmeComedie lf = new FilmeComedie();
			
		}
	}
	public Portofelul() {
		
	}
	public boolean equals(Object c) {
		if(c instanceof Portofelul) {
			
		}
		return false;
	}
}
