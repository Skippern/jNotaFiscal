package ui;
/**
 * 
 * @author Aun Johnsen
 *
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class AboutWindow extends JFrame {
	JFrame aWindow = this;
	/**
	 * @author Aun Johnsen
	 */
	private static final long serialVersionUID = 1L;
	public AboutWindow(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		
		add(new CompanyLogo(), BorderLayout.NORTH);
		add(new AboutPanel(), BorderLayout.CENTER);
		
		JButton okButton = new JButton("Ok");
		okButton.setActionCommand("Ok");
		add(okButton, BorderLayout.SOUTH);
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aWindow.dispose();
			}
		});
		
		pack();
	}
	
	private class AboutPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private AboutPanel() {
			setLayout(new GridLayout(5,1,3,3));
			add(new JLabel("Field 1 - headline"));
			add(new JLabel("Field 2 - introduction"));
			add(new JLabel("Field 3 - copyright"));
			add(new JLabel("Field 4 - developers"));
			add(new JLabel("Field 5 - contacts "));
		}
	}
	
	private class CompanyLogo extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private CompanyLogo() {
			ImageIcon logo = new ImageIcon("gfx/logo.png");
			logo.setDescription("Johnsen Offshore");
			/*
			 * Need to figure out this without the use of JButton
			 */
			JButton logoButton = new JButton(logo);
			logoButton.setEnabled(true);
			logoButton.setFocusable(false);
			add(logoButton);
		}
	}
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	*/
}
