package yoshie.cinthia.exerciciolivro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data //cria getters e setters de cada atributo, equals, hashCode e toString
//@AllArgsConstructor //cria construtor com todos os atributos
public class Livro {
    private long id;
    private String nome;
    private String autor;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }
}
