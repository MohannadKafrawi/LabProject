import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuestionAdd extends JFrame implements ActionListener{
	
	public static final int WIDTH = 400;
	public static final int HEIGHT = 200;
	
	private JLabel enter = new JLabel("Enter Question: ");
	private JTextField QField = new JTextField(20);
	
	private JLabel op1 = new JLabel("Option 1 ");
	private JLabel op2 = new JLabel("Option 2 ");
	private JLabel op3 = new JLabel("Option 3 ");
	private JLabel op4 = new JLabel("Option 4 ");
	
	private JRadioButton b1 = new JRadioButton();
	private JRadioButton b2 = new JRadioButton();
	private JRadioButton b3 = new JRadioButton();
	private JRadioButton b4 = new JRadioButton();
	
	
	private JTextField op1Field = new JTextField(10);
	private JTextField op2Field = new JTextField(10);
	private JTextField op3Field = new JTextField(10);
	private JTextField op4Field = new JTextField(10);
	
	private JButton add = new JButton("Add Question");
	private JButton exit = new JButton("Exit");
	
	private JPanel NPanel = new JPanel();
	
	private JPanel CPanelMain = new JPanel();
	private JPanel CPanel1 = new JPanel();
	private JPanel CPanel2 = new JPanel();
	
	private JPanel SPanelMain = new JPanel();
	
	
	
	public QuestionAdd()
	{
		super("Add a Question");
		setSize(WIDTH,HEIGHT);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		add(NPanel,BorderLayout.NORTH);
		NPanel.add(enter);
		NPanel.add(QField);
		
		add(CPanelMain,BorderLayout.CENTER);
		CPanelMain.setLayout(new GridLayout(4,2));
		
		add(CPanel1,BorderLayout.CENTER);
		CPanel1.setLayout(new GridLayout(4,2));
		CPanel1.add(op1);
		CPanel1.add(b1);
		CPanel1.add(op2);
		CPanel1.add(b2);
		CPanel1.add(op3);
		CPanel1.add(b3);
		CPanel1.add(op4);
		CPanel1.add(b4);
		
		add(CPanel2,BorderLayout.CENTER);
		CPanel2.setLayout(new GridLayout(4,1));
		CPanel2.add(op1Field);
		CPanel2.add(op2Field);
		CPanel2.add(op3Field);
		CPanel2.add(op4Field);
		
		add(SPanelMain,BorderLayout.SOUTH);
		SPanelMain.add(add);
		add.addActionListener(this);
		SPanelMain.add(exit);
		exit.addActionListener(this);
		
		
		
	}
	
	public static void main(String[] args) {
			new QuestionAdd();
	}

	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == exit)
		{
			dispose();
			new Administrator();
		}
		
	}

}
