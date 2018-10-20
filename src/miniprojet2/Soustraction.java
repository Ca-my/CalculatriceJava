package miniprojet2;

public class Soustraction extends OperationBinaire {
	private double Sou1 ;
	private double Sou2 ;
	
	
	public  Soustraction ( double Sou1 , double Sou2  ){
		this.Sou1=Sou1;
		this.Sou2=Sou2;
		
	}
	
	public double getSou1() {
		return Sou1 ;
	}
	public void setAdd1 (double So1 ) {
		Sou1 = So1 ;
	}
	public double getSou2() {
		return Sou2 ;
	}
	
	public void setAdd2 (double So2) {
		Sou2 = So2 ;
	}
	
	public double  calcul() {
		
		System.out.println("le résultat de la soustraction est : ");
		return Sou1-Sou2;
		
	}

}
