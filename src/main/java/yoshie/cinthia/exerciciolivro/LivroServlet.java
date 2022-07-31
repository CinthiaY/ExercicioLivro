package yoshie.cinthia.exerciciolivro;

import yoshie.cinthia.exerciciolivro.bo.LivroBO;
import yoshie.cinthia.exerciciolivro.model.Livro;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/livro-servlet") //value é o mapeamento que ia lá no xml
public class LivroServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);  esse vem por default, deletar
        //PrintWriter writer = resp.getWriter(); //escrever "resp.getWriter()", dar alt+enter sobre o metodo
                                                // e "introduce local variable" -> writer

        String nome = req.getParameter("nome");
        String autor = req.getParameter("autor");
        System.out.println("GET".concat(nome).concat(" ").concat(autor));


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        String nome = req.getParameter("nome");
        String autor = req.getParameter("autor");
        System.out.println("POST ".concat(nome).concat(" ").concat(autor));

        LivroBO businessObject = new LivroBO();
        Livro livro = new Livro(nome, autor);
        businessObject.save(livro);
        Livro livroSalvo = businessObject.save(livro);

        req.setAttribute("idLivroSalvo", livroSalvo.getId());

        RequestDispatcher dispatcher = req.getRequestDispatcher("sucesso-cadastro.jsp");
        dispatcher.forward(req, resp);

    }

}
