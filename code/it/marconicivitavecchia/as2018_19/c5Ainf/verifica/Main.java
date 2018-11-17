
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Verifica in laboratorio");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(600,500);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder("html");

		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		sb.append("<h1>SSH First Aid</h1>");
		// Create div for table
		sb.append("<div style='display:table'>");
		// create the first row
		sb.append("<div style='display:table-row'>");
		// create the Product cell
		sb.append("<div style='display:table-cell'>");
		sb.append("Alias");
		sb.append("</div>");
		// create the Price cell
		sb.append("<div style='display:table-cell'>");
		sb.append("Hostname");
		sb.append("</div>");
		// close first row
		sb.append("</div>");
		sb.append("<div style='display:table-row'>");
        // create the Product cell
		sb.append("<div style='display:table-cell'>");
		sb.append("Raspberry");
		sb.append("</div>");
		// create the Price cell
		sb.append("<div style='display:table-cell'>");
		sb.append("server.marconi.it");
		sb.append("</div>");
		// close third row
		sb.append("</div>");
		// create the second row
		sb.append("<div style='display:table-row'>");
		// create the Product cell
		sb.append("<div style='display:table-cell'>");
		sb.append("CoreSwitch");
		sb.append("</div>");
		// create the Price cell
		sb.append("<div style='display:table-cell'>");
		sb.append("10.0.100.1");
		sb.append("</div>");
		// close third row
		sb.append("</div>");
		// close div for table
		sb.append("</div>");
		sb.append("</html>");
		// TODO Convertire lo StringBuilder in String
		String str = sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(str));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

