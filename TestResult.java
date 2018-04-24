import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestResult extends JFrame implements ActionListener{

	public static final int WIDTH = 500;
	public static final int HEIGHT = 180;
	private JLabel ID = new JLabel("Student ID");
	private JLabel corr = new JLabel("# of Correct Answers");
	private JLabel incorr = new JLabel("# of Incorrect Answers");
	private JLabel percent = new JLabel("% of Correct Answers");
	
	private JTextField IDField = new JTextField(15);
	private JTextField corrField = new JTextField(15);
	private JTextField incorrField = new JTextField(15);
	private JTextField percentField = new JTextField(15);
	private JTextField empty = new JTextField(15);
	
	private JButton Close = new JButton("CLOSE");

	private JPanel NPanel = new JPanel();
	private JPanel SPanel = new JPanel();
	
	public TestResult()
	{
		super("Quiz: Test Result");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		setResizable(false);
		
		add(NPanel,BorderLayout.NORTH);
		NPanel.setLayout(new GridLayout(4,2));
		
		NPanel.add(ID);
		NPanel.add(IDField);
		NPanel.add(corr);
		NPanel.add(corrField);
		NPanel.add(incorr);
		NPanel.add(incorrField);
		NPanel.add(percent);
		NPanel.add(percentField);
		
		IDField.setEditable(false);
		corrField.setEditable(false);
		incorrField.setEditable(false);
		percentField.setEditable(false);
		
		add(SPanel,BorderLayout.SOUTH);
		SPanel.add(Close);
		SPanel.add(empty);
		empty.setEditable(false);
		
		Close.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		
		new TestResult();
	}


	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}
