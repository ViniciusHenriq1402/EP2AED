package EP2AED.pilha1;

import java.io.File;

public class main {
    public static void main(String[] args) {
        System.out.println("Inicio programa - Pilha Ingenua2");
        
        
        File folder = new File(args[0]);
        processa listFiles = new processa();
        listFiles.carrega(folder);
        System.out.println("Log criado com sucesso!");
    }
}