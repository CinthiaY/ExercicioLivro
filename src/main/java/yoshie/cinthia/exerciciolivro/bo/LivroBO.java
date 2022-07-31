package yoshie.cinthia.exerciciolivro.bo;

import yoshie.cinthia.exerciciolivro.dao.LivroDAO;
import yoshie.cinthia.exerciciolivro.model.Livro;

import java.util.List;
import java.util.Objects;

public class LivroBO {
    private LivroDAO livroDAO;

    public LivroBO(){
        livroDAO = new LivroDAO();
    }

    public Livro save(Livro livro) {
        valida(livro);
        return livroDAO.save(livro);
    }

    private void valida(Livro livro) {
        if(Objects.isNull(livro.getNome())){
            throw new IllegalArgumentException("Nome inválido");
            
        }
    }

    public List<Livro> findAll() {
        return livroDAO.findAll();
    }

}
