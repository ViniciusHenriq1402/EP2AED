package EP2AED.pilha2;

import java.io.File;

public class main {
    public static void main(String[] args) {
        System.out.println("Inicio programa - Arranjo com capacidade inicial 8");
        
        
        File folder = new File(args[0]);
        processa listFiles = new processa();
        listFiles.carrega(folder);
        System.out.println("Log criado com sucesso!");
    }
}