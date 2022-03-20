import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String rubai = "Без хмеля и улыбок – что за жизнь?\n" +
                "\n" +
                "Без сладких звуков флейты – что за жизнь?\n" +
                "\n" +
                "Все, что на солнце видишь, – стоит мало.\n" +
                "\n" +
                "Но на пиру в огнях светла и жизнь!";


        String rubai2 = "Один припев у Мудрости моей:\n" +
                "\n" +
                "«Жизнь коротка, – так дай же волю ей!\n" +
                "\n" +
                "Умно бывает подстригать деревья,\n" +
                "\n" +
                "Но обкорнать себя – куда глупей!»";

        FileWriter writer = null;
        try {
            writer = new FileWriter("/Users/andrejosadcuk/Desktop/file.txt", true);
//            for(int i = 0; i < rubai.length(); i++ ){
//                writer.write(rubai.charAt(i));
//            }
            writer.write(rubai);
            writer.write(rubai2);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
