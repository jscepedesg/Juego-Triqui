package controlador;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import interfaz.InterfazApp.PanelPresentacion;
import interfaz.PanelMaquina;
import interfaz.PanelTriqui;
import mundo.Triqui;
import interfaz.PanelOpciones;

public class Ctrl {

	 
	 
	 // Atributo de tipo relacion  
	 private PanelTriqui PanelTriqui;
	 private PanelPresentacion panelpresentacion;
	  //Atributos del Modelo
	 private Triqui triqui;
	 private PanelMaquina PanelMaquina;
	 
	// Atributos clase
	    private int  auxiliar=1, ganahumano, ganamaquina, jugada=0, estado,contador1=0,contador2=0,contador3=0;
	    private String matriz, matriz3="", matriz4="",a;
	    private boolean termino=false, juegaI=false;
	 
	 
	 
	  
	// Constructor*
	 public Ctrl()
	    { // Instancia el mundo
	         triqui = new Triqui(); 
	        
	    }
   //Conexion de clases*
	 public void conectar(PanelTriqui pnlTriqui, PanelMaquina pnlMaquina,PanelPresentacion pnlPresentacion) {
	  
	  //Integrar el panel
	    this.PanelTriqui = pnlTriqui;
	    this.PanelMaquina = pnlMaquina;
	    this.panelpresentacion=pnlPresentacion;
	 }
	 //metodo reiniciar juego*
	 public void reqEjecutarIniciar()
	    {    
	       triqui.setIniciar();
	       matriz = triqui.getJuegoveci(matriz);
	       Icon img = triqui.getIniciar();
	       PanelTriqui.setLblCVec1(img);
	       jugada=0;
			estado=0;
			juegaI=false;
			matriz3="";
			matriz4="";
			termino=false;
			contador1=0;
			panelpresentacion.setContador(contador1+"");
			contador2=0;
			panelpresentacion.setContador2(contador2+"");
			contador3=0;
			panelpresentacion.setContador3(contador3+"");
	  
	    }
	 //Metodo salir del juego*
	 public void reqEjecutarSalir() {triqui.setSalir();}
	//confirmacion proceso de juego*
	 public void botonIzquierdo(JLabel label)
	 { 
	  System.out.println("ctrl - botonIzquierdo()...");
	  
	  setJugadahumano(label);
		
		if(jugada==4)
		{
			triqui.setConca();
			matriz3=triqui.getJuegoveci(matriz);
			
		}
		
		triqui.setHumanogan();
		ganahumano = triqui.getGanahumano();			
				
		if (ganahumano==1)
		{		
			
			JOptionPane.showMessageDialog(null, "GANASTE","GANÓ HUMANO", auxiliar);
			
				ganahumano = 0;	
				estado=1;
				{
					triqui.setIniciar();
				       matriz = triqui.getJuegoveci(matriz);
				       Icon img = triqui.getIniciar();
				       PanelTriqui.setLblCVec1(img);
				       jugada=0;
						estado=0;
						juegaI=false;
						matriz3="";
						matriz4="";
						termino=false;
						contador1++;
						
						panelpresentacion.setContador(contador1+"");
						
						
				}
		}
		else
		{
			if(jugada==5&&juegaI==true)
			{
				for (int i=0; i<matriz.length();i++)
				{
					if(matriz.charAt(i)=='2')
					{
						switch (i){
						case 0: 
							PanelTriqui.setcir1();
							break;
						case 1:
							PanelTriqui.setcir2();
							break;
						case 2:
							PanelTriqui.setcir3();
							break;
						case 3:
							PanelTriqui.setcir4();
							break;
						case 4:
							PanelTriqui.setcir5();
							break;
						case 5:
							PanelTriqui.setcir6();
							break;
						case 6:
							PanelTriqui.setcir7();
							break;
						case 7:
							PanelTriqui.setcir8();
							break;
						case 8:
							PanelTriqui.setcir9();
							break;
						default:
							System.out.println("error" );
					           break;
						}
					}
				}
			}
			else
			{
				setJugadaMaquina();
	
			}
			
			
			if(jugada==6)
			{
				triqui.setConca();
				matriz4=triqui.getJuegoveci(matriz);
			}
			ganamaquina = triqui.getGanmaquina();
			
			if (ganamaquina == 1)
			{
				JOptionPane.showMessageDialog(null,"PERDISTE", "GANÓ LA MAQUINA",JOptionPane.ERROR_MESSAGE);
				//pnlmaquina.reiniciar();
				
				//pnlmaquina.ganadormaquina();
				ganamaquina = 0;
				estado=2;
				termino=true;
				{
					triqui.setIniciar();
				       matriz = triqui.getJuegoveci(matriz);
				       Icon img = triqui.getIniciar();
				       PanelTriqui.setLblCVec1(img);
				       jugada=0;
						estado=0;
						juegaI=false;
						matriz3="";
						matriz4="";
						termino=false;
                        contador2++;
						
						panelpresentacion.setContador2(contador2+"");
						
				}
			}
			else
			{
				//pnlmaquina.turnox();	
				estado=3;
			}		
	
		}
		
		if(triqui.getEmpate()==1&&termino==false&&jugada>=20)
		{
			termino=true;
			JOptionPane.showMessageDialog(null,"EMPATE", "TABLAS",JOptionPane.WARNING_MESSAGE);
			{
				triqui.setIniciar();
			       matriz = triqui.getJuegoveci(matriz);
			       Icon img = triqui.getIniciar();
			       PanelTriqui.setLblCVec1(img);
			       jugada=0;
					estado=0;
					juegaI=false;
					matriz3="";
					matriz4="";
					termino=false;
					contador3++;
					panelpresentacion.setContador3(contador3+"");
			}
		}
	 }
    //Juego en derecha*
	public void juegaDerecha(JLabel label) 
	{
		 JLabel b = label;
		 a=b.getName();
		System.out.println(a);
		triqui.setJugodere(a);		
		matriz = triqui.getJuegoveci(matriz);		
		System.out.println(matriz);
		
		for (int i=0; i<matriz.length();i++)
		{
			if(matriz.charAt(i)=='1')
			{
				switch (i){
				case 0:
					PanelTriqui.setequiz1();
					break;
				case 1:
					PanelTriqui.setequiz2();
					break;
				case 2:
					PanelTriqui.setequiz3();
					break;
				case 3:
					PanelTriqui.setequiz4();
					break;
				case 4:
					PanelTriqui.setequiz5();
					break;
				case 5:
					PanelTriqui.setequiz6();
					break;
				case 6:
					PanelTriqui.setequiz7();
					break;
				case 7:
					PanelTriqui.setequiz8();
					break;
				case 8:
					PanelTriqui.setequiz9();
					break;
				default:
					System.out.println("Error" );
			           break;
				}
			}						
		}
		
	}
   //Jugada de bloqueo*
	public void juegaDerecha2(JLabel label) 
	{
		JLabel b = label;
		 a=b.getName();
		triqui.setjugoBlanco(a);
		
		matriz = triqui.getJuegoveci(matriz);
		
		System.out.println(matriz);
		
		for (int i=0; i<matriz.length();i++)
		{
			if(matriz.charAt(i)=='0')
			{
				switch (i){
				case 0:
					
					PanelTriqui.setblanco1();
					break;
				case 1:
					PanelTriqui.setblanco2();
					break;
				case 2:
					PanelTriqui.setblanco3();
					break;
				case 3:
					PanelTriqui.setblanco4();
					break;
				case 4:
					PanelTriqui.setblanco5();
					break;
				case 5:
					PanelTriqui.setblanco6();
					break;
				case 6:
					PanelTriqui.setblanco7();
					break;
				case 7:
					PanelTriqui.setblanco8();
					break;
				case 8:
					PanelTriqui.setblanco9();
					break;
				default:
					System.out.println("error" );
			           break;
				}
			}
			
			
		}
		
		
		
	}
	 //Set jugada humano*
	 public void setJugadahumano(JLabel label)
	 {
		 JLabel b = label;
		 a=b.getName();
		 triqui.setJugoHumano(a);
			matriz = triqui.getJuegoveci(matriz);			
			System.out.println(matriz);
			
				for (int i=0; i<matriz.length();i++)
				{
					if(matriz.charAt(i)=='1')
					{
						switch (i){
						case 0:
							PanelTriqui.setequiz1();
							jugada++;
							break;
						case 1:
							PanelTriqui.setequiz2();
							jugada++;
							break;
						case 2:
							PanelTriqui.setequiz3();
							jugada++;
							break;
						case 3:
							PanelTriqui.setequiz4();
							jugada++;
							break;
						case 4:
							PanelTriqui.setequiz5();
							jugada++;
							break;
						case 5:
							PanelTriqui.setequiz6();
							jugada++;
							break;
						case 6:
							PanelTriqui.setequiz7();
							jugada++;
							break;
						case 7:
							PanelTriqui.setequiz8();
							jugada++;
							break;
						case 8:
							PanelTriqui.setequiz9();
							jugada++;
							break;
						default:
							System.out.println("Error" );
					           break;
						}
					}			
				}
	 }
     //Set Jugada Maquina*
	 public void setJugadaMaquina()
	 {
		 int opcion;
		  opcion = PanelMaquina.getOperacion();
		  
		  
		  if(opcion==0)
		  {
			  
		    System.out.println("Esta en azar");
		    triqui.setAtaque();
		    triqui.setDefenza();
			triqui.setAzar();
			matriz = triqui.getJuegoveci(matriz);
									
			System.out.println(matriz);	
		    
		  }
		  else
		  {
			
			  System.out.println("Esta en Primer Blanco");
			  triqui.setAtaque();
				triqui.setDefenza();
				triqui.setPrimerblanco();
				matriz = triqui.getJuegoveci(matriz);	
					
				System.out.println(matriz);
			  
		  }
		  
		  
		  for (int i=0; i<matriz.length();i++)
			{
				if(matriz.charAt(i)=='2')
				{
					switch (i){
					case 0: 
						PanelTriqui.setcir1();
						jugada++;
						break;
					case 1:
						PanelTriqui.setcir2();
						jugada++;
						break;
					case 2:
						PanelTriqui.setcir3();
						jugada++;
						break;
					case 3:
						PanelTriqui.setcir4();
						jugada++;
						break;
					case 4:
						PanelTriqui.setcir5();
						jugada++;
						break;
					case 5:		
						PanelTriqui.setcir6();
						jugada++;
						break;
					case 6:
						PanelTriqui.setcir7();
						jugada++;
						break;
					case 7:
						PanelTriqui.setcir8();
						jugada++;
						break;
					case 8:
						PanelTriqui.setcir9();
						jugada++;
						break;
					default:
						System.out.println("Error" );
						break;
					}
				}
			}
		  
		  
		 
	 }
     //Set volver blanco*por verificar	
	/* public void setVolverblanco(JLabel label)
	 {
		 JLabel b = label;
		 String l= b.getName();
		triqui.setVolver(l);
		matriz = triqui.getJuegoveci(matriz);
		
		
	 }
	 */
}

