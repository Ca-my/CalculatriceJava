package miniprojet2;
import java.util.Random;

public class Log extends OperationUnaire  {
	
    private double Log;
	
	public  Log( double Log ){
		this.Log= Log;
	}
	
	public double getLog() {
		return  Log ;
	}
	
	public void setLog(double Lg ) {
		 Log = Lg ;
	}
	public double  calcul() {
		
		System.out.println("le nombre en logarithme est  : " );
		return (Math.log(Log)) ;
	}
}
