package componente;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridLayout;

public class Componente extends JPanel{
	
	private JLabel lberror;
	private JLabel lbinformacion;
	public Componente() {
		init();
	}

	private void init() {
		lberror=new JLabel();
		lbinformacion=new JLabel();
		lberror.setForeground(Color.red);
		lbinformacion.setForeground(Color.green);
		JLabel lbmensaje_error=new JLabel("mensaje error: ");
		JLabel lbmensaje_informacion=new JLabel("mensaje informacion");
		setBackground(new Color(120, 153, 245));
		setLayout(new GridLayout(1,4));
		add(lbmensaje_error);
		add(lberror);
		add(lbmensaje_informacion);
		add(lbinformacion);
	}
	
	public void SetLabelError(String s) {
		lberror.setText(s);
	}
	
	public void SetLabelInformacion(String s) {
		lbinformacion.setText(s);
	}

	private static final long serialVersionUID = 1L;

}
