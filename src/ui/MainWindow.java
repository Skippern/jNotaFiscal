package ui;
/**
 * @author Aun Johnsen
 * Project: Nota Fiscal
 * File: MainWindow.java
 * 
 */
import javax.swing.*;
import core.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame implements ActionListener {
	/**
	 * @author Aun Johnsen
	 */
	private static final long serialVersionUID = 1L;
	public Core coreO;
	public JPanel WorkAreaHandler = new MainWindowWorkarea("StartPage", coreO);
	private String activeMode = null;
	private JMenuItem menuItem;
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem fileMenuConnect;
	private JMenuItem fileMenuReconnect;
	private JMenuItem fileMenuDisconnect;
	private JMenuItem fileMenuLogin;
	private JMenuItem fileMenuLogout;
	private JMenuItem fileMenuReplicate;
	private JMenuItem fileMenuAdmin;
	private JMenu helpMenu;
	private JMenu modeMenu;
	private JMenu stockMenu;
	private JMenu costMenu;
	private JMenu clientMenu;
	private JMenu supplierMenu;
	private JMenu maintenanceMenu;
	private JMenu reportMenu;
	
	private JMenu projectMenu;
	private JMenuItem menuItemProject;
	private JMenu invoiceMenu;
	private JMenuItem menuItemInvoice;
	private JMenu orderMenu;
	private JMenuItem menuItemOrder;
	private JMenu timesheetMenu;
	private JMenuItem menuItemTimesheet;
	private JMenu materialMenu;
	private JMenuItem menuItemMaterial;
	private JMenu employeeMenu;
	private JMenuItem menuItemEmployee;
	
	// Building first Window
	/**
	 * 
	 * @param title
	 * <p> Title of the main window
	 * @param mainO
	 * <p>The Core object to tie the pieces together, it will hold
	 * the database links, as well as several containers with the 
	 * table data.
	 */
	public MainWindow(String title, Core mainO) {
		coreO = mainO;
		setTitle(title);
		/* Open in max window size */
		setSize(860,640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		/* 
		 * Add two components, a menu on (BorderLayout.WEST) 
		 * and the main content in the rest of the windows,
		 * with a content menu on the top (available menu
		 * items should depend on active window
		 * 
		 * Startup window should have base information, such as
		 * active projects, open invoices, unpaid invoices, outstanding
		 * travel expanses, availability, etc.
		 */
		add(new ButtonFrame(), BorderLayout.NORTH);
		add(new MainWindowComponentList(), BorderLayout.WEST);
		add(WorkAreaHandler);
		
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');
		fileMenuConnect = new JMenuItem("Connect");
		fileMenuConnect.setActionCommand("Connect db");
		fileMenuConnect.setMnemonic('C');
		fileMenuConnect.addActionListener(this);
		fileMenuConnect.setVisible(true);
		fileMenu.add(fileMenuConnect);
		fileMenuReconnect = new JMenuItem("Reconnect");
		fileMenuReconnect.setActionCommand("Reconnect db");
		fileMenuReconnect.setMnemonic('C');
		fileMenuReconnect.addActionListener(this);
		fileMenuReconnect.setVisible(false);
		fileMenu.add(fileMenuReconnect);
		fileMenuDisconnect = new JMenuItem("Disconnect");
		fileMenuDisconnect.setActionCommand("Disconnect db");
		fileMenuDisconnect.setMnemonic('D');
		fileMenuDisconnect.addActionListener(this);
		fileMenuDisconnect.setEnabled(false);
		fileMenuDisconnect.setVisible(true);
		fileMenu.add(fileMenuDisconnect);
		fileMenuLogin = new JMenuItem("Log in");
		fileMenuLogin.setActionCommand("Log in");
		fileMenuLogin.setMnemonic('L');
		fileMenuLogin.addActionListener(this);
		fileMenuLogin.setEnabled(true);
		fileMenuLogin.setVisible(true);
		fileMenu.add(fileMenuLogin);
		fileMenuLogout = new JMenuItem("Log out");
		fileMenuLogout.setActionCommand("Log out");
		fileMenuLogout.setMnemonic('L');
		fileMenuLogout.addActionListener(this);
		fileMenuLogout.setVisible(false);
		fileMenu.add(fileMenuLogout);
		fileMenuReplicate = new JMenuItem("Replicate");
		fileMenuReplicate.setActionCommand("Replicate");
		fileMenuReplicate.setMnemonic('R');
		fileMenuReplicate.addActionListener(this);
		fileMenuReplicate.setEnabled(false);
		fileMenuReplicate.setVisible(true);
		fileMenu.add(fileMenuReplicate);
		fileMenu.addSeparator();
		fileMenuAdmin = new JMenuItem("Administrator Mode");
		fileMenuAdmin.setActionCommand("Tuggle Admin Mode");
		fileMenuAdmin.setMnemonic('A');
		fileMenuAdmin.addActionListener(this);
		fileMenuAdmin.setEnabled(false);
		fileMenuAdmin.setVisible(true);
		fileMenu.add(fileMenuAdmin);
		fileMenu.addSeparator();
		menuItem = new JMenuItem("Print");
		menuItem.setActionCommand("Print Page");
		menuItem.setMnemonic('P');
		menuItem.addActionListener(this);
		fileMenu.add(menuItem);
		menuItem = new JMenuItem("Exit");
		menuItem.setMnemonic('x');
		menuItem.setActionCommand("Exit");
		menuItem.addActionListener(this);
		fileMenu.add(menuItem);
		
		invoiceMenu = new JMenu("Invoice");
		invoiceMenu.setMnemonic('I');
		invoiceMenu.setVisible(false);
		menuItem = new JMenuItem("New Invoice");
		menuItem.setMnemonic('N');
		menuItem.setActionCommand("New Invoice");
		menuItem.addActionListener(this);
		invoiceMenu.add(menuItem);
		menuItem = new JMenuItem("Open Invoice");
		menuItem.setMnemonic('O');
		menuItem.setActionCommand("Open Invoice");
		menuItem.addActionListener(this);
		invoiceMenu.add(menuItem);
		
		orderMenu = new JMenu("Order");
		orderMenu.setMnemonic('O');
		orderMenu.setVisible(false);
		menuItem = new JMenuItem("New Order");
		menuItem.setMnemonic('N');
		menuItem.setActionCommand("New Order");
		menuItem.addActionListener(this);
		orderMenu.add(menuItem);
		menuItem = new JMenuItem("Open Order");
		menuItem.setMnemonic('O');
		menuItem.setActionCommand("Open Order");
		menuItem.addActionListener(this);
		orderMenu.add(menuItem);
		
		projectMenu = new JMenu("Project");
		projectMenu.setMnemonic('P');
		projectMenu.setVisible(false);
		menuItem = new JMenuItem("New Project");
		menuItem.setMnemonic('N');
		menuItem.setActionCommand("New Project");
		menuItem.addActionListener(this);
		projectMenu.add(menuItem);
		menuItem = new JMenuItem("Open Project");
		menuItem.setMnemonic('O');
		menuItem.setActionCommand("Open Project");
		menuItem.addActionListener(this);
		projectMenu.add(menuItem);
		
		timesheetMenu = new JMenu("Timesheet");
		timesheetMenu.setMnemonic('T');
		timesheetMenu.setVisible(false);
		menuItem = new JMenuItem("New Timesheet");
		menuItem.setMnemonic('N');
		menuItem.setActionCommand("New Timesheet");
		menuItem.addActionListener(this);
		timesheetMenu.add(menuItem);
		menuItem = new JMenuItem("Open Timesheet");
		menuItem.setMnemonic('O');
		menuItem.setActionCommand("Open Timesheet");
		menuItem.addActionListener(this);
		timesheetMenu.add(menuItem);
		
		materialMenu = new JMenu("Material Request");
		materialMenu.setMnemonic('Q');
		materialMenu.setVisible(false);
		menuItem = new JMenuItem("New Material Request");
		menuItem.setMnemonic('N');
		menuItem.setActionCommand("New Material Request");
		menuItem.addActionListener(this);
		materialMenu.add(menuItem);
		menuItem = new JMenuItem("Open Material Request");
		menuItem.setMnemonic('O');
		menuItem.setActionCommand("Open Material Request");
		menuItem.addActionListener(this);
		materialMenu.add(menuItem);
		
		employeeMenu = new JMenu("Employee");
		employeeMenu.setMnemonic('E');
		employeeMenu.setVisible(false);
		menuItem = new JMenuItem("New Employee");
		menuItem.setMnemonic('N');
		menuItem.setActionCommand("New Employee");
		menuItem.addActionListener(this);
		employeeMenu.add(menuItem);
		menuItem = new JMenuItem("Open Employee");
		menuItem.setMnemonic('O');
		menuItem.setActionCommand("Open Employee");
		menuItem.addActionListener(this);
		employeeMenu.add(menuItem);
		
		costMenu = new JMenu("Cost Control");
		costMenu.setMnemonic('C');
		costMenu.setEnabled(false);
		costMenu.setVisible(true);
		
		stockMenu = new JMenu("Stock Control");
		stockMenu.setMnemonic('S');
		stockMenu.setEnabled(false);
		stockMenu.setVisible(true);
		
		clientMenu = new JMenu("Clients");
		clientMenu.setMnemonic('L');
		clientMenu.setEnabled(false);
		clientMenu.setVisible(true);
		
		supplierMenu = new JMenu("Supplier");
		supplierMenu.setMnemonic('U');
		supplierMenu.setEnabled(false);
		supplierMenu.setVisible(true);
		
		maintenanceMenu = new JMenu("Maintenance");
		maintenanceMenu.setMnemonic('N');
		maintenanceMenu.setEnabled(false);
		maintenanceMenu.setVisible(true);
		
		reportMenu = new JMenu("Reports");
		reportMenu.setMnemonic('R');
		reportMenu.setEnabled(false);
		reportMenu.setVisible(true);
		
		modeMenu = new JMenu("Mode");
		modeMenu.setMnemonic('M');
		menuItemInvoice = new JMenuItem("Invoice");
		menuItemInvoice.setMnemonic('I');
		menuItemInvoice.setActionCommand("Invoice Mode");
		menuItemInvoice.addActionListener(this);
		modeMenu.add(menuItemInvoice);
		menuItemOrder = new JMenuItem("Order");
		menuItemOrder.setMnemonic('O');
		menuItemOrder.setActionCommand("Order Mode");
		menuItemOrder.addActionListener(this);
		modeMenu.add(menuItemOrder);
		menuItemProject = new JMenuItem("Project");
		menuItemProject.setMnemonic('P');
		menuItemProject.setActionCommand("Project Mode");
		menuItemProject.addActionListener(this);
		modeMenu.add(menuItemProject);
		menuItemTimesheet = new JMenuItem("Timesheet");
		menuItemTimesheet.setMnemonic('T');
		menuItemTimesheet.setActionCommand("Timesheet Mode");
		menuItemTimesheet.addActionListener(this);
		modeMenu.add(menuItemTimesheet);
		menuItemMaterial = new JMenuItem("Material Request");
		menuItemMaterial.setMnemonic('Q');
		menuItemMaterial.setActionCommand("Material Request Mode");
		menuItemMaterial.addActionListener(this);
		modeMenu.add(menuItemMaterial);
		menuItemEmployee = new JMenuItem("Employee");
		menuItemEmployee.setMnemonic('E');
		menuItemEmployee.setActionCommand("Employee Mode");
		menuItemEmployee.addActionListener(this);
		menuItemEmployee.setEnabled(false);
		modeMenu.add(menuItemEmployee);
		
		helpMenu = new JMenu("Help");
		helpMenu.setMnemonic('H');
		menuItem = new JMenuItem("About");
		menuItem.setMnemonic('A');
		menuItem.setActionCommand("About");
		menuItem.addActionListener(this);
		helpMenu.add(menuItem);
		
		menuBar = new JMenuBar();
		menuBar.add(fileMenu);
		menuBar.add(invoiceMenu);
		menuBar.add(orderMenu);
		menuBar.add(projectMenu);
		menuBar.add(timesheetMenu);
		menuBar.add(materialMenu);
		menuBar.add(employeeMenu);
		menuBar.add(costMenu);
		menuBar.add(stockMenu);
		menuBar.add(clientMenu);
		menuBar.add(supplierMenu);
		menuBar.add(maintenanceMenu);
		menuBar.add(reportMenu);
		menuBar.add(modeMenu);
		menuBar.add(helpMenu);
		setJMenuBar(menuBar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("About")) {
			new AboutWindow("About!").setVisible(true);
		} else if (e.getActionCommand().equals("Connect db")) {
			System.out.println("Open connection to databases");
			fileMenuConnect.setVisible(false);
			fileMenuReconnect.setVisible(true);
			fileMenuDisconnect.setEnabled(true);
		} else if (e.getActionCommand().equals("Reconnect db")) {
			System.out.println("Reconnects to databases");
		} else if (e.getActionCommand().equals("Disconnect db")) {
			System.out.println("Disconnects databases");
			fileMenuReconnect.setVisible(false);
			fileMenuConnect.setVisible(true);
			fileMenuDisconnect.setEnabled(false);
		} else if (e.getActionCommand().equals("Log in")) {
			System.out.println("Logging in");
		} else if (e.getActionCommand().equals("Exit")) {
			System.exit(0); // closing down the program
		} else if (e.getActionCommand().equals("Project Mode")) {
			unsetActiveMode();
			projectMenu.setVisible(true);
			setActiveMode("Project");
			menuItemProject.setEnabled(false);
		} else if (e.getActionCommand().equals("Invoice Mode")) {
			unsetActiveMode();
			invoiceMenu.setVisible(true);
			setActiveMode("Invoice");
			menuItemInvoice.setEnabled(false);
		} else if (e.getActionCommand().equals("Order Mode")) {
			unsetActiveMode();
			orderMenu.setVisible(true);
			setActiveMode("Order");
			menuItemOrder.setEnabled(false);
		} else if (e.getActionCommand().equals("Timesheet Mode")) {
			unsetActiveMode();
			timesheetMenu.setVisible(true);
			setActiveMode("Timesheet");
			menuItemTimesheet.setEnabled(false);
		} else if (e.getActionCommand().equals("Material Request Mode")) {
			unsetActiveMode();
			materialMenu.setVisible(true);
			setActiveMode("Material");
			menuItemMaterial.setEnabled(false);
		} else {
			System.out.println("\"" + e.getActionCommand() + "\" not defined in ui.MainWindow.actionPerformed(ActionEvent e)");
		}
	}
	
	public void setActiveMode(String ActiveMode) {
		activeMode = ActiveMode;
	}
	public void unsetActiveMode() {
		if (activeMode == null) return;
		switch (activeMode) {
			case "Project":
				projectMenu.setVisible(false);
				menuItemProject.setEnabled(true);
				break;
			case "Invoice":
				invoiceMenu.setVisible(false);
				menuItemInvoice.setEnabled(true);
				break;
			case "Order":
				orderMenu.setVisible(false);
				menuItemOrder.setEnabled(true);
				break;
			case "Timesheet":
				timesheetMenu.setVisible(false);
				menuItemTimesheet.setEnabled(true);
				break;
			case "Material":
				materialMenu.setVisible(false);
				menuItemMaterial.setEnabled(true);
				break;
			default:
				System.out.println("Unset Handler not defined for activeMode=" + activeMode);
		}
		activeMode = null;
	}
	public String getActiveMode() {
		return activeMode;
	}
	public Core getCoreObject() {
		return coreO;
	}
	public String getCoreVersion() {
		return coreO.getVersion();
	}
}
