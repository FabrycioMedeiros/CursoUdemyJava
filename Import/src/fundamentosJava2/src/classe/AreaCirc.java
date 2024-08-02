package classe;

public class AreaCirc {
    double raio;
    //final é modificador para definir constantes
    //static é quando o valor esta associado diretamente a classe e não as instâncias
    static final double PI = 3.1415;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
