import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddUser extends JFrame implements ActionListener{

	public static final int WIDTH = 370;
	public static final int HEIGHT = 170;
	
	private JLabel newU = new JLabel("New User: ");
	private JLabel pass = new JLabel("Password: ");
	private JLabel passConf = new JLabel("Confirm Password: ");
	
	private JTextField userField = new JTextField (10);
	private JPasswordField passF = new JPasswordField(10);
	private JPasswordField passConfF = new JPasswordField(10);
	
	private JButton add = new JButton("Add User");
	private JButton clear = new JButton("Clear");
	private JButton exit = new JButton("Exit");
	
	private JPanel CPanelMain = new JPanel();
	private JPanel CPanel1 = new JPanel();
	private JPanel CPanel2 = new JPanel();
	private JPanel SPanel = new JPanel();
	
	
	public AddUser()
	{
		super("Add New User");
		setLayout(new FlowLayout());
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setResizable(false);
		
		add(CPanelMain,BorderLayout.NORTH);
		CPanelMain.setLayout(new GridLayout(1,2));
		
		add(CPanel1,BorderLayout.NORTH);
		CPanel1.setLayout(new GridLayout(3,1));
		CPanel1.add(newU);
		CPanel1.add(pass);
		CPanel1.add(passConf);
		
		add(CPanel2,BorderLayout.NORTH);
		CPanel2.setLayout(new GridLayout(3,1));
		CPanel2.add(userField);
		CPanel2.add(passF);
		CPanel2.add(passConfF);
		
		add(SPanel,BorderLayout.SOUTH);
		SPanel.add(add);
		add.addActionListener(this);
		SPanel.add(clear);
		clear.addActionListener(this);
		SPanel.add(exit);
		exit.addActionListener(this);
		
		
	}
	
	
	public static void main(String[] args) {
		new AddUser();
	}

	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == exit)
		{
			dispose();
			new Administrator();
		}
		
		else if(ae.getSource() == clear)
		{
			userField.setText("");
			passF.setText("");
			passConfF.setText("");
		}
		
	}

}
