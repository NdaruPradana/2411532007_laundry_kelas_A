package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;

public class UserFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnSave;
	private JTable tableUsers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserFrame frame = new UserFrame();
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
	public UserFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(123, 37, 285, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(123, 63, 285, 19);
		contentPane.add(txtUsername);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(123, 92, 285, 19);
		contentPane.add(txtPassword);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(49, 40, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(49, 66, 69, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(49, 95, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(323, 142, 85, 21);
		contentPane.add(btnCancel);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(228, 142, 85, 21);
		contentPane.add(btnDelete);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(133, 142, 85, 21);
		contentPane.add(btnUpdate);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(38, 142, 85, 21);
		contentPane.add(btnSave);
		
		tableUsers = new JTable();
		tableUsers.setBounds(41, 199, 367, 373);
		contentPane.add(tableUsers);
	}
}
