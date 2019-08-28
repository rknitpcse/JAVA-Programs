import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	private double first_num,scnd_num,rslt;
	private String oprsn,ans;

	/**
	 * Launch the Calculator application.
	 * The developer of this calculator Rakesh Kumar.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 467, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 13, 425, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//-----------------Row 0-------------------------------------------
		
		JButton btnReset = new JButton("C");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String clear=null;
				textField.setText(clear);
			}
		});
		btnReset.setBackground(new Color(0, 0, 255));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnReset.setBounds(12, 90, 50, 50);
		frame.getContentPane().add(btnReset);
		
		
		JButton btnprsnt = new JButton("\u0025");
		btnprsnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				oprsn="%";
			}
		});
		btnprsnt.setBackground(new Color(0, 0, 255));
		btnprsnt.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnprsnt.setBounds(74, 90, 112, 50);
		frame.getContentPane().add(btnprsnt);
		
		
		JButton btnmod = new JButton("mod");
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				oprsn="mod";
			}
		});
		btnmod.setBackground(new Color(0, 0, 255));
		btnmod.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnmod.setBounds(198, 90, 129, 50);
		frame.getContentPane().add(btnmod);
		
		
		JButton btnBkSpc = new JButton("<-");
		btnBkSpc.setBackground(new Color(0, 0, 255));
		btnBkSpc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					textField.setText(strB.toString());
				}
			}
		});
		btnBkSpc.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnBkSpc.setBounds(339, 90, 98, 50);
		frame.getContentPane().add(btnBkSpc);
		
		//-------------Row 1 ----------------------------------
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText()+btn7.getText();
				textField.setText(enterNumber);
			}
		});
		btn7.setBackground(new Color(255, 192, 203));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn7.setBounds(12, 163, 50, 50);
		frame.getContentPane().add(btn7);
		
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText()+btn8.getText();
				textField.setText(enterNumber);
			}
		});
		btn8.setBackground(new Color(255, 192, 203));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn8.setBounds(74, 163, 50, 50);
		frame.getContentPane().add(btn8);
		
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText()+btn9.getText();
				textField.setText(enterNumber);
			}
		});
		btn9.setBackground(new Color(255, 192, 203));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn9.setBounds(136, 163, 50, 50);
		frame.getContentPane().add(btn9);
		
		
		
		JButton btnPlus = new JButton("\u002B");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				oprsn="+";
			}
		});
		btnPlus.setBackground(new Color(255, 69, 0));
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnPlus.setBounds(198, 153, 60, 60);
		frame.getContentPane().add(btnPlus);
		
		
		
		
		JButton btnSub = new JButton("\u002D");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				oprsn="-";
			}
		});
		btnSub.setBackground(new Color(255, 69, 0));
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSub.setBounds(267, 153, 60, 60);
		frame.getContentPane().add(btnSub);
		
		
		
		JButton btnSqRoot = new JButton("Sqrt");
		btnSqRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				oprsn="sqrt";
				String answer="";
				if(oprsn=="sqrt")
				{
						rslt=Math.sqrt(first_num);
						answer=String.format("%.2f", rslt);
						textField.setText(answer);
				}
			}
		});
		btnSqRoot.setBackground(new Color(255, 0, 255));
		btnSqRoot.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSqRoot.setBounds(339, 153, 98, 60);
		frame.getContentPane().add(btnSqRoot);
		
		//--------------Row 2----------------------------------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText()+btn4.getText();
				textField.setText(enterNumber);
			}
		});
		btn4.setBackground(new Color(255, 192, 203));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn4.setBounds(12, 236, 50, 50);
		frame.getContentPane().add(btn4);
		
		
		
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText()+btn5.getText();
				textField.setText(enterNumber);
			}
		});
		btn5.setBackground(new Color(255, 192, 203));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn5.setBounds(74, 236, 50, 50);
		frame.getContentPane().add(btn5);
		
		
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText()+btn6.getText();
				textField.setText(enterNumber);
			}
		});
		btn6.setBackground(new Color(255, 192, 203));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn6.setBounds(136, 236, 50, 50);
		frame.getContentPane().add(btn6);
		
		
		
		
		JButton btnMul = new JButton("\u002A");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				oprsn="*";
			}
		});
		btnMul.setBackground(new Color(255, 69, 0));
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnMul.setBounds(198, 226, 60, 60);
		frame.getContentPane().add(btnMul);
		
		
		
		
		JButton btnDiv = new JButton("\u002F");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				oprsn="/";
			}
		});
		btnDiv.setBackground(new Color(255, 69, 0));
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnDiv.setBounds(270, 226, 60, 60);
		frame.getContentPane().add(btnDiv);
		
		
		
		
		JButton btnSqr = new JButton("()^2");
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				oprsn="square";
				String answer="";
				if(oprsn=="square")
				{
						rslt=first_num*first_num;
						answer=String.format("%.2f", rslt);
						textField.setText(answer);
				}
			}
		});
		btnSqr.setBackground(new Color(255, 0, 255));
		btnSqr.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSqr.setBounds(339, 226, 98, 60);
		frame.getContentPane().add(btnSqr);
		
		//--------------------Row 3-----------------------------------------
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText()+btn1.getText();
				textField.setText(enterNumber);
			}
		});
		btn1.setBackground(new Color(255, 192, 203));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn1.setBounds(12, 304, 50, 50);
		frame.getContentPane().add(btn1);
		
		
		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText()+btn2.getText();
				textField.setText(enterNumber);
			}
		});
		btn2.setBackground(new Color(255, 192, 203));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn2.setBounds(74, 304, 50, 50);
		frame.getContentPane().add(btn2);
		
		
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText()+btn3.getText();
				textField.setText(enterNumber);
			}
		});
		btn3.setBackground(new Color(255, 192, 203));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn3.setBounds(136, 304, 50, 50);
		frame.getContentPane().add(btn3);
		
		
		
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText()+btnZero.getText();
				textField.setText(enterNumber);
			}
		});
		btnZero.setBackground(new Color(255, 69, 0));
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnZero.setBounds(198, 294, 60, 60);
		frame.getContentPane().add(btnZero);
		
		
		
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText()+btndot.getText();
				textField.setText(enterNumber);
			}
		});
		btndot.setBackground(new Color(255, 69, 0));
		btndot.setFont(new Font("Tahoma", Font.BOLD, 21));
		btndot.setBounds(270, 294, 60, 60);
		frame.getContentPane().add(btndot);
		
		
		
		
		
		JButton btnSqr_X = new JButton("()^x");
		btnSqr_X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				oprsn="pow";
			}
		});
		btnSqr_X.setBackground(new Color(255, 0, 255));
		btnSqr_X.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSqr_X.setBounds(339, 294, 98, 60);
		frame.getContentPane().add(btnSqr_X);
		
		//--------------Row 5-------------------------------------------------
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer="";
				if(oprsn=="+")
				{
					scnd_num=Double.parseDouble(textField.getText());
					rslt=first_num+scnd_num;
					answer=String.format("%.2f", rslt);
					textField.setText(answer);
				}
				else if(oprsn=="-")
				{
					scnd_num=Double.parseDouble(textField.getText());	
					rslt=first_num-scnd_num;
					answer=String.format("%.2f", rslt);
					textField.setText(answer);
				}
				else if(oprsn=="*")
				{
					scnd_num=Double.parseDouble(textField.getText());
					rslt=first_num*scnd_num;
					answer=String.format("%.2f", rslt);
					textField.setText(answer);
				}
				else if(oprsn=="mod")
				{
					scnd_num=Double.parseDouble(textField.getText());
					rslt=first_num%scnd_num;
					answer=String.format("%.2f", rslt);
					textField.setText(answer);
				}
				else if(oprsn=="/")
				{
					scnd_num=Double.parseDouble(textField.getText());
					rslt=first_num/scnd_num;
					answer=String.format("%.2f", rslt);
					textField.setText(answer);
				}
				else if(oprsn=="%")
				{
					scnd_num=Double.parseDouble(textField.getText());
					rslt=(first_num*scnd_num)*0.01;
					answer=String.format("%.2f", rslt);
					textField.setText(answer);
				}
				else if(oprsn=="pow")
				{
					scnd_num=Double.parseDouble(textField.getText());	
					rslt=Math.pow(first_num, scnd_num);
					answer=String.format("%.2f", rslt);
					textField.setText(answer);
				}
			}
		});
		btnEnter.setBackground(Color.GREEN);
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnEnter.setBounds(12, 367, 425, 56);
		frame.getContentPane().add(btnEnter);
		
	}
}
