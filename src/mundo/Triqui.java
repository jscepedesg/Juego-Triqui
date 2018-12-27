package mundo;

import java.awt.Image;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.Ctrl;
import interfaz.InterfazApp;

public class Triqui {
	 
	 private Icon ima,ima1;
	 private String conca="";
	 private int veci[][] = new int[3][3],filas, columnas, contador, ganhumano, ganmaquina, x;
	 private String vec[][] = new String[3][3];
	 private boolean bloq[]= new boolean[9];
	 private boolean jug[]= new boolean[9];
	 private boolean juego,juegoAtaque,juegoDefensa;
	 private boolean auxiliar1,auxiliar2;
	
	 
	 //Constructor*
	 public Triqui(){
		 
		 //Contador
		 contador=0;
		 //Auxiliares
		 auxiliar1 = true;
		 auxiliar2 = true;
		 //Variables de juego
		 juego=false;
		 juegoAtaque=false;
		 juegoDefensa=false;
		 //Juagadas y bloqueos
		 for(int i =0;i<9;i++)
		 {
			 bloq[i]=false;
			 jug[i]=false;
		 }
		 
		
	 }
	 
	 //Salir del juego*
	 public void setSalir()
	 {
	  System.exit(0); 
	 }
	 
	 //Reiniciar el juego*
	 public void setIniciar()
	 {
		 conca="";
	   ImageIcon vec = new ImageIcon("src/img/Blanco.png");
	    ima1  = new ImageIcon("src/img/Blanco.png");
	  
	    //Pasar variable a ceros 
	    for(int i =0;i<3;i++)
	     {
	       for(int j =0;j<3;j++)
	        {
	           veci[i][j]=0;
	        }
	     }
	    
	    //Bloqueo a false
	    for(int i =0;i<9;i++)
	     {
	           bloq[i]=false;
	           jug[i]=false;
	     }
	    
        juego=false;
		ganhumano = 0;
		ganmaquina = 0;
		x=0;
		contador=0;
	    
	    for(int i =0;i<3;i++)
	     {
	       for(int j =0;j<3;j++)
	        {
	           System.out.print(veci[i][j]+" ");
	        }
	       System.out.println();
	     }
	  
	 }
	 //Buscar patron de ataque*
	 public void setAtaque()
	 {
		 //PRIMERA PARTE fila
		 if(veci[0][0]==2&&veci[0][1]==2 && (jug[2]==false) && juego==true)
		 {
			 veci[0][2]=2;
			 juegoAtaque=true;
				jug[2]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[1][0]==2&&veci[1][1]==2&& (jug[5]==false) && juego==true)
		 {
			 veci[1][2]=2;
			 juegoAtaque=true;
				jug[5]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[2][0]==2&&veci[2][1]==2 && (jug[8]==false) && juego==true)
		 {
			 veci[2][2]=2;
			 juegoAtaque=true;
				jug[8]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 //SEGUNDA PARTE fila
		 else if(veci[0][1]==2&&veci[0][2]==2 && (jug[0]==false) && juego==true)
		 {
			 veci[0][0]=2;
			 juegoAtaque=true;
				jug[0]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[1][1]==2&&veci[1][2]==2 && (jug[3]==false) && juego==true)
		 {
			 veci[1][0]=2;
			 juegoAtaque=true;
				jug[3]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[2][1]==2&&veci[2][2]==2 && (jug[6]==false) && juego==true)
		 {
			 veci[2][0]=2;
			 juegoAtaque=true;
				jug[6]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 //TERCERA PARTE Fila
		 else if(veci[0][0]==2&&veci[0][2]==2 && (jug[1]==false) && juego==true)
		 {
			 veci[0][1]=2;
			 juegoAtaque=true;
				jug[1]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[1][0]==2&&veci[1][2]==2 && (jug[4]==false) && juego==true)
		 {
			 veci[1][1]=2;
			 juegoAtaque=true;
				jug[4]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[2][0]==2&&veci[2][2]==2 && (jug[7]==false) && juego==true)
		 {
			 veci[2][1]=2;
			 juegoAtaque=true;
				jug[7]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 //COLUMNAS
		//PRIMERA PARTE Columna
		 if(veci[0][0]==2&&veci[1][0]==2 && (jug[6]==false) && juego==true)
		 {
			 veci[2][0]=2;
			 juegoAtaque=true;
				jug[6]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[0][1]==2&&veci[1][1]==2 && (jug[7]==false) && juego==true)
		 {
			 veci[2][1]=2;
			 juegoAtaque=true;
				jug[7]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[0][2]==2&&veci[1][2]==2 && (jug[8]==false) && juego==true)
		 {
			 veci[2][2]=2;
			 juegoAtaque=true;
				jug[8]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 //SEGUNDA PARTE columna
		 else if(veci[1][0]==2&&veci[2][0]==2 && (jug[0]==false) && juego==true)
		 {
			 veci[0][0]=2;
			 juegoAtaque=true;
				jug[0]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[1][1]==2&&veci[2][1]==2 && (jug[1]==false) && juego==true)
		 {
			 veci[0][1]=2;
			 juegoAtaque=true;
				jug[1]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[1][2]==2&&veci[2][2]==2 && (jug[2]==false) && juego==true)
		 {
			 veci[0][2]=2;
			 juegoAtaque=true;
				jug[6]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 //TERCERA PARTE columna
		 else if(veci[0][0]==2&&veci[2][0]==2 && (jug[3]==false) && juego==true)
		 {
			 veci[1][0]=2;
			 juegoAtaque=true;
				jug[3]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[0][1]==2&&veci[2][1]==2 && (jug[4]==false) && juego==true)
		 {
			 veci[1][1]=2;
			 juegoAtaque=true;
				jug[4]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[0][2]==2&&veci[2][2]==2 && (jug[5]==false) && juego==true)
		 {
			 veci[1][2]=2;
			 juegoAtaque=true;
				jug[5]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 
		 //EN CRUZ ATAQUE
		 
		//Primer PARTE cruz
		 else if(veci[0][0]==2&&veci[1][1]==2 && (jug[8]==false) && juego==true)
		 {
			 veci[2][2]=2;
			 juegoAtaque=true;
				jug[8]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[1][1]==2&&veci[2][2]==2 && (jug[0]==false) && juego==true)
		 {
			 veci[0][0]=2;
			 juegoAtaque=true;
				jug[0]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[0][0]==2&&veci[2][2]==2 && (jug[4]==false) && juego==true)
		 {
			 veci[1][1]=2;
			 juegoAtaque=true;
				jug[4]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 //Segunda PARTE cruz
		 else if(veci[0][2]==2&&veci[1][1]==2 && (jug[6]==false) && juego==true)
		 {
			 veci[2][0]=2;
			 juegoAtaque=true;
				jug[6]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[2][0]==2&&veci[1][1]==2 && (jug[2]==false) && juego==true)
		 {
			 veci[0][2]=2;
			 juegoAtaque=true;
				jug[2]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 else if(veci[2][0]==2&&veci[0][2]==2 && (jug[4]==false) && juego==true)
		 {
			 veci[1][1]=2;
			 juegoAtaque=true;
				jug[4]=true;
				juego=false;
				ganmaquina = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
		 }
		 
	 }
	 //Buscar patron de defenza*
	 public void setDefenza()
	 {
		//Verticasl Izquierda
			if(veci[0][0]==1&&veci[0][1]==1 && juegoAtaque==false  && (jug[2]==false) && juego==true)
			{
				veci[0][2]=2;
				juegoDefensa=true;
				jug[2]=true;
				juego=false;
			}
			else
				if(veci[1][0]==1&&veci[1][1]==1 && juegoAtaque==false  && (jug[5]==false) && juego==true)
			{
				veci[1][2]=2;
				juegoDefensa=true;
				jug[5]=true;
				juego=false;
			}
			else
				if(veci[2][0]==1&&veci[2][1]==1 && juegoAtaque==false  && (jug[8]==false) && juego==true)
			{
				veci[2][2]=2;
				juegoDefensa=true;
				jug[8]=true;
				juego=false;
			}
			else
			//Vertical Derecha
				if(veci[0][1]==1&&veci[0][2]==1 && juegoAtaque==false  && (jug[0]==false) && juego==true)
			{
				veci[0][0]=2;
				juegoDefensa=true;
				jug[0]=true;
				juego=false;
			}
			else
				if(veci[1][1]==1&&veci[1][2]==1 && juegoAtaque==false  && (jug[3]==false) && juego==true)
			{
				veci[1][0]=2;
				juegoDefensa=true;
				jug[3]=true;
				juego=false;
			}
			else
				if(veci[2][1]==1&&veci[2][2]==1 && juegoAtaque==false  && (jug[6]==false) && juego==true)
			{
				veci[2][0]=2;
				juegoDefensa=true;
				jug[6]=true;
				juego=false;
			}
			//Verticales Opuestas
			else
				if(veci[0][0]==1&&veci[0][2]==1 && juegoAtaque==false  && (jug[1]==false) && juego==true)
			{
				veci[0][1]=2;
				juegoDefensa=true;
				jug[1]=true;
				juego=false;
			}
			else
				if(veci[1][0]==1&&veci[1][2]==1 && juegoAtaque==false  && (jug[4]==false) && juego==true)
			{
				veci[1][1]=2;
				juegoDefensa=true;
				jug[4]=true;
				juego=false;
			}
			else
				if(veci[2][0]==1&&veci[2][2]==1 && juegoAtaque==false  && (jug[7]==false) && juego==true)
			{
				veci[2][1]=2;
				juegoDefensa=true;
				jug[7]=true;
				juego=false;
			}
			else
			//Horizontal Superior
			if(veci[0][0]==1&&veci[1][0]==1 && juegoAtaque==false  && (jug[6]==false) && juego==true)
			{
				veci[2][0]=2;
				juegoDefensa=true;
				jug[6]=true;
				juego=false;
			}
			else
				if(veci[0][1]==1&&veci[1][1]==1 && juegoAtaque==false  && (jug[7]==false) && juego==true)
			{
				veci[2][1]=2;
				juegoDefensa=true;
				jug[7]=true;
				juego=false;
			}
			else
				if(veci[0][2]==1&&veci[1][2]==1 && juegoAtaque==false  && (jug[8]==false) && juego==true)
			{
				veci[2][2]=2;
				juegoDefensa=true;
				jug[8]=true;
				juego=false;
			}
			else
			//Horizontal Inferior
			if(veci[1][0]==1&&veci[2][0]==1 && juegoAtaque==false  && (jug[0]==false) && juego==true)
			{
				veci[0][0]=2;
				juegoDefensa=true;
				jug[0]=true;
				juego=false;
			}
			else
				if(veci[1][1]==1&&veci[2][1]==1 && juegoAtaque==false  && (jug[1]==false) && juego==true)
			{
				veci[0][1]=2;
				juegoDefensa=true;
				jug[1]=true;
				juego=false;
			}
			else
				if(veci[1][2]==1&&veci[2][2]==1 && juegoAtaque==false  && (jug[2]==false) && juego==true)
			{
				veci[0][2]=2;
				juegoDefensa=true;
				jug[2]=true;
				juego=false;
			}
			else		
			//Horizontal Opuesta
				//Verificar
				if(veci[0][0]==1&&veci[2][0]==1 && juegoAtaque==false  && (jug[3]==false) && juego==true)
			{
				veci[1][0]=2;
				juegoDefensa=true;
				jug[3]=true;
				juego=false;
			}
			else
				if(veci[0][1]==1&&veci[2][1]==1 && juegoAtaque==false  && (jug[4]==false) && juego==true)
			{
				veci[1][1]=2;
				juegoDefensa=true;
				jug[4]=true;
				juego=false;
			}
			else
				if(veci[0][2]==1&&veci[2][2]==1 && juegoAtaque==false  && (jug[5]==false) && juego==true)
			{
				veci[1][2]=2;
				juegoDefensa=true;
				jug[5]=true;
				juego=false;
			}
			else
			//Diagonales opuestas
				if(veci[0][0]==1&&veci[2][2]==1 && juegoAtaque==false  && (jug[4]==false) && juego==true)
			{
				veci[1][1]=2;
				juegoDefensa=true;
				jug[4]=true;
				juego=false;
			}
			else
				if(veci[2][0]==1&&veci[0][2]==1 && juegoAtaque==false  && (jug[4]==false) && juego==true)
			{
				veci[1][1]=2;
				juegoDefensa=true;
				jug[4]=true;
				juego=false;
			}
			//Diagonales Izquierda
			else
				if(veci[0][0]==1&&veci[1][1]==1 && juegoAtaque==false  && (jug[8]==false) && juego==true)
			{
					veci[2][2]=2;
					juegoDefensa=true;
					jug[8]=true;
					juego=false;
			}
			else
				if(veci[0][2]==1&&veci[1][1]==1 && juegoAtaque==false  && (jug[6]==false) && juego==true)
			{
				veci[2][0]=2;
				juegoDefensa=true;
				jug[6]=true;
				juego=false;
			}
			else
			//Diagonales Derecha
				if(veci[2][2]==1&&veci[1][1]==1 && juegoAtaque==false  && (jug[0]==false) && juego==true)
			{
					veci[0][0]=2;
					juegoDefensa=true;
					jug[0]=true;
					juego=false;
			}
			else
				if(veci[2][0]==1&&veci[1][1]==1 && juegoAtaque==false  && (jug[2]==false) && juego==true)
			{
				veci[0][2]=2;
				juegoDefensa=true;
				jug[2]=true;
				juego=false;
			} 
	 }
	 //Asignar valores matriz etc jugada humano*
	 public void setJugoHumano(String a)
	 {
		 conca="";
		 
		 if ((a=="1") && (bloq[0]==false) && (jug[0]==false) && (juego==false))
			{				
				veci[0][0]=1;
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;	
				jug[0]=true;
				juego=true;
				juegoAtaque=false;
				juegoDefensa=false;
				
			}
			else
			if ((a=="2") && (bloq[1]==false) && (jug[1]==false) && (juego==false))
			{
				veci[0][1]=1;
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;	
				jug[1]=true;
				juego=true;
				juegoAtaque=false;
				juegoDefensa=false;
				
			}
			else
			if ((a=="3") && (bloq[2]==false) && (jug[2]==false) && (juego==false))
			{
				veci[0][2]=1;
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;	
				jug[2]=true;
				juego=true;
				juegoAtaque=false;
				juegoDefensa=false;
				
			}
			else
			if ((a=="4")  && (bloq[3]==false) && (jug[3]==false) && (juego==false))
			{
				veci[1][0]=1;
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;	
				jug[3]=true;
				juego=true;
				juegoAtaque=false;
				juegoDefensa=false;
			
			}
			else
			if ((a=="5") && (bloq[4]==false) && (jug[4]==false) && (juego==false))
			{
				veci[1][1]=1;
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;	
				jug[4]=true;
				juego=true;
				juegoAtaque=false;
				juegoDefensa=false;
			
			}
			else
			if ((a=="6") && (bloq[5]==false) && (jug[5]==false) && (juego==false))
			{
				veci[1][2]=1;
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;	
				jug[5]=true;
				juego=true;
				juegoAtaque=false;
				juegoDefensa=false;
		
			}
			else
			if ((a=="7") && (bloq[6]==false) && (jug[6]==false) && (juego==false))
			{
				veci[2][0]=1;
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;	
				jug[6]=true;
				juego=true;
				juegoAtaque=false;
				juegoDefensa=false;
			
			}
			else
			if ((a=="8") && (bloq[7]==false) && (jug[7]==false) && (juego==false))
			{
				veci[2][1]=1;
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;	
				jug[7]=true;
				juego=true;
				juegoAtaque=false;
				juegoDefensa=false;
			
			}
			else	
			if ((a=="9") && (bloq[8]==false) && (jug[8]==false) && (juego==false))
			{
				veci[2][2]=1;
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;	
				jug[8]=true;
				juego=true;
				juegoAtaque=false;
				juegoDefensa=false;
			}
		 
	 }
	 //Bloqueo de jugadas*
	 public void setJugodere(String a)
	 {
		 conca="";
		 
		 if ((a=="1") && (veci[0][0] == 0) && (bloq[0]==false) && (jug[0]==false))
			{				
				veci[0][0]=1;		
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;
			}
			else
			if ((a=="2") && (veci[0][1] == 0) && (bloq[1]==false) && (jug[1]==false))
			{
				veci[0][1]=1;
				bloq[0]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;
			}
			else
			if ((a=="3") && (veci[0][2] == 0) && (bloq[2]==false) && (jug[2]==false))
			{
				veci[0][2]=1;
				bloq[0]=true;
				bloq[1]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;
			}
			else
			if ((a=="4") && (veci[1][0] == 0) && (bloq[3]==false) && (jug[3]==false))
			{
				veci[1][0]=1;
				bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;
			}
			else
			if ((a=="5") && (veci[1][1] == 0) && (bloq[4]==false) && (jug[4]==false))
			{
				veci[1][1]=1;
				bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;
			}
			else
			if ((a=="6") && (veci[1][2] == 0) && (bloq[5]==false) && (jug[5]==false))
			{
				veci[1][2]=1;
				bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;
			}
			else
			if ((a=="7") && (veci[2][0] == 0) && (bloq[6]==false) && (jug[6]==false))
			{
				veci[2][0]=1;
				bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[7]=true;
				bloq[8]=true;
			}
			else
			if ((a=="8") && (veci[2][1] == 0) && (bloq[7]==false) && (jug[7]==false))
			{
				veci[2][1]=1;
				bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[8]=true;
			}
			else	
			if ((a=="9") && (veci[2][2] == 0) && (bloq[8]==false) && (jug[8]==false))
			{
				veci[2][2]=1;
				bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
			}
	 }
	 //Bloquo en jugadasBlanco*
	 public void setjugoBlanco(String a)
	 {
         conca="";
		 
		 if ((a=="1") && (veci[0][0] == 1) && (bloq[0]==false) && (jug[0]==false))
			{				
				veci[0][0]=0;
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;
			}
			else
			if ((a=="2") && (veci[0][1] == 1) && (bloq[1]==false) && (jug[1]==false))
			{
				veci[0][1]=0;
				/*bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;*/
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;
			}
			else
			if ((a=="3") && (veci[0][2] == 1) && (bloq[2]==false) && (jug[2]==false))
			{
				veci[0][2]=0;
				/*bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;*/
				
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;
			}
			else
			if ((a=="4") && (veci[1][0] == 1) && (bloq[3]==false) && (jug[3]==false))
			{
				veci[1][0]=0;
				/*bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;*/
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;
			}
			else
			if ((a=="5") && (veci[1][1] == 1) && (bloq[4]==false) && (jug[4]==false))
			{
				veci[1][1]=0;
				/*bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;
				*/
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;
			}
			else
			if ((a=="6") && (veci[1][2] == 1) && (bloq[5]==false) && (jug[5]==false))
			{
				veci[1][2]=0;
				/*
				bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;
				*/
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;
			}
			else
			if ((a=="7") && (veci[2][0] == 1) && (bloq[6]==false) && (jug[6]==false))
			{
				veci[2][0]=0;
				/*bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;*/
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;
			}
			else
			if ((a=="8") && (veci[2][1] == 1) && (bloq[7]==false) && (jug[7]==false))
			{
				veci[2][1]=0;
				/*bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;
				*/
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;
			}
			else	
			if ((a=="9") && (veci[2][2] == 1) && (bloq[8]==false) && (jug[8]==false))
			{
				veci[2][2]=0;
				/*bloq[0]=true;
				bloq[1]=true;
				bloq[2]=true;
				bloq[3]=true;
				bloq[4]=true;
				bloq[5]=true;
				bloq[6]=true;
				bloq[7]=true;
				bloq[8]=true;
				*/
				bloq[0]=false;
				bloq[1]=false;
				bloq[2]=false;
				bloq[3]=false;
				bloq[4]=false;
				bloq[5]=false;
				bloq[6]=false;
				bloq[7]=false;
				bloq[8]=false;
			}
		 
	 }
	 //Asignar valor a variable ganhumano*
	 public void setHumanogan()
	 {
		 if(veci[0][0]==1 && veci[0][1]==1 && veci[0][2]==1)
			{
				ganhumano = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
			}
			else
			if(veci[1][0]==1 && veci[1][1]==1 && veci[1][2]==1)
			{
				ganhumano = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
			}
			else
			if(veci[2][0]==1 && veci[2][1]==1 && veci[2][2]==1)
			{
				ganhumano = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
			}
			else
			if(veci[0][0]==1 && veci[1][0]==1 && veci[2][0]==1)
			{
				ganhumano = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
			}
			else
			if(veci[0][1]==1 && veci[1][1]==1 && veci[2][1]==1)
			{
				ganhumano = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
			}
			else
			if(veci[0][2]==1 && veci[1][2]==1 && veci[2][2]==1)
			{
				ganhumano = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
			}
			else
			if(veci[0][0]==1 && veci[1][1]==1 && veci[2][2]==1)
			{
				ganhumano = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
			}
			else
			if(veci[0][2]==1 && veci[1][1]==1 && veci[2][0]==1)
			{
				ganhumano = 1;
				jug[0]=true;
				jug[1]=true;
				jug[2]=true;
				jug[3]=true;
				jug[4]=true;
				jug[5]=true;
				jug[6]=true;
				jug[7]=true;
				jug[8]=true;
				contador=1;
			}
	 }
	 //Get para saber si gano el humano*
	 public int getGanahumano()
	 {
		 return ganhumano;
	 }
	 //Cambiar matriz a String*
	 public String getJuegoveci(String b)
		{
			for (int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{					
					conca = conca + veci[i][j];
				}
				
			}
			
			return conca;
		}
	 //Get devolver Cambios inicio*
	 public Icon getIniciar()
	 {
	  return ima1;
	 }
	 //Responder primer blanco*
	 public void setPrimerblanco()
	 {
		 if(bloq[0]==false && bloq[1]==false && bloq[2]==false && bloq[3]==false && bloq[4]==false && bloq[5]==false && bloq[6]==false && bloq[7]==false && bloq[8]==false && juego==true && juegoAtaque==false && juegoDefensa==false)
			{
				conca="";	
				
				for (int i=0;i<3;i++)
				{	
					for(int j=0;j<3;j++)
					{
						if(veci[i][j]==0 && auxiliar1==true)
						{
							if(i==0 && j==0)
							{
								jug[0]=true;
							}
							if(i==0 && j==1)
							{
								jug[1]=true;
							}
							if(i==0 && j==2)
							{
								jug[2]=true;
							}
							if(i==1 && j==0)
							{
								jug[3]=true;
							}
							if(i==1 && j==1)
							{
								jug[5]=true;
							}
							if(i==1 && j==2)
							{
								jug[6]=true;
							}
							if(i==2 && j==0)
							{
								jug[7]=true;
							}
							if(i==2 && j==1)
							{
								jug[8]=true;
							}
							if(i==2 && j==2)
							{
								jug[9]=true;
							}
							veci[i][j]=2;
							auxiliar1 = false;
							
						}
						
					}
					
				}
				
				
				
				auxiliar1=true;
			}
			else
			{
				conca="";	
			}
			
			juego=false;
	 }
	 //Responder Azar*
	 public void setAzar()
	 {
		 if(bloq[0]==false && bloq[1]==false && bloq[2]==false && bloq[3]==false && bloq[4]==false && bloq[5]==false && bloq[6]==false && bloq[7]==false && bloq[8]==false && juego==true && juegoAtaque == false && juegoDefensa==false )
			{
				conca="";
				
				Random fila = new Random();
				Random columna = new Random();
					filas=fila.nextInt(3);
					columnas=columna.nextInt(3);
				
					for (int i=filas;i>=0;i--)
					{
						for(int j=columnas;j>=0;j--)
						{
							if(veci[i][j]==0 && auxiliar2==true)
							{
								veci[i][j]=2;
								auxiliar2 = false;		
									
							}
								
									
						}
								
					}
					
					if(auxiliar2==true)
					{
						for (int i=filas;i<3;i++)
						{	
							for(int j=columnas;j<3;j++)
							{
								if(veci[i][j]==0 && auxiliar2==true)
								{
									veci[i][j]=2;
									auxiliar2 = false;		
										
								}
									
										
							}
									
						}
					}
				
				
		
				
				if(veci[0][0]==2)
				{
					jug[0]=true;
				}
				if(veci[0][1]==2)
				{
					jug[1]=true;
				}
				if(veci[0][2]==2)
				{
					jug[2]=true;
				}
				if(veci[1][0]==2)
				{
					jug[3]=true;
				}
				if(veci[1][1]==2)
				{
					jug[4]=true;
				}
				if(veci[1][2]==2)
				{
					jug[5]=true;
				}
				if(veci[2][0]==2)
				{
					jug[6]=true;
				}
				if(veci[2][1]==2)
				{
					jug[7]=true;
				}
				if(veci[2][2]==2)
				{
					jug[8]=true;
				}

				auxiliar2=true;
			}
			else
			{
				conca="";	
			}
			
			juego=false;
	 }
	 //Valor cuando gana maquina*
     public int getGanmaquina()
     {
    	 return ganmaquina;
     }
	 //verifica jugadas*
     public void setVerificajugadas(String c)
     {
    	 
    	 conca="";

 		for (int i=0; i<c.length();i++)
 		{
 			if(c.charAt(i)=='1')
 			{
 				switch (i){
 				case 0:
 					veci[0][0]=1;
 					break;
 				case 1:
 					veci[0][1]=1;		
 					break;
 				case 2:
 					veci[0][2]=1;	
 					break;
 				case 3:
 					veci[1][0]=1;
 					break;
 				case 4:
 					veci[1][1]=1;
 					break;
 				case 5:
 					veci[1][2]=1;
 					break;
 				case 6:
 					veci[2][0]=1;
 					break;
 				case 7:
 					veci[2][1]=1;
 					break;
 				case 8:
 					veci[2][2]=1;
 					break;
 				default:
 					System.out.println("Error" );
 			           break;
 				}
 			}
 		}
 		
 		for (int i=0; i<c.length();i++)
 		{
 			if(c.charAt(i)=='2')
 			{
 				switch (i){
 				case 0: 
 					veci[0][0]=2;
 					jug[0]=true;
 					break;
 				case 1:
 					veci[0][1]=2;
 					jug[1]=true;
 					break;
 				case 2:
 					veci[0][2]=2;	
 					jug[2]=true;
 					break;
 				case 3:
 					veci[1][0]=2;
 					jug[3]=true;
 					break;
 				case 4:
 					veci[1][1]=2;
 					jug[4]=true;
 					break;
 				case 5:
 					veci[1][2]=2;		
 					jug[5]=true;
 					break;
 				case 6:
 					veci[2][0]=2;	
 					jug[6]=true;
 					break;
 				case 7:
 					veci[2][1]=2;	
 					jug[7]=true;
 					break;
 				case 8:
 					veci[2][2]=2;
 					jug[8]=true;
 					break;
 				default:
 					System.out.println("Error" );
 			           break;
 				}
 			}
 		}
 	
 		juego=false;
     }
	 //Valor de empate*
     public int getEmpate()
     {
    	 if(jug[0]==true && jug[1]==true && jug[2]==true && jug[3]==true && jug[4]==true && jug[5]==true && jug[6]==true && jug[7]==true && jug[8]==true && contador==0)
 		{
 			x=1;
 		}
 		return x;
     }
     
     public void setConca()
     {
    	 conca="";
     }
     //Por verficar
     /*
     public void setVolver(String b)
     {
    	 if(b=="1")
    	 {
             veci[0][0]=0;
             bloq[0]=false;
	         jug[0]=false;
             
    	 }
    	 if(b=="2")
    	 {
             veci[0][1]=0;
             bloq[1]=false;
	         jug[1]=false;
             
    	 }
    	 if(b=="3")
    	 {
             veci[0][2]=0;
             bloq[2]=false;
	         jug[2]=false;
             
    	 }
    	 
    	 if(b=="4")
    	 {
             veci[1][0]=0;
             bloq[3]=false;
	         jug[3]=false;
             
    	 }
    	 if(b=="5")
    	 {
             veci[1][1]=0;
             bloq[4]=false;
	         jug[4]=false;
             
    	 }
    	 if(b=="6")
    	 {
             veci[1][2]=0;
             bloq[5]=false;
	         jug[5]=false;
             
    	 }
    	 if(b=="7")
    	 {
             veci[2][0]=0;
             bloq[6]=false;
	         jug[6]=false;
             
    	 }
    	 if(b=="8")
    	 {
             veci[2][1]=0;
             bloq[7]=false;
	         jug[7]=false;
             
    	 }
    	 if(b=="9")
    	 {
             veci[2][2]=0;
             bloq[8]=false;
	         jug[8]=false;
             
    	 }
    	 
     }*/
	}