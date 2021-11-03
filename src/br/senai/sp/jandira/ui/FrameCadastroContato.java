package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JTree;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Checkbox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class FrameCadastroContato extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField textDataNasciemnto;
	private JLabel lblCidade;
	private final ButtonGroup buttonGroupSexo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCadastroContato frame = new FrameCadastroContato();
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
	public FrameCadastroContato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtNome.setBounds(10, 87, 275, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNome.setBounds(10, 56, 75, 20);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-MAIL:");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblEmail.setBounds(10, 118, 46, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtEmail.setBounds(10, 143, 275, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblTelefone.setBounds(10, 174, 99, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(10, 199, 132, 20);
		contentPane.add(txtTelefone);
		
		JComboBox<Object> comboCidades = new JComboBox<Object>();
		comboCidades.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		comboCidades.setModel(new DefaultComboBoxModel<Object>(new String[] {"SELECIONE...", "BARUERI", "CARAPICUIBA", "ITAPEVI", "JANDIRA", "OSASCO"}));
		comboCidades.setBounds(171, 197, 154, 22);
		contentPane.add(comboCidades);
		
		textDataNasciemnto = new JTextField();
		textDataNasciemnto.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textDataNasciemnto.setToolTipText("");
		textDataNasciemnto.setBounds(171, 255, 86, 20);
		contentPane.add(textDataNasciemnto);
		textDataNasciemnto.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("DATA NASCIMENTO:");
		lblDataNascimento.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblDataNascimento.setBounds(171, 230, 140, 14);
		contentPane.add(lblDataNascimento);
		
		lblCidade = new JLabel("CIDADE:");
		lblCidade.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblCidade.setBounds(174, 174, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblSexo = new JLabel("SEXO:");
		lblSexo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblSexo.setBounds(10, 230, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnSexoFeminino = new JRadioButton("FEMININO");
		rdbtnSexoFeminino.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		buttonGroupSexo.add(rdbtnSexoFeminino);
		rdbtnSexoFeminino.setBounds(10, 253, 109, 23);
		contentPane.add(rdbtnSexoFeminino);
		
		JRadioButton rdbtnSexoMasculino = new JRadioButton("MASCULINO");
		rdbtnSexoMasculino.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		buttonGroupSexo.add(rdbtnSexoMasculino);
		rdbtnSexoMasculino.setBounds(10, 279, 109, 23);
		contentPane.add(rdbtnSexoMasculino);
		
		JButton btnNewButton = new JButton("SALVAR CONTATO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(61, 309, 190, 51);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnContatos = new JTextPane();
		txtpnContatos.setText("CONTATOS");
		txtpnContatos.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtpnContatos.setBounds(0, 0, 335, 45);
		contentPane.add(txtpnContatos);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(210, 382, 61, 25);
		contentPane.add(lblNewLabel);
		



	}
}
