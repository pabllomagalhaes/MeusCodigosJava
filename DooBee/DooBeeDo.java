public class DooBeeDo { //classe
    public static void main(String[] args) { //método
        int x = 1; //Declaracao de variável.
        while (x < 3){ // enquanto x for menor que 3, o loop acontece
            System.out.print("Doo"); //e mostra "Doo", "Bee"
            System.out.print("Bee");
            x = x + 1; //variável de controle de loop.
        }
        if (x == 3){ //quando x for igual a 3, mostra "Do"
            System.out.print("Do");
        }
    }
}
