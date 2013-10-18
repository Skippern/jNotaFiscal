/**
 * @author Aun Johnsen
 * 
 */
package rmi;

import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;

public class Server {
	NetworkInterface iFace;
	
	public Server() {
		try {
			LocateRegistry.getRegistry();
			LocateRegistry.createRegistry(1099);
		} catch (RemoteException e) {
			System.out.println(e);
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}