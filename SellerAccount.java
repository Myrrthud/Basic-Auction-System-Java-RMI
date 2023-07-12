/*
 DISTRIBUTED SYSTEMS GROUP TWO
 @GROUP TWO
 @ADELAIDE
 @DANIEL
 @ANDY
 @MARY
 @BENJAMIN
 
 Account provides a class for user account creation in the system
 */

import java.rmi.RemoteException;

public class SellerAccount implements SellerInterface {

    private String userID;
    private String name;
    private String password;
    private boolean admin;

    protected SellerAccount() throws RemoteException {
        userID = "";
        name = "";
        password = "";
        admin = false;
    }

    // Get Login ID
    public String getLoginID() throws RemoteException {
        return userID;
    }

    // Get Name
    public String getName() throws RemoteException {
        return name;
    }

    // Get Password
    public String getPassword() throws RemoteException {
        return password;
    }

    // Get Admin
    public boolean getAdmin() throws RemoteException {
        return admin;
    }

    // Set Login ID
    public void setLoginID(String login) throws RemoteException {
        userID = login;
    }

    // Set Name
    public void setName(String n) throws RemoteException {
        name = n;
    }

    // Set Password
    public void setPassword(String pw) throws RemoteException {
        password = pw;
    }

    // Set Admin
    public void setAdmin(boolean a) throws RemoteException {
        admin = a;
    }

    // Receive Message from Server
    public void receiveMessage(String message) throws RemoteException {
        System.out.println(message);
    }
}
