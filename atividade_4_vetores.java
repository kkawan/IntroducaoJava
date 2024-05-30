import java.util.Scanner;

public class atividade_4_vetores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (n <= 1) {
            System.out.println("Digite um tamanho para o vetor (maior que 1):");
            n = sc.nextInt();
            if (n <= 1) {
                System.out.println("O valor deve ser maior que 1. Tente novamente.");
            }
        }



        int[] vetor = new int[n];
        int soma = 0, media = 0, maior = 0, menor = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Escreva o "+i+"° valor:");
            vetor[i] = sc.nextInt();
            soma+=vetor[i];
            if(i==0){
                menor = vetor[i];
                maior = vetor[i];
                continue;
            }

            if(vetor[i]<menor){
                menor = vetor[i];
            }
            if(vetor[i]>maior){
                maior = vetor[i];
            }


        }
        media = soma/n;





        System.out.println("a média é:" + media);
        System.out.println("a soma é:" + soma);
        System.out.println("o maior número é:" + maior);
        System.out.println("o menor número é:" + menor);



        vetor[0] = 3040;
        vetor[1] = 34934;
        soma = 0;
        for(int i=0; i<n; i++){
            soma+= vetor[i];
        }
        media = soma/n;
        System.out.println("Após a modificação:");
        System.out.println("A nova média é: " + media);
        System.out.println("A nova soma é: " + soma);
    }








}
