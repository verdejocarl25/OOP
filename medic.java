import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class medic extends JFrame{
		
JFrame pnlOne = new JFrame();
JPanel pnlTwo = new JPanel();
JPanel pnlMain = new JPanel();
		
JLabel lblUser = new JLabel ("Enter a Username: ");
JLabel lblPass = new JLabel ("Enter a Password: ");
JLabel lblConPass = new JLabel ("Confirm your Password: ");    
		
JButton btnSubmit = new JButton ("Submit");
JButton btnClearAll = new JButton ("ClearAll");
JButton btnOkay = new JButton ("Okay");
		
JTextField fldUser = new JTextField(25);
JTextField fldPass = new JTextField(25);
JTextField fldConPass = new JTextField(25);
		
JTextArea outputArea = new JTextArea (14, 45);
		
FlowLayout fl = new FlowLayout();
Font setFont = new Font ("",Font.BOLD, 14);
		
public static void main (String[] args) {
	medic medic = new medic();
}		
public medic(){
	this.setSize(350,450);
	this.setLocation(850,200);
	this.setTitle("Example panel 1");
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	outputArea.setBackground(Color.LIGHT_GRAY);
	outputArea.setEditable(false);
	outputArea.setFont(setFont);
			
	fldUser.setFont(setFont);
	fldPass.setFont(setFont);
	fldConPass.setFont(setFont);

	pnlMain.add(lblUser);
	pnlMain.add(fldUser);

	pnlMain.add(lblPass);
	pnlMain.add(fldPass);

	pnlMain.add(lblConPass);
	pnlMain.add(fldConPass);

	btnSubmit.addActionListener(new actionButton1());
	pnlMain.add(btnSubmit);
	btnClearAll.addActionListener(new actionButton2());
	pnlMain.add(btnClearAll);
		
	this.add(pnlMain);
	this.setVisible(true); 			
}		
class actionButton1 implements ActionListener {
@Override
public void actionPerformed(ActionEvent a){
	String userName = fldUser.getText();
	String passWord = fldPass.getText();
	String conPassword = fldConPass.getText();
			
	outputArea.append("\nUsername: \n"+userName+
			"\nRegistered Successfully\n");
	pnlOne.setSize(700,350);
	pnlOne.setLocation(200,200);
	pnlOne.setTitle("Example panel 2");
	pnlOne.setResizable(false);
	btnSubmit.setEnabled(false);
	pnlOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pnlOne.setVisible(true);
			
	pnlOne.add(pnlTwo);
	pnlTwo.add(outputArea);
	btnOkay.addActionListener(new actionButton3());
	pnlTwo.add(btnOkay);
	}
}
class actionButton2 implements ActionListener {
@Override
public void actionPerformed(ActionEvent b){
	fldUser.setText("");
	fldPass.setText("");
	fldConPass.setText("");
	outputArea.setText("");	
	}
}
class actionButton3 implements ActionListener {
@Override
public void actionPerformed(ActionEvent c){
	fldUser.setText("");
	fldPass.setText("");
	fldConPass.setText("");
	outputArea.setText("");
	pnlOne.dispose();
	btnSubmit.setEnabled(true);
		}
	}
}

