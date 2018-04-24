import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Administrator extends JFrame implements ActionListener{

	public static final int WIDTH = 500;
	public static final int HEIGHT = 160;
	
	private JMenuBar AdminBar = new JMenuBar();
	
	private JMenu quiz = new JMenu("Quiz");
	private JMenuItem addQ = new JMenuItem("Add Question");
	private JMenuItem deleteQ = new JMenuItem("Delete Question");
	
	private JMenu user = new JMenu("User");
	private JMenuItem addU = new JMenuItem("Add User");
	private JMenuItem deleteU = new JMenuItem("Delete User");
	
	private JMenu report = new JMenu("Report");
	private JMenuItem view = new JMenuItem("View Report");
	
	private JMenu exit = new JMenu("Exit");
	private JMenuItem Exit = new JMenuItem("Exit");
	
	
	public Administrator()
	{
		super("Administrator");
		setSize(WIDTH,HEIGHT);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		setJMenuBar(AdminBar);
		AdminBar.add(quiz);
		AdminBar.add(user);
		AdminBar.add(report);
		AdminBar.add(exit);
		
		quiz.add(addQ);
		addQ.addActionListener(this);
		quiz.add(deleteQ);
		deleteQ.addActionListener(this);
		
		user.add(addU);
		addU.addActionListener(this);
		user.add(deleteU);
		deleteU.addActionListener(this);
		
		report.add(view);
		view.addActionListener(this);
		
		exit.add(Exit);
		Exit.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		new Administrator();
	}


	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == Exit)
		{
			dispose();
			new LoginScreen();
		}
		else if(ae.getSource() == addQ )
		{
			dispose();
			new QuestionAdd();
		}
		else if(ae.getSource() == deleteQ )
		{
			dispose();
			new DeleteQuestion();
		}
		else if(ae.getSource() == addU )
		{
			dispose();
			new AddUser();
		}
		else if(ae.getSource() == deleteU )
		{
			dispose();
			new RemoveUser();
		}
		
			
		
	}


	

}
