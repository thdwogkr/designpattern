package src.main.java.chapter11.no1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;
}
