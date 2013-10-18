package ui;

import java.awt.event.*;
import javax.swing.*;
import core.Actions;

/**
 * 
 * @author Aun Johnsen
 * 
 */
public class ButtonFrame extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JToolBar buttonsLine = new JToolBar();
	private JButton buttonAdminMode;
	private JButton buttonForceReplicate;
	private JButton buttonNewClient;
	private JButton buttonNewEmployee;
	private JButton buttonNewSupplier;
	private JButton buttonNewProduct;
	private JButton buttonNewProject;
	private JButton buttonNewService;
	private JButton buttonNewOrder;
	private JButton buttonNewInvoice;
	private JButton buttonNewTimesheet;
	private JButton buttonNewTravelExpenses;
	private JButton buttonNewComponent;
	private JButton buttonNewMaintenanceTask;
	/**
	 * 	Create a button panel for the top of the page
	 */
	public ButtonFrame() {
		Icon icon;
		
		icon = new ImageIcon("gfx/buttons/AdminMode.png");
		buttonAdminMode = new JButton(icon);
		buttonAdminMode.addActionListener(this);
		buttonsLine.add(buttonAdminMode);
		
		icon = new ImageIcon("gfx/buttons/ForceReplicate.png");
		buttonForceReplicate = new JButton(icon);
		buttonForceReplicate.addActionListener(this);
		buttonsLine.add(buttonForceReplicate);
		
		icon = new ImageIcon("gfx/buttons/NewClient.png");
		buttonNewClient = new JButton(icon);
		buttonNewClient.addActionListener(this);
		buttonsLine.add(buttonNewClient);
		
		icon = new ImageIcon("gfx/buttons/NewEmployee.png");
		buttonNewEmployee = new JButton(icon);
		buttonNewEmployee.addActionListener(this);
		buttonsLine.add(buttonNewEmployee);
		
		icon = new ImageIcon("gfx/buttons/NewSupplier.png");
		buttonNewSupplier = new JButton(icon);
		buttonNewSupplier.addActionListener(this);
		buttonsLine.add(buttonNewSupplier);
		
		icon = new ImageIcon("gfx/buttons/NewProduct.png");
		buttonNewProduct = new JButton(icon);
		buttonNewProduct.addActionListener(this);
		buttonsLine.add(buttonNewProduct);
		
		icon = new ImageIcon("gfx/buttons/NewProject.png");
		buttonNewProject = new JButton(icon);
		buttonNewProject.addActionListener(this);
		buttonsLine.add(buttonNewProject);
		
		icon = new ImageIcon("gfx/buttons/NewService.png");
		buttonNewService = new JButton(icon);
		buttonNewService.addActionListener(this);
		buttonsLine.add(buttonNewService);
		
		icon = new ImageIcon("gfx/buttons/NewOrder.png");
		buttonNewOrder = new JButton(icon);
		buttonNewOrder.addActionListener(this);
		buttonsLine.add(buttonNewOrder);
		
		icon = new ImageIcon("gfx/buttons/NewInvoice.png");
		buttonNewInvoice = new JButton(icon);
		buttonNewInvoice.addActionListener(this);
		buttonsLine.add(buttonNewInvoice);
		
		icon = new ImageIcon("gfx/buttons/NewTimesheet.png");
		buttonNewTimesheet = new JButton(icon);
		buttonNewTimesheet.addActionListener(this);
		buttonsLine.add(buttonNewTimesheet);
		
		icon = new ImageIcon("gfx/buttons/NewTravelExpenses.png");
		buttonNewTravelExpenses = new JButton(icon);
		buttonNewTravelExpenses.addActionListener(this);
		buttonsLine.add(buttonNewTravelExpenses);
		
		icon = new ImageIcon("gfx/buttons/NewComponent.png");
		buttonNewComponent = new JButton(icon);
		buttonNewComponent.addActionListener(this);
		buttonsLine.add(buttonNewComponent);
		
		icon = new ImageIcon("gfx/buttons/NewMaintenanceTask.png");
		buttonNewMaintenanceTask = new JButton(icon);
		buttonNewMaintenanceTask.addActionListener(this);
		buttonsLine.add(buttonNewMaintenanceTask);
		
		add(buttonsLine);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		
		if (source == buttonAdminMode) System.out.println("Toggle Admin Mode");
		else if (source == buttonForceReplicate) System.out.println("Force Replication");
		else if (source == buttonNewClient) System.out.println("New Client Dialog");
		else if (source == buttonNewEmployee) System.out.println("New Employee Dialog");
		else if (source == buttonNewSupplier) System.out.println("New Supplier Dialog");
		else if (source == buttonNewProduct) System.out.println("New Product Dialog");
		else if (source == buttonNewProject) System.out.println("New Project Dialog");
		else if (source == buttonNewService) System.out.println("New Service Dialog");
		else if (source == buttonNewOrder) System.out.println("New Order Dialog");
		else if (source == buttonNewInvoice) System.out.println("New Invoice Dialog");
		else if (source == buttonNewTimesheet) System.out.println("New Timesheet Dialog");
		else if (source == buttonNewTravelExpenses) System.out.println("New Travel Expenses Dialog");
		else if (source == buttonNewComponent) System.out.println("New Component Dialog");
		else if (source == buttonNewMaintenanceTask) System.out.println("New Maintenance Task Dialog");
		else System.out.println("Error in ui.ButtonFrame: source not matched.");
	}
}
