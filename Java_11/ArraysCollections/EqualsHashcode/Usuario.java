package Curso.ArraysCollections.EqualsHashcode;

public class Usuario {
    String nome;
    String email;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    // Definir o parametro para comparar os objetos
    public boolean equals(Object objeto) {

        if(objeto instanceof Usuario){ // Comparar se 'objeto' e uma instancia do 'Usuario'
            
            Usuario outro = (Usuario) objeto; // Converteu objeto generico 'Object' para 'Usuario'
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            
            return nomeIgual && emailIgual; // Os criterios de igualdade

        } else {
            return false;
        }
        
        // O Hastcode será abordado em outra aula!
    }
}
