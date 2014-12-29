package demo1.view;

import javax.swing.JFrame;

import demo1.model.Model;

public class View extends JFrame {
	
	private Model model;

	public View(Model model) {
		super("MVC Demo");
		
		this.model = model;
	}
	
	

}
