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

