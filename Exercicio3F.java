public class Exercicio3F {
    public static int contarCaracter(String texto, char caractere) {
        int contagem = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caractere) {
                contagem++;
            }
        }

        return contagem;
    }

    public static void main(String[] args) {
        String frase = "pneumoultramicroscopicossilicovulcanoconiótico";
        char caractereProcurado = 'a';

        int resultado = contarCaracter(frase, caractereProcurado);
        System.out.println("O caractere '" + caractereProcurado + "' aparece " + resultado + " vezes na string.");
    }
}
