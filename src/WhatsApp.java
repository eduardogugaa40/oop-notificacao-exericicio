public class WhatsApp implements Notificacao{

    @Override
    public void sendMessage(String message) {
        System.out.println(message + "via WhatsApp");
    }
}
