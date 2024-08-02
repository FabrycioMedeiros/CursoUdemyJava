package classe;

import java.util.Objects;

public class Usuario2 {
    //para criação de Hashcode por meio do próprio Intellij

    String nome;
    String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario2 usuario2)) return false;
        return Objects.equals(nome, usuario2.nome) && Objects.equals(email, usuario2.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
