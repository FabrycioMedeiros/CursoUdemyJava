package classe;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object objeto) {

//        Usuario outro = (Usuario) objeto;

        //boolean nomeIgual = outro.nome == this.nome; ESTA forma não é uma BOA PRÁTICA de uso!
//        boolean nomeIgual = outro.nome.equals(this.nome);
//        boolean emailIgual = outro.email.equals(this.email);
//
//                return nomeIgual && emailIgual;
        //Após implementação do equals as alternativas de EqualsHashcode validam em true.

        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else{
            return false;
        }

    }

    public int hashCode() {
        return this.nome.length();
    }
}
//para serem utilizados pela classe EqualsHashcode!!!
// O Hashcode será abordado em outra aula!!!

