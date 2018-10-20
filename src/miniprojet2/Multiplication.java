package miniprojet2;

public class Multiplication extends OperationBinaire {
	
	private double Mul1 ;
	private double Mul2 ;
	
	public  Multiplication ( double Mul1 , double Mul2){
		this.Mul1=Mul1;
		this.Mul2=Mul2;

	}
	
	public double getMul1() {
		return Mul1 ;
	}
	public void setMul1 (double Mu1 ) {
		Mul1 = Mu1 ;
	}
	public double getMul2() {
		return Mul2 ;
	}
	
	public void setMul2 (double Mu2) {
		Mul2 = Mu2 ;
	}

	public double  calcul() {

		System.out.println("le résultat de la multiplication est : ");
		return Mul1*Mul2;
		
	}



}
