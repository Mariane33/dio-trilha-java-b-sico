package edu.mariane.segundasemana;
public class MinhaClasse {
    
public static void main(String[] args) {
   
    String primeiroNome = "Mariane";
    String segundoNome = "Santos";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}
