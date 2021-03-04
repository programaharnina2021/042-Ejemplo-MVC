package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Nombrador;
import vista.UI;

public class ParaUI extends UI {
	private Controller controller;

	public ParaUI() {
		controller = new Controller();
		txtInicial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				char letra = txtInicial.getText().charAt(0);
				String nombre = controller.dameNombre(letra);
				lblNombre.setText(nombre);
			}
		});
	}
}
