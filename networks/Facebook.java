package networks;

public class Facebook extends Network{
     public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public boolean logIn(String userName, String password) {
        System.out.println("\nChecando informações do usuário.");
        System.out.println("Nome: " + this.userName);
        System.out.print("Senha: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogin feito com sucesso!");
        return true;
    }

    @Override 
    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Mensagem: '" + new String(data) + "' foi postada no Facebook.");
            return true;
        } else {
            return false;
        }
    }

    @Override 
    public void logOut() {
        System.out.println("Usuário: '" + userName + "' deslogou do Facebook.");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
