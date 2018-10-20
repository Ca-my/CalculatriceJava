package miniprojet2;
import java.awt.Container;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Scanner;

public class Fenetre extends JFrame implements ActionListener
{
	
	private Container contenu;
	//private JPanel  pano;
	private JButton OpeBin;
	private JButton OpeUnai;
	private JButton Add, Sou, Mul, Div, Cos, Sin, Log, Exp;
	private JLabel affichage;
	private JTextArea texte, texte1, texte2, texte3, texte4;
	
	public Fenetre()
	{
		setTitle("BOUZIANE & ZERROUKI");
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contenu=this.getContentPane();
		contenu.setLayout(null);
		
		
		
		
		//pano=new JPanel(new BorderLayout(40,70));
		OpeBin= new JButton("Opération Binaire");
		OpeUnai= new JButton("Opération Unaire");
		OpeBin.addActionListener(this);
		OpeUnai.addActionListener(this);
		contenu.add(OpeBin);
		contenu.add(OpeUnai);
		OpeBin.setBounds(245, 50, 200, 50);
		OpeUnai.setBounds(245,105, 200, 50);
		
		
		
		

		
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()== OpeBin)
		{
			
			
			
			
			Add= new JButton("Addition");
			Add.addActionListener(this);
			contenu.add(Add);
			Add.setBounds(50, 200, 150, 50);
			
			Sou= new JButton("Soustraction");
			Sou.addActionListener(this);
			contenu.add(Sou);
			Sou.setBounds(50, 255, 150, 50);
			
			Mul= new JButton("Multiplication");
			Mul.addActionListener(this);
			contenu.add(Mul);
			Mul.setBounds(50,310, 150, 50);
			
			Div= new JButton("Division");
			Div.addActionListener(this);
			contenu.add(Div);
			Div.setBounds(50, 365, 150, 50);
			
			texte=new JTextArea();
			contenu.add(texte);
			Border border= BorderFactory.createLineBorder(Color.black, 1);
			texte.setBorder(border);
			texte.setBounds(350, 200, 100, 30);
					
			texte1=new JTextArea();
			contenu.add(texte1);
			Border border1= BorderFactory.createLineBorder(Color.black, 1);
			texte1.setBorder(border1);
			texte1.setBounds(350, 235, 100, 30);
			
			affichage = new JLabel();
			contenu.add(affichage);
			affichage.setBounds(220, 190, 150, 50);
			affichage.setText(" La première valeur :");
			
			affichage = new JLabel();
			contenu.add(affichage);
			affichage.setBounds(220, 225, 150, 50);
			affichage.setText(" La deuxième valeur :");
		}
		
		if (e.getSource()== OpeUnai)
		{
			Cos= new JButton("Cosinus");
		    Cos.addActionListener(this);
		 contenu.add(Cos);
	     Cos.setBounds(500, 200, 150, 50);
		
		Sin= new JButton("Sinus");
		Sin.addActionListener(this);
		contenu.add(Sin);
		Sin.setBounds(500, 255, 150, 50);
		
		Log= new JButton("Logarithme");
		Log.addActionListener(this);
		contenu.add(Log);
		Log.setBounds(500,310, 150, 50);
		
		Exp= new JButton("Exponentielle");
		Exp.addActionListener(this);
		contenu.add(Exp);
		Exp.setBounds(500, 365, 150, 50);
		
		texte3=new JTextArea();
		contenu.add(texte3);
		Border border= BorderFactory.createLineBorder(Color.black, 1);
		texte3.setBorder(border);
		texte3.setBounds(350, 350, 100, 30);
		
		affichage = new JLabel();
		contenu.add(affichage);
		affichage.setBounds(280, 340, 150, 50);
		affichage.setText(" La valeur :");
				
		}
		
		//////////////
		if (e.getSource()==Cos)
		{
					texte4=new JTextArea();
					contenu.add(texte4);
					Border border2= BorderFactory.createLineBorder(Color.yellow, 1);
					texte4.setBorder(border2);
					texte4.setBounds(220,400, 240, 30);
					
				   try {
				    	    double c;
				            double cos1;
					       
				            String co1=texte3.getText();
					        cos1=Double.parseDouble(co1);
					       
					        if((cos1== 90) || (cos1==270))
					        { 
					        	 texte4.setText("le resultat est: 0 ");
					        }
					        else
					        {
					             Cos co =new Cos(cos1);
					             c =co.calcul();
				         	     texte4.setText(String.valueOf(co.calcul()));
			        		     texte4.setText("Le résultat est: "+c);
					        }
				        } catch (NumberFormatException e1)
				                {
		                           JOptionPane.showMessageDialog(null,"Vous devez entrer un nombre.");
		                        }
				   
			

		}
//////////////////////
		if (e.getSource()==Sin)
		{
					texte4=new JTextArea();
					contenu.add(texte4);
					Border border2= BorderFactory.createLineBorder(Color.yellow, 1);
					texte4.setBorder(border2);
					texte4.setBounds(220,400, 240, 30);
					
				   try {
				            double s;
				            double sin1;
					       
				            String si1=texte3.getText();
					        sin1=Double.parseDouble(si1);
					     
					        if((sin1== 0) || (sin1==180))
					        { 
					        	texte4.setText("le resultat est: 0 ");
					        }
					        else
					        {
					            Sin si =new Sin(sin1);
					            s=si.calcul();
				             	texte4.setText(String.valueOf(si.calcul()));
			        		    texte4.setText("Le résultat est: "+s);
					        }
				        } catch (NumberFormatException e1)
				                {
		                           JOptionPane.showMessageDialog(null,"Vous devez entrer un nombre.");
		                        }
				   
			

		}
		/////////////////////////
		if (e.getSource()==Log)
		{
					texte4=new JTextArea();
					contenu.add(texte4);
					Border border2= BorderFactory.createLineBorder(Color.yellow, 1);
					texte4.setBorder(border2);
					texte4.setBounds(220,400, 240, 30);
					
				   try {
				        	double l;
				            double log1;
					        
				            String ln1=texte3.getText();
					        log1=Double.parseDouble(ln1);
					        Log ln =new Log(log1);
					        l=ln.calcul();
				         	texte4.setText(String.valueOf(ln.calcul()));
			        		texte4.setText(" Le résultat est: "+l);
			        		
				        }  catch (NumberFormatException e1)
				                {
		                           JOptionPane.showMessageDialog(null,"Vous devez entrer un nombre.");
		                        }
				   
			

		}
		/////////////////////
		if (e.getSource()==Exp)
		{
					texte4=new JTextArea();
					contenu.add(texte4);
					Border border2= BorderFactory.createLineBorder(Color.yellow, 1);
					texte4.setBorder(border2);
					texte4.setBounds(220,400, 240, 30);
					
				   try {
				    	    double expp;
				            double exp1;
					     
                            String ex1=texte3.getText();
					        exp1=Double.parseDouble(ex1);
					        Exp ex =new Exp(exp1);
					        expp=ex.calcul();
				         	texte4.setText(String.valueOf(ex.calcul()));
			        		texte4.setText(" Le résultat est: "+expp);
				        } catch (NumberFormatException e1)
				                {
		                           JOptionPane.showMessageDialog(null,"Vous devez entrer un nombre.");
		                        }
				   
			

		}
		  
		 /**************** A D D I T I O N ***************/
		
       if (e.getSource()== Add)
          {
			texte2=new JTextArea();
			contenu.add(texte2);
			Border border2= BorderFactory.createLineBorder(Color.yellow, 1);
			texte2.setBorder(border2);
			texte2.setBounds(220, 300, 240, 30);
			
		   try {
		    	    double a;
		            double Add1;
			        double Add2;
		
			        String Ad1=texte.getText();
			        String Ad2=texte1.getText();
			        Add1=Double.parseDouble(Ad1);
			        Add2=Double.parseDouble(Ad2);
			        addition ad =new addition(Add1,Add2);
			        a=ad.calcul();
		         	texte2.setText(String.valueOf(ad.calcul()));
	        		texte2.setText("Le résultat de l'addition est: "+a);
		        } catch (NumberFormatException e1)
		                {
                           JOptionPane.showMessageDialog(null,"Vous devez entrer un nombre.");
                        }
		   
	

          }		
    
        /*************** S O U S T R A C T I O N ***************/
    
		if (e.getSource()== Sou)
		{
			texte2=new JTextArea();
			contenu.add(texte2);
			Border border4= BorderFactory.createLineBorder(Color.yellow, 1);
			texte2.setBorder(border4);
			texte2.setBounds(220, 300, 240, 30);
		 
		try {	
		        double s;
		        double Sou1;
			    double Sou2;
			    String So1=texte.getText();
			    String So2=texte1.getText();
			    Sou1=Double.parseDouble(So1);
		     	Sou2=Double.parseDouble(So2);
		     	Soustraction Sous =new Soustraction(Sou1,Sou2);
		    	s=Sous.calcul();
		    	texte2.setText(String.valueOf(Sous.calcul()));
			    texte2.setText("Le résultat de la soustraction est: "+s);
		      } catch (NumberFormatException e1)
		            {
                         JOptionPane.showMessageDialog(null,"Vous devez entrer un nombre.");
                     }
		   
	     }
		  
		 /*********** M U L T I P L I C A T I O N ***********/
		
		if (e.getSource()== Mul)
		{
		    texte2=new JTextArea();
			contenu.add(texte2);
			Border border5= BorderFactory.createLineBorder(Color.yellow, 1);
			texte2.setBorder(border5);
			texte2.setBounds(220, 300, 240, 30);
		
		    try {	
			    double m;
		        double Mul1;
			    double Mul2;
		 	
			    String Mult1=texte.getText();
			    String Mult2=texte1.getText();
			    Mul1=Double.parseDouble(Mult1);
			    Mul2=Double.parseDouble(Mult2);
			    Multiplication Mult =new Multiplication(Mul1,Mul2);
			    m=Mult.calcul();
		    	texte2.setText(String.valueOf(Mult.calcul()));
			    texte2.setText("Le résultat de la multiplication est : "+m);
		        } catch (NumberFormatException e1)
		            {
                      JOptionPane.showMessageDialog(null,"Vous devez entrer un nombre.");
                    }
		   
	     }
	
	/********** D I V I S I O N **********/
	if (e.getSource()== Div)
	{
	    texte2=new JTextArea();
		contenu.add(texte2);
		Border border5= BorderFactory.createLineBorder(Color.yellow, 1);
		texte2.setBorder(border5);
		texte2.setBounds(220, 300, 240, 30);
	
	    try {	
		    double d;
	        double Div1;
	        double Div2;
		    String Di1=texte.getText();
		    String Di2=texte1.getText();
		    Div1=Double.parseDouble(Di1);
		    Div2=Double.parseDouble(Di2);
		    Division Di =new Division(Div1,Div2);
		    d=Di.calcul();
	    	texte2.setText(String.valueOf(Di.calcul()));
		    texte2.setText("Le résultat de la division est : "+d);
	        } catch (NumberFormatException e1)
	            {
                  JOptionPane.showMessageDialog(null,"Vous devez entrer un nombre.");
                }
	   
     }
	}
	
public static void main(String[] args)
{
	Fenetre fen =new Fenetre();
}
	
	
}
