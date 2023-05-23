
public class Classe1 {
	private String nome;
	private double diametro;
	private double perimetro;
	private double area;
	private int raggio;
	

	
	private String nome1;
	private double diametro1;
	private double perimetro1;
	private double area1;
	private int raggio1;
	
	
	
	private String nome2;
	private double diametro2;
	private double perimetro2;
	private double area2;
	private int raggio2;
	
	
	
	public Classe1(String nome,double diametro ,double perimetro,double area,int raggio,String nome1,double diametro1 ,double perimetro1,double area1,int raggio1, String nome2,double diametro2 ,double perimetro2,double area2,int raggio2) {
		this.nome=nome;
		this.diametro=diametro;
		this.perimetro=perimetro;
		this.area=area;
		this.raggio=raggio;
		this.nome1=nome1;
		this.diametro1=diametro1;
		this.perimetro1=perimetro1;
		this.area1=area1;
		this.raggio1=raggio1;
		this.nome2=nome2;
		this.diametro2=diametro2;
		this.perimetro2=perimetro2;
		this.area2=area2;
		this.raggio2=raggio2;
		
	
	
	}
	public String getNome() {
		return nome;
	}
	public String getNome1() {
		return nome1;
	}
	public String getNome2() {
		return nome2;
	}
	public double getDiametro(){
		return diametro;
	}
	public double getDiametro1(){
		return diametro1;
	}
	public double getDiametro2(){
		return diametro2;
	}
	
	public double getPerimetro() {
		return perimetro;
		}
	public double getPerimetro1() {
		return perimetro1;
	}
	public double getPerimetro2() {
		return perimetro2;
	}
	public double getArea() {
		return area;
	}
	public double getArea1() {
		return area1;
	}
	public double getArea2() {
		return area2;
	}
	
	public int getRaggio() {
		return raggio;
		
	}
	public int getRaggio1() {
		return raggio1;
		
	}
	public int getRaggio2() {
		return raggio2;
		
	}
	public int gettot() {
	return this.raggio + this.raggio1+ this.raggio2;
	
	}
	
	
	public void stampaInfo() {
		System.out.println("|---------------------|");
		System.out.println("|      Tabella        |");
		System.out.println("|---------------------|");
		
		
	}


}
