package CalculadoraIdade;
public class CalculadoraIdade {
    public static void main(String[] args) { // Correção aqui, deve ser String[]
        int anoAtual = 2025;
        int anoNascimento = 1996;
        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é: " + idade + " anos.");
    }
}