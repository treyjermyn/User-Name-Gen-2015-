import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class UserNameGen {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public UserNameGen(){
		prepareGUI();
	}

	public static void main(String[] args){
		UserNameGen usernameGen = new UserNameGen();
		usernameGen.showGenDemo();
	}

	private void prepareGUI() {

		mainFrame = new JFrame("User Name Generator");
		mainFrame.setSize(750,500);
		mainFrame.setLayout(new GridLayout(5,1));

		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}

	});


		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(500,500);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);



	}


	private void showGenDemo() {
		headerLabel.setText("Create a New User Name!");

		JLabel nameLabel = new JLabel("First word: ", JLabel.RIGHT);
		JLabel nameLabeldos = new JLabel("Second word(Optional): ", JLabel.CENTER);
		final JTextField usrInput01 = new JTextField(6);
		final JTextField usrInput02 = new JTextField(6);
	

		JButton genButton = new JButton("Generate");
		genButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
					int Low = 10;
					int High = 100;
					int Result = rand.nextInt(High-Low) + Low;
				String data = "Your new Username is..." + usrInput01.getText();
				data += new String(usrInput02.getText()) + Result;
				statusLabel.setText(data);
			}
		});

		controlPanel.add(nameLabel);
		controlPanel.add(usrInput01);
		controlPanel.add(nameLabeldos);
		controlPanel.add(usrInput02);
		controlPanel.add(genButton);
		mainFrame.setVisible(true);



	}
	

}