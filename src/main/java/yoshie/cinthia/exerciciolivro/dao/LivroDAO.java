package yoshie.cinthia.exerciciolivro.dao;

import yoshie.cinthia.exerciciolivro.model.Livro;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
    //Data Access Object
    private static List<Livro> bancoLivros = new ArrayList<>();
    private static long countLivro;

    public Livro save(Livro livro) {
        livro.setId(countLivro);
        bancoLivros.add(livro);
        return livro;
    }

    public List<Livro> findAll() {
        return bancoLivros;
    }
}
