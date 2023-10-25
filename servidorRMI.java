import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class servidorRMI{
  public static void main(String[] args) throws Exception
  {
    String url = "rmi://127.0.0.1/prueba";
    ClaseRMI obj = new ClaseRMI();

    // registra la instancia en el rmiregistry
    Naming.rebind(url,obj);
  }
}
