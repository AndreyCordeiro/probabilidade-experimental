import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;

        //feita uma iteração para que seja feito 25 experimentos
        for (int i = 0; i < 25; i++) {
            //definido o intervalo de números que serão randomizados (1 a 6)
            int menor = 1;
            int maior = 6;

            //randomizado 3 número para a preencher a matriz
            int numero1 = random.nextInt(maior - menor) + menor;
            int numero2 = random.nextInt(maior - menor) + menor;
            int numero3 = random.nextInt(maior - menor) + menor;

            //soma dos 3 números randomizados
            int soma = numero1 + numero2 + numero3;
            System.out.println("[" + numero1 + "]" + "[" + numero2 + "]" + "[" + numero3 + "] = " + soma);

            //verifica se a soma dos números randomizados é maior ou igual a 10 e adiciona em um contador
            if (soma >= 10) {
                count += 1;
            }
        }
        //realiza o cálculo da Probabilidade Experimental
        double probabilidadeExperimental = (double) count / 25;

        System.out.println("Número de elementos maior ou igual a 10: " + count);
        System.out.println("Probabilidade Experimental: " + probabilidadeExperimental);
    }
}


