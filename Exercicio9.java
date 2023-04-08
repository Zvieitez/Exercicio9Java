package Aula03;
/*Exercício9
Escreva um programa que:
- Receba um número entre 1 a 12;
- Mostre o mês na tela;
Ex: 12 – Dezembro
Se o valor não estiver entre 1 e 12 deve mostrar uma
mensagem de erro;*/

public class Exercicio9 {
    public static void main(String[] args) {

        int Meses = 1;

        switch (Meses) {
            case (1):
                System.out.println("Janeiro");
                break;
            case (2):
                System.out.println("Fevereiro");
                break;
            case (3):
                System.out.println("Março");
                break;
            case (4):
                System.out.println("Abril");
                break;
            case (5):
                System.out.println("Maio");
                break;
            case (6):
                System.out.println("Junho");
                break;
            case (7):
                System.out.println("Julho");
                break;
            case (8):
                System.out.println("Agosto");
                break;
            case (9):
                System.out.println("Setembro");
                break;
            case (10):
                System.out.println("Outubro");
                break;
            case (11):
                System.out.println("Novembro");
                break;
            case (12):
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Erro");
                System.out.println("Tente novamente");

        }
    }
}