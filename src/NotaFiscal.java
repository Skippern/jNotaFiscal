import ui.MainWindow;
import core.*;
/**
 * @author Aun Johnsen<br>
 * Project: Nota Fiscal<br>
 * File: NotaFiscal.java<br>
 * <p>
 * This is the main startup function for the Nota Fiscal program
 * <p>
 * This is the only class to call main() - this should in turn start
 * all the services we want, and open the main interface
 * <p>
 * TODO: Master object that calls back here for important data, such 
 * as logged in user, and version number
 * <p>
 * class NotaFiscal
 * <p>
 * The main background object, connects to internal the HSQLDB/SQLite 
 * database, with replication to a central database
 */
public class NotaFiscal {
	public String NFVersion = "Pre-Alpha-0.0.0";
	public static Core coreO;
	
	public static void main(String[] args) {
		coreO = new Core();
		// This class should be called on startup
		//
		new MainWindow("Notas Fiscais", coreO).setVisible(true);
	}
	/*
	public String getVersion() {
		return coreO.getVersion();
	}
	public Core getCore() {
		return coreO;
	}
	*/
}