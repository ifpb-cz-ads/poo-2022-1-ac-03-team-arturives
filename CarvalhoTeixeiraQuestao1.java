import java.util.Scanner;

class CarvalhoTeixeiraQuestao1 {
    public static void main(String[] args) {
        /* 
        Faca um programa que dara a idade de uma pessoa verifique sua classe eleitoral.
        
        - menor que 16 anos nao pode votar
        - com 16 ou 17 anos ou mais que 65 anos, votar eh facultativo
        - entre 18 e 65 anos (inclusive), votar eh obrigatorio
        */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe sua idade: ");
        int idade = input.nextInt();
        
        if (idade < 16) {
            System.out.println("Nao pode votar.");
        } else if (idade <= 17 || idade > 65) {
            System.out.println("Votar eh facultativo.");
        } else {
            System.out.println("Votar eh obrigatorio.");
        }
    }
}
