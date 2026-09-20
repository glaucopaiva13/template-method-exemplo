import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import networks.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Insira nome de usuário: ");
        String userName = reader.readLine();
        System.out.print("Insira senha: ");
        String password = reader.readLine();

        System.out.print("Insira mensagem: ");
        String message = reader.readLine();

        System.out.println("\nEscolha uma rede social para postar a mensagem.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
