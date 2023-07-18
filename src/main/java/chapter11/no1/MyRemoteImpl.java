package src.main.java.chapter11.no1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    private static final long serialVersionUID = 1L;

    public MyRemoteImpl() throws RemoteException {

    }

    public String sayHello() {
        return "Server says, 'Hey'";
    }
}
