public class SMS implements Notificacao{

    @Override
    public void sendMessage(String message) {
        System.out.println(message + "via SMS");
    }
}
