package ui;
/**
 * @author Aun Johnsen
 */
import java.awt.*;
import javax.swing.*;

public class loginFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private String enteredUsername;
	private String enteredPassword;
	private JTextField userBox = new JTextField();
	private JPasswordField passBox = new JPasswordField();

	public loginFrame(String title) {
		setTitle(title);
		setLayout(new BorderLayout());
		add(new JPanel(), BorderLayout.NORTH);
		add(new JPanel(), BorderLayout.SOUTH);
		
		LoginPanel lPanel = new LoginPanel();
		add(lPanel, BorderLayout.CENTER);
	}
	
	private class LoginPanel extends JPanel {
		private static final long serialVersionUID = 1L;

		public LoginPanel() {
			setLayout(new GridLayout(2,2,3,3));
			add(new JLabel("Username:"), JLabel.RIGHT);
			add(userBox);
			add(new JLabel("Password:"), JLabel.RIGHT);
			add(passBox);
		}
	}
	
	public String getUsername() {
		return enteredUsername;
	}
	public String getPasswordEntered() {
		return enteredPassword;
	}
}
