package ccsui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

public class GUIBuild extends JFrame implements ActionListener {
	private TestPush tP;
	private MapView mv;
	private JButton pauseButton = new JButton("pause");
	
	public GUIBuild()
	{
	 tP = new TestPush();
	 // tP.start();
	 setSize(1000,700);
	 mv = new MapView(tP);
	 
	 JMenuBar bar = new JMenuBar();
	 JMenu file = new JMenu("File");
	 JMenu edit = new JMenu("Edit");
	 JMenu save = new JMenu("Save");
	 JMenu load = new JMenu("Load");
	 JMenu help = new JMenu("Help");
	 JMenu about = new JMenu("About");
	 bar.add(file);
	 bar.add(edit);
	 bar.add(save);
	 bar.add(load);
	 bar.add(help);
	 bar.add(about);
	 this.setJMenuBar(bar);
	 
	 // center panel
//	 mv.setBorder(new EtchedBorder());
	 this.add(mv, BorderLayout.CENTER);
	 
	 
	 // bottom panel
	 JPanel bottomPanel = new JPanel();
	 bottomPanel.setBorder (new TitledBorder("Test"));
	 bottomPanel.setLayout (new GridLayout(1,1));
	 this.add(bottomPanel, BorderLayout.SOUTH);
	 bottomPanel.add(pauseButton);
	 setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
