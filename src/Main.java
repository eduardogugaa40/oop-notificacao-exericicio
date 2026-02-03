public class Main {
    public static void main(String[] args) {

        Notificacao email = new Email();
        Notificacao sms = new SMS();
        Notificacao whatsapp = new WhatsApp();

        String message = "Olá Mundo!";

        Notificacao [] dispositivos = {email, sms, whatsapp};

        for (Notificacao dispositivo : dispositivos) {
            dispositivo.sendMessage(message);
        }
    }
}