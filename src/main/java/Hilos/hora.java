/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

/**
 *
 * @author snayd
 */

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class hora extends Thread{
	
	private JLabel lbl;

public hora (JLabel lbl)
{
	this.lbl=lbl;
}

public void run()
{
	while(true)
	{
		//obtengo la hora mediante la libreria Date
		Date hoy = new Date();
		//obtengo en formato de horas/minutos/segundos
		SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
		lbl.setText(s.format(hoy));
		try
		{
			//para que cuente de segundo a segundo
			sleep(1000);
			
		}catch (Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Error al obtener la hora");
		}
		}
	}
}

