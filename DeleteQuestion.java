import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DeleteQuestion extends JFrame implements ActionListener{

	public static final int WIDTH = 500;
	public static final int HEIGHT = 160;
	
	private JLabel select = new JLabel("Select Question: ");
	private String [] questions = {"Mohannad","Kafrawi"};
	private JComboBox selectQ = new JComboBox(questions);
	
	private JButton delete = new JButton("Delete Question");
	
	public DeleteQuestion()
	{
		super("Remove a Question");
		setSize(WIDTH,HEIGHT);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		add(select);
		add(selectQ);
		add(delete);
		delete.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		
	new DeleteQuestion();
		
	}


	public void actionPerformed(ActionEvent e) {
		
		
	}

}
