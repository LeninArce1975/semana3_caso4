package caso4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tasaActual;
	private JLabel lblNewLabel_1;
	private JTextField txtNuevaTasa;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Tasa actual");
			lblNewLabel.setBounds(26, 27, 92, 13);
			contentPane.add(lblNewLabel);
		}
		{
			tasaActual = new JTextField(""+Banco.tasaInteres+"%");
			tasaActual.setEditable(false);
			tasaActual.setBounds(191, 24, 96, 19);
			contentPane.add(tasaActual);
			tasaActual.setColumns(10);
		}
		{
			lblNewLabel_1 = new JLabel("Ingrese nueva tasa");
			lblNewLabel_1.setBounds(26, 65, 120, 13);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtNuevaTasa = new JTextField();
			txtNuevaTasa.setBounds(191, 62, 96, 19);
			contentPane.add(txtNuevaTasa);
			txtNuevaTasa.setColumns(10);
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(136, 112, 85, 21);
			contentPane.add(btnNewButton);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(26, 156, 348, 80);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		double nuevaTasa=Double.parseDouble(txtNuevaTasa.getText());
		Banco1 b=new Banco1();
		txtS.append("La nueva tasa es: "+b.actualizarTasa(nuevaTasa)+"%");
	}
}
