package ui;

import java.awt.*;
import javax.swing.*;
import core.*;

public class MWStartFrame extends JPanel {
	private static final long serialVersionUID = 1L;
//	private Object parentOfAllParents = this;
	boolean logedIn = false;// = parentOfAllParents.isLogedIn();
	boolean connectedLocalDB = false;
	boolean connectedRemoteDB = false;
	Core coreO;

	public MWStartFrame(Core c) {
		coreO = c;
		setLayout(new GridLayout(10,0));
		
		add(new JLabel("This is the default start screen, here will come " +
				"lots of information regarding status, network, etc."));
		if (logedIn) {
			add(new JLabel("You are logged in as " + coreO.getUser().getUsername()));
		} else {
			add(new JLabel("You are not logged in."));
		}
		String text = "You are ";
		if (!connectedLocalDB) text += "NOT";
		text += " connected to local DB";
		add(new JLabel(text));
		text ="You are ";
		if (!connectedRemoteDB) text += "NOT";
		text += " connected to remote DB";
		add(new JLabel(text));
//		add(new JLabel("Actual version is: " + coreO.getVersion()));
	}
}
