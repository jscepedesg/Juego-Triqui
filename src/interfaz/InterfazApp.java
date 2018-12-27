package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import controlador.Ctrl;


public class InterfazApp extends JFrame {
	
	//Atributos
		private PanelTriqui pnlTriqui;
		private PanelOpciones pnlOpciones;
		private PanelMaquina pnlMaquina;
		private PanelPresentacion pnlPresentacion;
		
		
		// Atributo de tipo Controlador   
	    Ctrl ctrlControlador;
	
	 InterfazApp(Ctrl ctrlControlador){
		
		//Configuracion del Jframe
		setSize(700,500);
		setTitle("TRIQUI - UPC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		//Color JFrame
		this.getContentPane().setBackground(Color.GRAY.darker().darker().darker());
		
		 
		
		//Icono JFrame
		Toolkit mipantalla=  Toolkit.getDefaultToolkit();
		Image MiIcono=mipantalla.getImage("src/img/1.png");//Icono
		setIconImage(MiIcono);//icono
		
		
		
		//Centar JFrame
		
		util.Util.centrarVentana(this);
		
		//Esquema de organizacion
		 getContentPane( ).setLayout( null );  
		 
		//Integrar el controlador
		  this.ctrlControlador = ctrlControlador;
		  
		//Instaciar los paneles
		  pnlTriqui = new PanelTriqui(ctrlControlador);
		  pnlOpciones= new PanelOpciones(ctrlControlador);
		  pnlMaquina= new PanelMaquina(ctrlControlador);
		  pnlPresentacion = new PanelPresentacion(ctrlControlador);
		  
		// Organizar el panel principal. 
		     getContentPane( ).add( pnlTriqui );
		     pnlTriqui.setBounds( 10, 10, 450, 450  );   //10,10,400,180 - left, top, widt, botton
		     
		     getContentPane( ).add(pnlOpciones);
		     pnlOpciones.setBounds(465,290,224,80);
		     
		     getContentPane( ).add(pnlMaquina);
		     pnlMaquina.setBounds(465,380,224,80);
		     
		     getContentPane( ).add(pnlPresentacion);
		     pnlPresentacion.setBounds(465,10,224,270);
		     
		     
		  // Conecta objetos a controlar
			  ctrlControlador.conectar(pnlTriqui, pnlMaquina, pnlPresentacion);
			  
			 
			  
		  
		  
	}
	
	public class PanelPresentacion extends JPanel{
		
		 Ctrl ctrlcontrolador;

		public void paintComponent(Graphics g){
			
			super.paintComponent(g);
			
			//Crear objecto Graphis2D
			Graphics2D g2=(Graphics2D) g;
			
			//Primer texto con color y fuente
			g2.setColor(new Color(209,47,73));
			Font mifuente = new Font("Elephant",Font.BOLD, 26);
			g2.setFont(mifuente);
			//g2.setColor(Color.BLUE);
			g2.drawString("TRIQUI", 50, 50);
			
			//Color JPanel
			setBackground(Color.GRAY.darker().darker().darker());
			
			//Agrego imagen
			//Exepciones de imagen en caso x
			try{
			imagen=ImageIO.read(new File("src/img/1,1.png"));
			}
			catch(IOException e){
				
				System.out.println("No ha podido encontrace la imagen");
			}
			
			//Dibujo Imagen
			g.drawImage(imagen, 38, 75, null);
			
			
		}
		
		public PanelPresentacion(Ctrl ctrlControlador)
		{
			//Contador
			setLayout( null );
			contador1 = new JLabel("0");
			Font auxFont=contador1.getFont();
			contador1.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
			add(contador1);
			contador1.setBounds(60, 230, 70, 50);
			contador1.setForeground(Color.YELLOW);
			
			hum = new JLabel("HUM: ");
			Font auxFont2=hum.getFont();
			hum.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
			add(hum);
			hum.setBounds(5, 230, 70, 50);
			hum.setForeground(Color.BLACK);
			
			maq = new JLabel("MAQ: ");
			Font auxFont3=maq.getFont();
			maq.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
			add(maq);
			maq.setBounds(80, 230, 70, 50);
			maq.setForeground(Color.BLACK);
			
			contador2 = new JLabel("0");
			Font auxFont4=contador2.getFont();
			contador2.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
			add(contador2);
			contador2.setBounds(135, 230, 70, 50);
			contador2.setForeground(Color.RED);
			
			
			emp = new JLabel("EMP: ");
			Font auxFont5=emp.getFont();
			emp.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
			add(emp);
			emp.setBounds(155, 230, 70, 50);
			emp.setForeground(Color.BLACK);
			
			contador3 = new JLabel("0");
			Font auxFont6=contador3.getFont();
			contador3.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
			add(contador3);
			contador3.setBounds(205, 230, 70, 50);
			contador3.setForeground(new Color(92,155,223));
			
			this.ctrlcontrolador = ctrlcontrolador;
			
		}
		
		
		private Image imagen;
		
		private JLabel contador1,hum,maq,contador2,emp,contador3;
		
		 public void setContador ( String contadorh ) { 
		    	
		    	contador1.setText(contadorh);
		    	
		    	
		    }
		 public void setContador2 ( String contadorm ) { 
		    	
		    	contador2.setText(contadorm);
		    	
		    	
		    }
		 
		 public void setContador3 ( String contadore ) { 
		    	
		    	contador3.setText(contadore);
		    	
		    	
		    }
	}
	
	
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazApp frmMain = new InterfazApp(new Ctrl());
		frmMain.setVisible(true);
		 
		//int auxiliar=0;  
		//JOptionPane.showMessageDialog(null, "Digite la I para leer Instrucciones  ","INSTRUCCIONES", auxiliar);
		
		
		
		
		

	}

}


