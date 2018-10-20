package miniprojet2;

public class addition extends OperationBinaire {
	private double Add1 ;
	private double Add2 ;
	//private float a ;
	
	public addition ( double Add1 , double Add2  ){
		this.Add1=Add1;
		this.Add2=Add2;
		
	}
	
	public double getAdd1() {
		return Add1 ;
	}
	public void setAdd1 (float Ad1 ) {
		Add1 = Ad1 ;
	}
	public double getAdd2() {
		return Add2 ;
	}
	
	public void setAdd2 (float Ad2) {
		Add2 = Ad2 ;
	}
	
	public double calcul() throws NumberFormatException {
		//a=Add1+Add2;
		System.out.println("Le résultat de l'addition est : ") ;
		return Add1+Add2 ;
		
	}

}
