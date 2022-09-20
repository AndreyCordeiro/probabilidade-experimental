import java.util.Random;

public class Main {
    public static void main(String[] args) {
        probabilidadeExperimental();
        probabilidadeExata();
    }

    private static void probabilidadeExperimental() {
        Random random = new Random();
        int count = 0;

        //feita uma iteração para que seja feito 25 experimentos
        for (int i = 0; i < 25; i++) {
            //definido o intervalo de números que serão randomizados (1 a 6)
            int menor = 1;
            int maior = 7;

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

    private static void probabilidadeExata() {
        int count;
        double countResult = 0;

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                //soma os valores de i e j e os adiciona na variável "count"
                for (int k = 1; k < 7; k++) {
                    //soma o valor de k com os valores somados anteriormente e adiciona o novo valor na variável "count"
                    count = i + j + k;
                    System.out.println("[" + i + "]" + "[" + j + "]" + "[" + k + "] = " + count);
                    //caso o valor de count seja maior ou igual a 10, soma-se 1 na variável "countResult"
                    if (count >= 10) {
                        countResult++;
                    }
                }
            }
        }
        System.out.println("Números maior ou igual a 10: " + countResult);
        //realiza o cálculo do valor da probabilidade total
        double valorTotal = countResult / 216;
        System.out.println("Valor da probabilidade total = " + valorTotal);
    }
}


