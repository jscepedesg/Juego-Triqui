package interfaz;
//Sebas

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import controlador.Ctrl;

public class PanelTriqui extends JPanel{

	 //Atributos
	 
	 private static final String Blanco = "src/img/Blanco.png";
	 private static final String Circulo = "src/img/Circulo.png";
	private static final JLabel JLabel = null;
	 private ImageIcon imgCir;
	 public JLabel vec1[][] = new JLabel[3][3];
	 private boolean parametro=true;
	 int x,y;
	 private String a;
	 
	 Ctrl ctrlControlador;
	 
	 public PanelTriqui(Ctrl ctrlControlador){
	  
	  // ..............................................( T, L, B, R ).............................................
	        setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 0, 0 ), new TitledBorder( " TRIQUI " )));
	        setLayout( null );
	        
	        //Color del panel
	        setBackground(Color.GRAY.darker().darker());
	        
	        // Integra el controlador
	        this.ctrlControlador = ctrlControlador;
	        
	        this.imgCir = new ImageIcon( Blanco );
	        
	     // Instancia los label de la matriz de juego      
	      
	        for(int i=0;i<3;i++)
	        { for(int j=0;j<3;j++)
	          { 
	         vec1[i][j] = new JLabel( imgCir);
	        // vec1[i][j].setVerticalAlignment( JLabel.CENTER );
	         //vec1[i][j].setEnabled( true );
	         vec1[i][j].addMouseListener( new LabelClicMouse( i, j,vec1[i][j], this.ctrlControlador ) );
	         //vec1[i][j].setName(""+((j+1)*(i+1)));
	            add(vec1[i][j]);
	          }
	        }  
	        
	        //ID JLABEL
	        vec1[0][0].setName("1");
	        vec1[0][1].setName("2");
	        vec1[0][2].setName("3");
	        vec1[1][0].setName("4");
	        vec1[1][1].setName("5");
	        vec1[1][2].setName("6");
	        vec1[2][0].setName("7");
	        vec1[2][1].setName("8");
	        vec1[2][2].setName("9");
	        
	        
	        //UBICAR JLABEL
	        vec1[0][0].setBounds( 10, 18, 130, 130 ); 
	        vec1[0][1].setBounds( 160, 18, 130, 130 ); 
	        vec1[0][2].setBounds( 310, 18, 130, 130 ); 
	        vec1[1][0].setBounds( 10, 167, 130, 130 ); 
	        vec1[1][1].setBounds( 160, 167, 130, 130 ); 
	        vec1[1][2].setBounds( 310, 167, 130, 130 ); 
	        vec1[2][0].setBounds( 10, 314, 130, 130 ); 
	        vec1[2][1].setBounds( 160, 314, 130, 130 ); 
	        vec1[2][2].setBounds( 310, 314, 130, 130 );
	        
	        for(int i = 0;i<3;i++)
	        {
	        	for(int j = 0;j<3;j++)
	        	{
	        		
	        	}
	        }
	        //LabelClicMouse click = new LabelClicMouse( x,  y,null, ctrlControlador);
	        
	        // a=click.getA();
	        
	 }
	 
	 // M todos Set   
	    
	    public void setLblCVec1 ( Icon lbl ) 

	    {    
	     for(int i = 0; i<3;i++)
	     {
	    	 for(int j = 0; j<3;j++)
	    	 {
	          vec1[i][j].setIcon(lbl); 
	         }
	     }
	    }
	    //CIRCULO
	    public void setcir1 ( )   { vec1[0][0].setIcon(new ImageIcon("src/img/Circulo.png")); }
	    public void setcir2 ( )   { vec1[0][1].setIcon(new ImageIcon("src/img/Circulo.png")); }
	    public void setcir3 ( )   { vec1[0][2].setIcon(new ImageIcon("src/img/Circulo.png")); }
	    public void setcir4 ( )   { vec1[1][0].setIcon(new ImageIcon("src/img/Circulo.png")); }
	    public void setcir5 ( )   { vec1[1][1].setIcon(new ImageIcon("src/img/Circulo.png")); }
	    public void setcir6 ( )   { vec1[1][2].setIcon(new ImageIcon("src/img/Circulo.png")); }
	    public void setcir7 ( )   { vec1[2][0].setIcon(new ImageIcon("src/img/Circulo.png")); }
	    public void setcir8 ( )   { vec1[2][1].setIcon(new ImageIcon("src/img/Circulo.png")); }
	    public void setcir9 ( )   { vec1[2][2].setIcon(new ImageIcon("src/img/Circulo.png")); }
	    // EQUIZ
	    public void setequiz1 ( )   { vec1[0][0].setIcon(new ImageIcon("src/img/x.png")); }
	    public void setequiz2 ( )   { vec1[0][1].setIcon(new ImageIcon("src/img/x.png")); }
	    public void setequiz3 ( )   { vec1[0][2].setIcon(new ImageIcon("src/img/x.png")); }
	    public void setequiz4 ( )   { vec1[1][0].setIcon(new ImageIcon("src/img/x.png")); }
	    public void setequiz5 ( )   { vec1[1][1].setIcon(new ImageIcon("src/img/x.png")); }
	    public void setequiz6 ( )   { vec1[1][2].setIcon(new ImageIcon("src/img/x.png")); }
	    public void setequiz7 ( )   { vec1[2][0].setIcon(new ImageIcon("src/img/x.png")); }
	    public void setequiz8 ( )   { vec1[2][1].setIcon(new ImageIcon("src/img/x.png")); }
	    public void setequiz9 ( )   { vec1[2][2].setIcon(new ImageIcon("src/img/x.png")); }
	    //Blanco
	    public void setblanco1 ( )   { vec1[0][0].setIcon(new ImageIcon("src/img/Blanco.png")); }
	    public void setblanco2 ( )   { vec1[0][1].setIcon(new ImageIcon("src/img/Blanco.png")); }
	    public void setblanco3 ( )   { vec1[0][2].setIcon(new ImageIcon("src/img/Blanco.png")); }
	    public void setblanco4 ( )   { vec1[1][0].setIcon(new ImageIcon("src/img/Blanco.png")); }
	    public void setblanco5 ( )   { vec1[1][1].setIcon(new ImageIcon("src/img/Blanco.png")); }
	    public void setblanco6 ( )   { vec1[1][2].setIcon(new ImageIcon("src/img/Blanco.png")); }
	    public void setblanco7 ( )   { vec1[2][0].setIcon(new ImageIcon("src/img/Blanco.png")); }
	    public void setblanco8 ( )   { vec1[2][1].setIcon(new ImageIcon("src/img/Blanco.png")); }
	    public void setblanco9 ( )   { vec1[2][2].setIcon(new ImageIcon("src/img/Blanco.png")); }
	    
	 
	    public String getA()
		{ return a;		
		}
	  
	 
	 //Dibujo Lineas
	public void paintComponent(Graphics g){
	  
	  super.paintComponent(g);
	  
	  Graphics2D g2=(Graphics2D) g;
	  g2.setStroke(new BasicStroke(10));
	  g2.drawLine(150, 20, 150, 437);
	  g2.drawLine(300, 20, 300, 437);
	  g2.drawLine(10, 158, 440, 158);
	  g2.drawLine(10, 305, 440, 305);
	  
	  
	 }
	 
	 
	}

	class LabelClicMouse extends MouseAdapter 
	{// Constantes}
	    private static final String O = "src/img/Seleccion.png";
	    //private static final String X = "src/img/X.png";
	    private static final String Seleccion = "src/img/Seleccion.png";
	    private static final String Blanco = "src/img/Blanco.png";
	    
	    //Atributos de clase
	   
	    
	 // Atributos de instancia   
	    private JLabel label;
	    private Ctrl ctrlControlador;
	    private int x, y;
	    private int x1, y1;
	    private String a;
	    private ImageIcon imgO, imgX,imgB;
	    private boolean parametro=true;
	    
	 // Constructor   
	    public LabelClicMouse( int x, int y, JLabel label, Ctrl ctrl )
	    { this.label = label;
	      this.ctrlControlador = ctrl;
	      this.x = x; this.y = y;
	      this.imgO = new ImageIcon( O );
	      //this.imgX = new ImageIcon( X );
	      this.imgB = new ImageIcon(Blanco);
	    }
	    
	 
	    
	    public void mouseClicked(MouseEvent evento)
	    {
	    	//int l = evento.getClickCount();
	    	
	           if ( evento.isMetaDown() )  // boton derecho del raton - pone X / O
	            {   
	        	   
	        	   if(parametro==true)
     				{
	        		   //label.setIcon(imgO);
             			a = label.getName();
             			ctrlControlador.juegaDerecha(label);              			
             			parametro=false;
             			
     				}
     				else 
     				{
     					if(parametro==false)
     					{
     						    
     						a= label.getName();
     						ctrlControlador.juegaDerecha2(label);                 			
                 			parametro=true;

     					}
     				}
	               
	      
	            }
	          else if ( evento.isAltDown() ){} // boton medio del raton
	         else if ( evento.isControlDown() ){}
	         else 
	          { 
	            
	        	 //Seleccion del Jlabel 
	          
	        	 if(parametro==false)
   				{
	               ctrlControlador.botonIzquierdo(label);
	               parametro=true;
   				}
        	   }
	          
	           /*
	           if(l==2 && parametro==false)
	           {
	        	   
	        	  // label.setIcon(imgB);
	        	   ctrlControlador.setVolverblanco(label);
	        	   parametro=true;
	        	   
	           }
	           */
	          
	        
	     }

	    
	    public String getA()
		{ return a;		
		}
	    
	    
	    
	 
	}



    

