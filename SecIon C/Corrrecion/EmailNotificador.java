package Corrrecion;

public class EmailNotificador implements Notificador {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}