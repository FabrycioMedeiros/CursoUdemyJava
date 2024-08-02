package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> listaAprovados =  new HashSet<>(); //<> operador diamond, utilizará o valor do primeiro utilizado
        SortedSet<String> listaAprovados =  new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for( String candidato: listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums =  new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(123);
        nums.add(6);

        for( int n: nums) {
            System.out.println(n);
        }
    }
}

//Neste exemplo utilizamos dados homogeneos
//HashSet não garante a ordem de inserção, mas garante a unicidade dos valores
//TreeSet garante a ordem de inserção, mas não garante a unicidade dos valores
//SortedSet garante a ordem de inserção e a unicidade dos valores
//unicidade é garantida pelo equals e hashcode