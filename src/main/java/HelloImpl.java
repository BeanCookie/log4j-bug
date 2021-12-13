import java.rmi.RemoteException;

public class HelloImpl implements Hello{
    @Override
    public String sayHello() throws RemoteException {
        System.out.println("hello");
        return "Hello, World";
    }
}
