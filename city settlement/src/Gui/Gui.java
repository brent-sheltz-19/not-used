package Gui;
import gamecode.*;
import javax.swing.*;
import java.awt.color.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
public class Gui {

	public int width= 1080;
	public int height= 720;
	public JFrame frame;
	public JPanel panel;
	public JButton[] buttonlist = new JButton[5];
	private static String[] buttonlistNames = {"Demolish","Residential"};
	public gameBuilding[][] map;
	public Gui()
	{
		
		frame = new JFrame(" game ");
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setPreferredSize(new Dimension(width, height));
		panel = new JPanel();
		panel.setBackground(Color.black);
		panel.setPreferredSize(new Dimension(100, 100));
		frame.add(panel);
		for(int i = 0 ; i < 2;i++)
		{
			buttonlist[i] = new JButton(buttonlistNames[i]);
			buttonlist[i].setPreferredSize(new Dimension(10,10));
			frame.add(buttonlist[i]);
		}
		frame.pack();
		frame.setVisible(true);
	}
	public boolean isActive() {
		// TODO Auto-generated method stub
		return frame.isActive();
	}

}