import java.util.Random;

public class Atividade01 {
    
    public static void aux(int[] vetor) {
        long startTime = System.nanoTime();
        
        int n = vetor.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int tempo = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = tempo;
                }
            }
        }
        
        long endTime = System.nanoTime();
        long duracao = (endTime - startTime);
        
        System.out.println("Tempo: " + (duracao / 1000000.0) + " ms");
    }
    
    public static void preencherVetor(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10000);
        }
    }
    public static void main(String[] args) {
        int[] tamanhos = {10, 100, 10000, 100000, 1000000};
        
        for (int tamanho : tamanhos) {
            System.out.println( tamanho + " elementos:");
            int[] vetor = new int[tamanho];
            preencherVetor(vetor);
            aux(vetor);
        }
    }
}
