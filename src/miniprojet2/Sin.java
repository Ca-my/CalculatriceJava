package miniprojet2;
import java.util.Random;

public class Sin extends OperationUnaire  {
	
private double Sin;
	
	public  Sin ( double Sin ){
		this.Sin=Sin;
	}
	
	public double getSin() {
		return Sin ;
	}

	public void setSin(double Sn ) {
		 Sin = Sn ;
	}
	public double  calcul() {
	
		double x=Math.toRadians(Sin);
		
		System.out.println("le nombre en sinus est  : " );
		return (Math.sin(x)) ;
	}

}
