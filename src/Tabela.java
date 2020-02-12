import java.awt.*;
import java.util.Iterator;

import javax.swing.*;

public class Tabela extends JPanel 
{
   private int mViti;
   private String mDrejtimi;
   
	public Tabela() 
   {
		JFrame frame = new JFrame("Tabela e orarit");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollPane scroll = new JScrollPane(this);
		scroll.getViewport().setScrollMode(JViewport.SIMPLE_SCROLL_MODE);
		frame.getContentPane().add(scroll);
		frame.setVisible(true);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int n = Databaza.DREJTIMI.size();
		int x = 0, y = -50;
		g.setColor(Color.BLACK);
		for (int i=0; i<n; i++) {//Gjenerojme rastesisht kohen dhe sallat e ligjeratave
			Drejtimi drejtim = Databaza.DREJTIMI.get(700+i);
			Iterator<Ligjerata> iter = drejtim.iteruesLigjeratave();//Marrim iteruesin e ligjeratave te 1 drejtimi
			g.setFont(new Font("Arial", 2, 20));
			x = 0;
			y += 30;
			g.drawString(drejtim.merrDrejtimin() + drejtim.merrVitin(), x, y+55);
			g.setFont(new Font("Arial", 0, 11));
			y += 60;
			while (iter.hasNext()) {
				Ligjerata l = iter.next();
				
				g.drawRect(x, y, 200, 60);
				String lenda = l.getLenda()!=null ? l.getLenda().getEmriLendes() : "";
				g.drawString(l.getDepartamentin(), x, y+12);
				g.drawString(l.getProfesor().getEmriProfesorit(), x, y+24);
				g.drawString(lenda, x, y+36);
				g.drawString(l.getOra().toString(), x, y+48);
				g.drawString(l.getSalla().getEmriSalles(), x, y+60);
				
				
				x += 200;
				if (x > 1000 && iter.hasNext()) {
					x = 0;
					y += 60;
				}
         }   
		}
		this.setPreferredSize(new Dimension(x, y));
	}
}
