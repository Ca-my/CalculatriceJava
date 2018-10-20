package miniprojet2;
import java.util.Random;

public class Exp extends OperationUnaire {
	
    private double Exp;
	
	public  Exp( double Exp ){
		this.Exp= Exp;
	}
	
	public double getExp() {
		return  Exp ;
	}
	
	public void setExp(double Ep ) {
		Exp = Ep ;
	}
	public double  calcul() {
		
		
		System.out.println("Le nombre en exponentielle est  : " );
		return (Math.exp(Exp)) ;
	}

}
