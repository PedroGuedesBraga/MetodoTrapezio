package fisicaTrabalho;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Janela {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(31, 248, 360, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		Button button = new Button("Calcular");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_4.setText("O resultado é aproximadamente: " + Trapezio.calculaIntegral(Double.parseDouble(textField_1.getText()), Double.parseDouble(textField_2.getText()), Double.parseDouble(textField_3.getText()), textField.getText()));
			}
		});
		button.setBounds(135, 193, 143, 22);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setBounds(31, 40, 193, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Fun\u00E7\u00E3o:");
		lblNewLabel.setBounds(31, 26, 86, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(31, 97, 56, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(124, 97, 56, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Intervalos de Integra\u00E7\u00E3o:");
		lblNewLabel_1.setBounds(31, 82, 178, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("at\u00E9");
		lblNewLabel_2.setBounds(97, 100, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(31, 141, 56, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("N\u00FAmero de parti\u00E7\u00F5es:");
		lblNewLabel_3.setBounds(31, 126, 149, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
	}
}
