public class Email implements Notificacao {

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " via Email");
    }
}
