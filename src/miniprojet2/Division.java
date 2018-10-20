package miniprojet2;

public class Division extends OperationBinaire {
	private double Div1 ;
	private double Div2 ;
	
	
	public  Division ( double Div1 , double Div2  ){
		this.Div1=Div1;
		this.Div2=Div2;
		
	}
	
	public double getDiv1() {
		return Div1 ;
	}
	public void setDiv1 (double Di1 ) {
		Div1 = Di1 ;
	}
	public double getDiv2() {
		return Div2 ;
	}
	
	public void setDiv2 (double Di2) {
		Div2 = Di2 ;
	}
	
	public double calcul() {
		
		System.out.println("le résultat de la division est : ");
		return Div1/Div2;
	}

}
