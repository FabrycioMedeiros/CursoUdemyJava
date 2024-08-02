package fundamentosJava.operadores;

public class Atribuicao {
    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        //Atribuição Aditiva
        c += b; //c = c + b;
        //Atribuição Subtrativa
        c -= b; //c = c - b;
        //Atribuição Multiplicativa
        c *= b; //c = c * b;
        //Atribuição Divisiva
        c /= b; //c = c / b;
        //Atribuição Modulativa
        c %= 2; //c = c % b; resultado 0 ou 1
    }
}
