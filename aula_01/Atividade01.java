import java.util.Random;

public class Atividade01{
    public static void main(String[] args) {
        int vetor[] = new int[1000000];
        Random ran = new Random();

        
        for(int i = 0; i<vetor.length; i++){
            vetor[i] = ran.nextInt(10);
        }


        long startTime = System.nanoTime(); 

        for(int i = 0; i<vetor.length; i++){
            for(int j=0; j<vetor.length;j++){
                if(vetor[i]< vetor[j]){
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor [j]= aux;
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime); // Tempo em nanossegundos

        System.out.println("Tempo: " + (duration / 1000000.0) + " ms");
    }
}

// Tempo  com 10 valores: 0.0033 ms
// Tempo  com 100 valores: 0.141 ms
// Tempo  com 1000 valores: 4.6038 ms
// Tempo  com 10000 valores: 86.6439 ms
// Tempo  com 100000 valores: 8490.6308 ms
// Tempo  com 1000000 valores: 21477.478 ms