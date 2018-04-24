import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RemoveUser extends JFrame implements ActionListener{

	public static final int WIDTH = 500;
	public static final int HEIGHT = 160;
	
	private JLabel select = new JLabel("Select User: ");
	private String [] questions = {"Mohannad","Kafrawi"};
	private JComboBox selectU = new JComboBox(questions);
	
	private JButton delete = new JButton("Delete User");
	
	public RemoveUser()
	{
		super("Remove a User");
		setSize(WIDTH,HEIGHT);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		add(select);
		add(selectU);
		add(delete);
		delete.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		
	new RemoveUser();
		
	}


	public void actionPerformed(ActionEvent e) {
		
		
		
	}

}
