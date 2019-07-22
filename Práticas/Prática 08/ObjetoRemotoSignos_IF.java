import java.rmi.*;

public interface ObjetoRemotoSignos_IF  extends Remote {
    String getMensagemSigno(String umSigno)throws RemoteException;
}