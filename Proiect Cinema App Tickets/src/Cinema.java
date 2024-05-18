import java.util.LinkedList;
import java.util.Scanner;
import java.io.IOException;
public class Cinema {
	public int rasp2;
	public  Cinema() {
		try {
		Scanner al2 = new Scanner(System.in);
		System.out.println("A.Categorii:" + "\n\t1.Aventura" + "\n\t2.Drama" + "\n\t3.Groaza" + "\n\t4.Comedie" + "\nB.Gustari\t\tCumpara");
		rasp2 = al2.nextInt();
		if(rasp2 == 1) {
			Lista_Filme ci = new Lista_Filme();
			ci.ListaFilmeAventura();
		}else if(rasp2 == 2){
			Lista_Filme ci2 = new Lista_Filme();
			ci2.ListaFilmeDrama();
		}else if(rasp2 == 3) {
			Lista_Filme ci3 = new Lista_Filme();
			ci3.ListaFilmeGroaza();
		}else if(rasp2 == 4) {
			Lista_Filme ci4 = new Lista_Filme();
			ci4.ListaFilmeComedie();
		}else if(rasp2 == 5) {
			Portofel po = new Portofel();
			po.Plata();
		}else if(rasp2 == 6) {
			Snacks sn = new Snacks();
			sn.Snacks();
		}
		}
		catch(Exception e){
			System.out.println("Eroare!");
		}
	}
	public static void main(String args[]) {
		System.out.println("Cinema");
		
		LinkedList<String> ll = new LinkedList<String>();
		
		Scanner al = new Scanner(System.in);
		String rasp ="DA";
		String rasp1="NU";
		System.out.println("Salut! Vrei sa vezi un film? :" );
		ll.add("DA sau NU");
		System.out.println(ll);
		rasp = al.next();
		System.out.println(rasp + "Super!Te rog, alege ce film doresti sa-l vezi?");
		Cinema c = new Cinema();
		Portofel po = new Portofel();
		po.getSuma();
		po.setSuma(20);
		
		
		
		
		
	}
}
