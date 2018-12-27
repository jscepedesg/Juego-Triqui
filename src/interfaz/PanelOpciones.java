package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controlador.Ctrl;

public class PanelOpciones extends JPanel implements ActionListener{

	//Atributos
	private JButton	btnSalir,btnInicio;
	
	Ctrl ctrlControlador;
	
	public PanelOpciones(Ctrl ctrlControlador){
		
		// ..............................................( T, L, B, R ).............................................
	    setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 0, 0 ), new TitledBorder( " OPCIONES " ) ) );
	    setLayout( null );
		
       // Integra el controlador
        this.ctrlControlador = ctrlControlador;
        
     // Instancia atributos de la clase   
         btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);
        
        btnInicio = new JButton("Iniciar");
        btnInicio.addActionListener(this);
        
 // Se los componentes ubican en la coordenadas deseadas              
         btnInicio.setBounds( 30, 35, 70, 25 );
        btnSalir.setBounds( 133, 35, 65, 25 );
		
        //Agregar a Panel
        add(btnInicio);add(btnSalir);
		
		//Color panel
		setBackground(Color.GRAY.darker().darker());
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object btnpuch = e.getSource();
		
		if(btnpuch==btnInicio)
		{
			ctrlControlador.reqEjecutarIniciar();
		}
		else
		{
			ctrlControlador.reqEjecutarSalir();
		}
		
	}

	

}
