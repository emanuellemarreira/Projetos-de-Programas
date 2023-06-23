import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SobreOApp extends JFrame {
	JPanel panel;
	JLabel texto;
	
	SobreOApp(){
		JLabel texto = new JLabel();
		texto.setText("Produzido por Emanuelle e Beatriz");
		
		panel = new JPanel(new GridLayout(3, 1));

        panel.add(texto);
        add(panel, BorderLayout.CENTER);
        setTitle("Sobre o aplicativo");
        setSize(300, 100);
        setVisible(true);
	}
}
