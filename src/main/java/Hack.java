import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Hack {
    public static void main(String[] args) {
        try {
            Hello hello = new HelloImpl();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(hello, 5666);
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Hello", stub);
        } catch (AlreadyBoundException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
