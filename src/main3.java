
public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Classe1 TabellaInfo =new Classe1("Pallone da calcio",23.5,70.0,70.0,23,"Pallone da basket",24.5,80.0,80.0,24,"Pallone da pallavolo",22.5,50.0,50.0,22);
	
		
		
		TabellaInfo.stampaInfo();
		System.out.println("|-----------------------|");
		System.out.println("|      1)cerchio        |");
		System.out.println("|-----------------------|");
		System.out.println(TabellaInfo.getNome());
		System.out.println(TabellaInfo.getDiametro());
		System.out.println(TabellaInfo.getPerimetro());
		System.out.println(TabellaInfo.getArea());
		System.out.println(TabellaInfo.getRaggio());
		System.out.println("|-----------------------|");
		System.out.println("|      2)cerchio        |");
		System.out.println("|-----------------------|");
		System.out.println(TabellaInfo.getNome1());
		System.out.println(TabellaInfo.getDiametro1());
		System.out.println(TabellaInfo.getPerimetro1());
		System.out.println(TabellaInfo.getArea1());
		System.out.println(TabellaInfo.getRaggio1());
		System.out.println("|-----------------------|");
		System.out.println("|      3)cerchio        |");
		System.out.println("|-----------------------|");
		System.out.println(TabellaInfo.getNome2());
		System.out.println(TabellaInfo.getDiametro2());
		System.out.println(TabellaInfo.getPerimetro2());
		System.out.println(TabellaInfo.getArea2());
		System.out.println(TabellaInfo.getRaggio2());
		System.out.println("|-------------------------------------------|");
		System.out.println("|      La somma Totale dei tre raggi        |");
		System.out.println("|-------------------------------------------|");
		System.out.println("la somma dei tre raggi è : " + TabellaInfo.gettot());
	
		
		
		
		
		

	}



	}


