/*
 DISTRIBUTED SYSTEMS GROUP TWO
 @GROUP TWO
 @ADELAIDE
 @DANIEL
 @ANDY
 @MARY
 @BENJAMIN
 AccountInterface provides method prototypes for Account
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BuyerInterface extends Remote {


    // Get Login ID
    public String getLoginID() throws RemoteException;
    
    // Get name
    public String getName() throws RemoteException;

    // Get Password
    public String getMobileNum() throws RemoteException;

    // Get Admin
    public boolean getAdmin() throws RemoteException;

    // Set buyer Login ID
    public void setLoginID(String login) throws RemoteException;

    // Set Name
    public void setName(String name) throws RemoteException;

    // Set Password
    public void setMobileNum(String mn) throws RemoteException;

    // Set Admin
    public void setAdmin(boolean a) throws RemoteException;

    // Receive Message
    public void receiveMessage(String message) throws RemoteException;
}
