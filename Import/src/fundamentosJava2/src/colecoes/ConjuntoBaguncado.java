package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"}) //Utilizado para retirar valores de warning
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double(vai converter o primitivo em uma classe)
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        //conjunto.size conta o numero de unidades dentro do array
        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.add("teste"); //será computado pois a string é diferente
        conjunto.add('x'); //NÃO será computado pois não computa valores iguais

        System.out.println("Tamanho é: " + conjunto.size());

        //conjunto.remove retira o valor solicitado do array
        System.out.println(conjunto.remove("teste")); //true
        System.out.println(conjunto.remove("casa"));  // false - não remove valores que não existem no array

        System.out.println("Tamanho é: " + conjunto.size());

        //conjunto.contains verifica se existe o parametro dentro do array - retorna true ou false
        System.out.println(conjunto.contains("teste")); //False pois já foi excluido anteriormente
        System.out.println(conjunto.contains('x')); //True pois se encontra dentro do array de armazenamento


        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); //União dos arrays
        conjunto.retainAll(nums); //Interseção dos array, só aparecerá valores em comuns aos dois
        System.out.println(conjunto);

        conjunto.clear(); //Limpa o array
        System.out.println(conjunto);

    }
}
