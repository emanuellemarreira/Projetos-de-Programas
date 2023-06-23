import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Operacoes extends JFrame {
	JPanel panel;
	JLabel numero1, numero2, resultado;
	JTextField n1, n2;
	JButton calcular;
	Operacoes(int op){
		panel = new JPanel(new GridLayout(3, 1));
		
		JLabel numero1 = new JLabel();
		numero1.setText("Digite o primeiro numero: ");
		panel.add(numero1);
		
		n1 = new JTextField();
		panel.add(n1);
		
		JLabel numero2 = new JLabel();
		numero2.setText("Digite o segundo numero: ");
		panel.add(numero2);
		
		n2 = new JTextField();
		panel.add(n2);
		
		JButton calcular = new JButton("Calcular");
		panel.add(calcular);
        
        add(panel, BorderLayout.CENTER);
        setTitle("Sobre o aplicativo");
        setSize(315, 100);
        setVisible(true);
	}

}
