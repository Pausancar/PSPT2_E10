package es.studium.Ejercicio9;

import javax.swing.JFrame;
public class PrincipalBola extends JFrame
{
	private static final long serialVersionUID = 1L;
	public PrincipalBola()
	{
		super();//Estamos llamadno al constructor de JFrame
	}
	public static void main(String args[])
	{
		PrincipalBola f = new PrincipalBola();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Bolas");
		f.setContentPane(new PanelBola());
		f.setSize(500, 600);
		f.setVisible(true);
	}
}