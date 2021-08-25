package br.inatel.cdg;

public class Principal {

    public static void main(String[] args) {

        String teste = "Aee A";
        String test2 = teste.replaceAll("\\s+", "");
        System.out.println(test2);
    }

}
