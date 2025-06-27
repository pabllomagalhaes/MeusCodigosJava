public class CalculadoraMedia {
    public static void main(String[] args){ //Início do método
    
//Notas do aluno.

double nota1 = 7.5;
double nota2 = 8.0;
double nota3 = 6.0;
double media = (nota1 + nota2 + nota3) / 3; // soma as notas e tira a média. 03 notas.

//Cálculo da média.
System.out.println("A média é" + media); //Exibe a média na tela.

if (media >= 7.0) {
System.out.println("Aluno aprovado!"); //Se o aluno tirou mais que media 7, ele é aprovado.
}
else {
System.out.println("Aluno reprovado!"); //Caso contrário, ele é reprovado.
    }
} //Fim do método

} //Fim da classe