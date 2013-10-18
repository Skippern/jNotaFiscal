package ui;

import javax.swing.*;
import core.*;

public class MainWindowWorkarea extends JPanel {
	private static final long serialVersionUID = 1L;
	private String mode = "NOT SET";
	private Core mw;
	private JPanel ActiveFrame;

	public MainWindowWorkarea(String arg, Core window) {
		mode = arg;
		mw = window;
		
		setActiveFrame(mode);
		
//		add(new JLabel("Work Area to come here"));
	}
	
	public void setMode(String arg) {
		mode = arg;
		this.remove(ActiveFrame);
		setActiveFrame(mode);
//		mw.repaint();
	}
	public void setActiveFrame(String arg) {
		switch (arg) {
		case "StartPage":
			ActiveFrame = new MWStartFrame(mw);
//			mw.repaint();
			break;
		default:
			ActiveFrame = new MWErrorFrame();
//			mw.repaint();
			break;
		}
		this.add(ActiveFrame);
	}
	public String getMode() {
		return mode;
	}
	public String getVersion() {
		return mw.getVersion();
	}
}
