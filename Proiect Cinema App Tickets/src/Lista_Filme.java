import java.util.*;

import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.io.*;
public class Lista_Filme{
	public ArrayList<String> arls =new ArrayList<String>();
	int aventura = 0;
	public void ListaFilmeAventura() {
	
	String film;
	try {
		Scanner al = new Scanner(System.in);
		System.out.println("Ai primit" + aventura + "de bilete la un film de aventura");
		System.out.println("\n\tIndiana Jones" + "\n\tJumanji" + "\n\tLibrarian" + "\n\tGolden Eye" 
				+ "\n\tInvaders" + "\n\tThe Saint" + "\n\tJurrassic Park" +"\n\t\tInapoi" + "\n\t\tCumpara");
    	int alg;
    	System.out.println("Doresti un bilet la unul dinte aceste filme?");
    	alg = al.nextInt();
    	if(alg == 1) {
    		Scanner al1 = new Scanner(System.in);
    		System.out.println("Vrei un bilet la acest film?");
    		String DoN = al1.nextLine();
    		char DoN2 = DoN.charAt(0);
    		if(DoN2 == 'y' || DoN2 == 'Y') {
    			Scanner al2 = new Scanner(System.in);
    			System.out.println("Cate bilete doresti?");
    			aventura = al2.nextInt();
    			ListaFilmeAventura();
    			
    		}
    		else if(DoN2 == 'n' || DoN2 == 'N'){
    			ListaFilmeAventura();
    		}
    	}else if(alg == 2) {
    		Scanner al3 = new Scanner(System.in);
    		System.out.println("Vrei un bilet la acest film?");
    		String DoN3 = al3.nextLine();
    		char DoN4 = DoN3.charAt(0);
    		if(DoN4 == 'y' || DoN4 == 'Y') {
    			Scanner al4 = new Scanner(System.in);
    			System.out.println("Cate bilete doresti?");
    			aventura = al4.nextInt();
    			ListaFilmeAventura();
    			
    		}
    		else if(DoN4 == 'n' || DoN4 == 'N'){
    			ListaFilmeAventura();
    		}
    	}else if(alg == 3) {
    		Scanner al5 = new Scanner(System.in);
    		System.out.println("Vrei un bilet la acest film?");
    		String DoN5 = al5.nextLine();
    		char DoN6 = DoN5.charAt(0);
    		if(DoN6 == 'y' || DoN6 == 'Y') {
    			Scanner al6 = new Scanner(System.in);
    			System.out.println("Cate bilete doresti?");
    			aventura = al6.nextInt();
    			ListaFilmeAventura();
    			
    		}
    		else if(DoN6 == 'n' || DoN6 == 'N'){
    			ListaFilmeAventura();
    		}
    	}else if(alg == 4) {
    		Scanner al7 = new Scanner(System.in);
    		System.out.println("Vrei un bilet la acest film?");
    		String DoN7 = al7.nextLine();
    		char DoN8 = DoN7.charAt(0);
    		if(DoN8 == 'y' || DoN8 == 'Y') {
    			Scanner al8 = new Scanner(System.in);
    			System.out.println("Cate bilete doresti?");
    			aventura = al8.nextInt();
    			ListaFilmeAventura();
    			
    		}
    		else if(DoN8 == 'n' || DoN8 == 'N'){
    			ListaFilmeAventura();
    		}
    	}else if(alg == 5) {
    		Scanner al9 = new Scanner(System.in);
    		System.out.println("Vrei un bilet la acest film?");
    		String DoN9 = al9.nextLine();
    		char DoN10 = DoN9.charAt(0);
    		if(DoN10 == 'y' || DoN10 == 'Y') {
    			Scanner al10 = new Scanner(System.in);
    			System.out.println("Cate bilete doresti?");
    			aventura = al10.nextInt();
    			ListaFilmeAventura();
    			
    		}
    		else if(DoN10 == 'n' || DoN10 == 'N'){
    			ListaFilmeAventura();
    		}
    	}else if(alg == 6) {
    		Scanner al11 = new Scanner(System.in);
    		System.out.println("Vrei un bilet la acest film?");
    		String DoN11 = al11.nextLine();
    		char DoN12 = DoN11.charAt(0);
    		if(DoN12 == 'y' || DoN12 == 'Y') {
    			Scanner al12 = new Scanner(System.in);
    			System.out.println("Cate bilete doresti?");
    			aventura = al12.nextInt();
    			ListaFilmeAventura();
    			
    		}
    		else if(DoN12 == 'n' || DoN12 == 'N'){
    			ListaFilmeAventura();
    		}
    	}else if(alg == 7) {
    		Scanner al13 = new Scanner(System.in);
    		System.out.println("Vrei un bilet la acest film?");
    		String DoN13 = al13.nextLine();
    		char DoN14 = DoN13.charAt(0);
    		if(DoN14 == 'y' || DoN14 == 'Y') {
    			Scanner al14 = new Scanner(System.in);
    			System.out.println("Cate bilete doresti?");
    			aventura = al14.nextInt();
    			ListaFilmeAventura();
    			
    		}
    		else if(DoN14 == 'n' || DoN14 == 'N'){
    			ListaFilmeAventura();
    		}
    	}else if(alg == 8) {
    		Cinema ci = new Cinema();
    	}else if(alg == 9) {
    		Portofel po = new Portofel();
			po.Plata();
    	}
		}catch(Exception e) {
			System.out.println("Eroare!");
		}
    /*switch (aventura) {
        case 1:{  arls.add("Indiana Jones");
        	Scanner al = new Scanner(System.in);
        	String alg;
        	System.out.println("Doresti un bilet la acest film?");
        	alg = al.next();
        	
        break;}
        case 2:  arls.add("Jumanji");
        break;
        case 3:  arls.add("Librarian");
        break;
        case 4:  arls.add("Golden Eye");
        break;
        case 5:  arls.add("Invaders");
        break;
        case 6:  arls.add("The Saint");
        break;
        case 7:  arls.add("Jurrassic Park");
                 break;
        default: break;
    }*/
	}
	int drama = 0;
	public void ListaFilmeDrama() {
		try {
			Scanner dr = new Scanner(System.in);
			System.out.println("Ai primit" + drama + "de bilete la un film de drama");
			System.out.println("\n\tHouse on the Lake" + "\n\tLast Man from the Earth" + "\n\tTitanic" + "\n\tPerfect" + "\n\t\tInapoi" + "\n\t\tCumpara");
	    	int alg;
	    	System.out.println("Doresti un bilet la unul dinte aceste filme?");
	    	alg = dr.nextInt();
	    	if(alg == 1) {
	    		Scanner dr1 = new Scanner(System.in);
	    		System.out.println("Vrei un bilet la acest film?");
	    		String DoN = dr1.nextLine();
	    		char DoN2 = DoN.charAt(0);
	    		if(DoN2 == 'y' || DoN2 == 'Y') {
	    			Scanner dr2 = new Scanner(System.in);
	    			System.out.println("Cate bilete doresti?");
	    			drama = dr2.nextInt();
	    			ListaFilmeDrama();
	    			
	    		}
	    		else if(DoN2 == 'n' || DoN2 == 'N'){
	    			ListaFilmeDrama();
	    		}
	    	}else if(alg == 2) {
	    		Scanner dr3 = new Scanner(System.in);
	    		System.out.println("Vrei un bilet la acest film?");
	    		String DoN3 = dr3.nextLine();
	    		char DoN4 = DoN3.charAt(0);
	    		if(DoN4 == 'y' || DoN4 == 'Y') {
	    			Scanner dr4 = new Scanner(System.in);
	    			System.out.println("Cate bilete doresti?");
	    			drama = dr4.nextInt();
	    			ListaFilmeDrama();
	    			
	    		}
	    		else if(DoN4 == 'n' || DoN4 == 'N'){
	    			ListaFilmeDrama();
	    		}
	    	}else if(alg == 3) {
	    		Scanner dr5 = new Scanner(System.in);
	    		System.out.println("Vrei un bilet la acest film?");
	    		String DoN5 = dr5.nextLine();
	    		char DoN6 = DoN5.charAt(0);
	    		if(DoN6 == 'y' || DoN6 == 'Y') {
	    			Scanner dr6 = new Scanner(System.in);
	    			System.out.println("Cate bilete doresti?");
	    			drama = dr6.nextInt();
	    			ListaFilmeDrama();
	    			
	    		}
	    		else if(DoN6 == 'n' || DoN6 == 'N'){
	    			ListaFilmeDrama();
	    		}
	    	}else if(alg == 4) {
	    		Scanner dr7 = new Scanner(System.in);
	    		System.out.println("Vrei un bilet la acest film?");
	    		String DoN7 = dr7.nextLine();
	    		char DoN8 = DoN7.charAt(0);
	    		if(DoN8 == 'y' || DoN8 == 'Y') {
	    			Scanner dr8 = new Scanner(System.in);
	    			System.out.println("Cate bilete doresti?");
	    			drama = dr8.nextInt();
	    			ListaFilmeDrama();
	    			
	    		}
	    		else if(DoN8 == 'n' || DoN8 == 'N'){
	    			ListaFilmeDrama();
	    		}
	    	}else if(alg == 5) {
	    		Cinema ci = new Cinema();
	    	}else if(alg == 6) {
	    		Portofel po = new Portofel();
	    		po.Plata();
	    	}
		}catch(Exception e){
			System.out.println("Eroare!");
		}
	}
	int groaza = 0;
	public void ListaFilmeGroaza() {
		try {
			Scanner gr = new Scanner(System.in);
			System.out.println("Ai primit" + groaza + "de bilete la un film de groaza");
			System.out.println("\n\tHouse of Haunted Hill" + "\n\tThe Thing" + "\n\tThe Shinning" 
			+ "\n\tNosferatu" + "\n\tMark of Vampire" +"\n\t\tInapoi");
	    	int alg;
	    	System.out.println("Doresti un bilet la unul dinte aceste filme?");
	    	alg = gr.nextInt();
	    	if(alg == 1) {
	    		Scanner gr1 = new Scanner(System.in);
	    		System.out.println("Vrei un bilet la acest film?");
	    		String DoN = gr1.nextLine();
	    		char DoN2 = DoN.charAt(0);
	    		if(DoN2 == 'y' || DoN2 == 'Y') {
	    			Scanner gr2 = new Scanner(System.in);
	    			groaza = gr2.nextInt();
	    			
	    		}
	    		else if(DoN2 == 'n' || DoN2 == 'N'){
	    			ListaFilmeGroaza();
	    		}
	    	}else if(alg == 2) {
	    		Scanner gr3 = new Scanner(System.in);
	    		System.out.println("Vrei un bilet la acest film?");
	    		String DoN3 = gr3.nextLine();
	    		char DoN4 = DoN3.charAt(0);
	    		if(DoN4 == 'y' || DoN4 == 'Y') {
	    			Scanner gr4 = new Scanner(System.in);
	    			groaza = gr4.nextInt();
	    			
	    		}
	    		else if(DoN4 == 'n' || DoN4 == 'N'){
	    			ListaFilmeGroaza();
	    		}
	    	}else if(alg == 3) {
	    		Scanner gr5 = new Scanner(System.in);
	    		System.out.println("Vrei un bilet la acest film?");
	    		String DoN5 = gr5.nextLine();
	    		char DoN6 = DoN5.charAt(0);
	    		if(DoN6 == 'y' || DoN6 == 'Y') {
	    			Scanner gr6 = new Scanner(System.in);
	    			groaza = gr6.nextInt();
	    			
	    		}
	    		else if(DoN6 == 'n' || DoN6 == 'N'){
	    			ListaFilmeGroaza();
	    		}
	    	}else if(alg == 4) {
	    		Scanner gr7 = new Scanner(System.in);
	    		System.out.println("Vrei un bilet la acest film?");
	    		String DoN7 = gr7.nextLine();
	    		char DoN8 = DoN7.charAt(0);
	    		if(DoN8 == 'y' || DoN8 == 'Y') {
	    			Scanner gr8 = new Scanner(System.in);
	    			groaza = gr8.nextInt();
	    			
	    		}
	    		else if(DoN8 == 'n' || DoN8 == 'N'){
	    			ListaFilmeGroaza();
	    		}
	    	}else if(alg == 5) {
	    		Scanner gr9 = new Scanner(System.in);
	    		System.out.println("Vrei un bilet la acest film?");
	    		String DoN9 = gr9.nextLine();
	    		char DoN10 = DoN9.charAt(0);
	    		if(DoN10 == 'y' || DoN10 == 'Y') {
	    			Scanner gr10 = new Scanner(System.in);
	    			groaza = gr10.nextInt();
	    			
	    		}
	    		else if(DoN10 == 'n' || DoN10 == 'N'){
	    			ListaFilmeGroaza();
	    		}
	    	}else if(alg == 6) {
	    		Cinema ci = new Cinema();
	    	}else if(alg == 7) {
	    		Portofel po = new Portofel();
	    		po.Plata();
	    	}
		}catch(Exception e) {
			System.out.println("Eroare!");
		}
	}
	int comedie = 0;
	public void ListaFilmeComedie() {
		try {
			Scanner co = new Scanner(System.in);
			System.out.println("Ai primit" + comedie + "de bilete la un film de comedie");
			System.out.println("\n\tHow to Kill My Wife" + "\n\tHibernatus" + "\n\tJohnny English" + "\n\t\tInapoi");
	    	int alg;
	    	System.out.println("Doresti un bilet la unul dinte aceste filme?");
	    	alg = co.nextInt();
	    	if(alg == 1) {
	    		Scanner co1 = new Scanner(System.in);
	    		System.out.println("Vrei un bilet la acest film?");
	    		String DoN = co1.nextLine();
	    		char DoN2 = DoN.charAt(0);
	    		if(DoN2 == 'y' || DoN2 == 'Y') {
	    			Scanner co2 = new Scanner(System.in);
	    			comedie = co2.nextInt();
	    			
	    		}
	    		else if(DoN2 == 'n' || DoN2 == 'N'){
	    			ListaFilmeComedie();
	    		}
	    	}else if(alg == 2) {
	    		Scanner co3 = new Scanner(System.in);
	    		System.out.println("Vrei un bilet la acest film?");
	    		String DoN3 = co3.nextLine();
	    		char DoN4 = DoN3.charAt(0);
	    		if(DoN4 == 'y' || DoN4 == 'Y') {
	    			Scanner co4 = new Scanner(System.in);
	    			comedie = co4.nextInt();
	    			
	    		}
	    		else if(DoN4 == 'n' || DoN4 == 'N'){
	    			ListaFilmeComedie();
	    		}
	    	}else if(alg == 3) {
	    		Scanner co5 = new Scanner(System.in);
	    		System.out.println("Vrei un bilet la acest film?");
	    		String DoN5 = co5.nextLine();
	    		char DoN6 = DoN5.charAt(0);
	    		if(DoN6 == 'y' || DoN6 == 'Y') {
	    			Scanner co6 = new Scanner(System.in);
	    			comedie = co6.nextInt();
	    			
	    		}
	    		else if(DoN6 == 'n' || DoN6 == 'N'){
	    			ListaFilmeComedie();
	    		}
	    	}else if(alg == 4) {
	    		Cinema ci = new Cinema();
	    	}else if(alg == 5) {
	    		Portofel po = new Portofel();
	    		po.Plata();
	    	}
		}catch(Exception e) {
			System.out.println("Eroare!");
		}
	}
	
	
	
}
