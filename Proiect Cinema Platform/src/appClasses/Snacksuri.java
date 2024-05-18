package appClasses;

import java.util.LinkedList;
import java.util.Scanner;



public class Snacksuri{
	int popcorn = 0;
	int pepsi = 0;
	int mic=10;
	int mediu=12;
	int mare=15;
	String pahar = "pahar";
	String sticla = "sticla";
	int pepsiS = 5;
	int pepsiP = 3;
	double pop;
	double suc;
	double suma;
	public void Snacksuri(){
		
		
		int rasp;
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Popcorn:  Mic(10 Lei), Mediu(12 Lei), Mare(15 Lei);");
		ll.add("\nPepsi: la Pahar(3 Lei), la Sticla(5 Lei)");
		System.out.println(ll);
		try {
		Scanner s = new Scanner(System.in);
		suma = pop + suc;
		System.out.println("In total va costa:" +suma + "Lei");
		System.out.println("Spuneti ce meniu de popcorn vreti(1-3): " + popcorn);
		System.out.println("Spuneti cum vreti sucul(Pahar/Sticla): " + pepsi);
		rasp = s.nextInt();
		if(rasp == 1) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Un meniu mic te costa:" + mic + "Lei. Cate doresti:");
			popcorn = s1.nextInt();
			pop = popcorn + mic;
			Snacksuri();
		}else if(rasp == 2) {
			Scanner s2 = new Scanner(System.in);
			System.out.println("Un meniu mediu te costa:" + mediu + "Lei");
			popcorn = s2.nextInt();
			pop = popcorn + mediu;
			Snacksuri();
		}else if(rasp == 3) {
			Scanner s3 = new Scanner(System.in);
			System.out.println("Un meniu mare te costa:" + mare + "Lei");
			popcorn = s3.nextInt();
			pop = popcorn + mare;
			Snacksuri();
		}else if(rasp == 4) {
			Scanner s4 = new Scanner(System.in);
			System.out.println("Un suc la:" + pahar + "3 Lei");
			pepsi = s4.nextInt();
			suc = pepsi + pepsiP;
			Snacksuri();
		}else if(rasp == 5) {
			Scanner s5 = new Scanner(System.in);
			System.out.println("Un suc la:" + sticla + "5 Lei");
			pepsi = s5.nextInt();
			suc = pepsi + pepsiS;
			Snacksuri();
		}
		}catch(Exception e) {
			System.out.println("Nu ai ales nimic.");
		}
		
				
	}
}
