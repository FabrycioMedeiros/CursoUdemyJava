package classe;

public class Equals {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezemail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@ezemail.com";

        System.out.println(u1 == u2); //false, pois são objetos distintos na memória, ou seja, desta forma o sistema compara endereços de memória!
        System.out.println(u1.equals(u2)); //false, poi o Equals fará a mesma ação do processo de igualdade(==)!
        System.out.println(u2.equals(u1));//false, não importa a ordem dos fatores.

        System.out.println(u1 == u1); //true
        System.out.println(u1.equals(u1)); //true

        //System.out.println(u2.equals(new Date()));

        //EM comparações entre objetos diretamente o HASHCODE não é necessário, pois desta forma conseguimos comparar e ter resultados coerentes, mas quando partimos para outras estruturas tais como Hashcode, hashMap, hashSet, se não implementarmos de forma coerente teremos prblemas.

    }
}
