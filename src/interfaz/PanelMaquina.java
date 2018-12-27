package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controlador.Ctrl;

public class PanelMaquina extends JPanel /*implements ActionListener*/ {

	
	private JRadioButton optZar, optPrimerblanco;
	private ButtonGroup	optGpo;
	
	Ctrl ctrlcontrolador;
	
	public PanelMaquina(Ctrl ctrlcontrolador){
		
		
		// ..............................................( T, L, B, R ).............................................
	    setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 0, 0 ), new TitledBorder( " MAQUINA " ) ) );
	    setLayout( null );
	    
	    this.ctrlcontrolador = ctrlcontrolador;

	    
	    optGpo = new ButtonGroup();
	     optZar = new JRadioButton("AZAR", true);
	     optPrimerblanco = new JRadioButton("1er BLANCO", false);
	     
	     /*optZar.addActionListener(this);
	     optPrimerblanco.addActionListener(this);
	     optZar.setActionCommand("optZar");
	     optPrimerblanco.setActionCommand("optPrimerblanco");*/
	     
	  // Agrega las opciones al grupo
	     optGpo.add( optZar ); optGpo.add( optPrimerblanco );
	     // Agrega los atributos al panel
	     add( optZar ); add( optPrimerblanco );
	     
	     // Se los componentes ubican en la coordenadas deseadas
	     optZar.setBounds( 20, 35, 70, 20 );
	     optPrimerblanco.setBounds( 110, 35, 100, 20 );
	     
		setBackground(Color.GRAY.darker().darker());
		
		
		
	}
	
	public int getOperacion()
    { 
		if (optZar.isSelected()){
			
			return 0;
		}
		else if(optPrimerblanco.isSelected()){
		return 1; 
		}
		return 2;
		
       
    }
	
	

}
