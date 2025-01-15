public class Cesar {
    public static void main(String[] args) {
        String message = "Bonjour j'aime la purée de patate de pomme de terre";
        String messageChiffre = chiffrer(message, 8);
        System.out.println(messageChiffre);
        String messageDechiffre = dechiffrer(messageChiffre, 8);
        System.out.println(messageDechiffre);
    }

    public static String chiffrer(String message, int decalage) {
        String messageChiffre = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + decalage) % 26);
            } else if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + decalage) % 26);
            }
            messageChiffre += c;
        }
        return messageChiffre;
    }

    public static String dechiffrer(String messageChiffre, int decalage) {
        return chiffrer(messageChiffre, 26 - decalage);
    }
}
