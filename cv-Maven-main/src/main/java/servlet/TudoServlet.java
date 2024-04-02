package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cv")
public class TudoServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        // System.out.println("Requisição recebida em TudoServlet");

        req.setAttribute("title", "Bruno de Oliveira Bezerra");
        req.setAttribute("h11", "Bruno de Oliveira Bezerra");
        req.setAttribute("subtitulo", "Estudante de Análise e Desenvolvimento de Sistemas");
        req.setAttribute("contato2", "tatedy4@gmail.com");
        req.setAttribute("contato3", "linkedin.com/in/brunooli");
        req.setAttribute("contato4", "github.com/bruninhovamp");

        req.setAttribute("h12", "Resumo");
        req.setAttribute("resumo", "Atualmente trabalho como DBA mas tenho experiencias com SAP ABAP, Netweaver e noção em Sistemas operacionais.");

        req.setAttribute("h13", "Formação Acadêmica");
        req.setAttribute("formacao1", "Tecnólogo em Análise e Desenvolvimento de Sistemas");
        req.setAttribute("formacao2", "Centro Universitário Senac (Cursando)");

        req.setAttribute("h14", "Certificações");
        req.setAttribute("certificacao1", "Oracle database foundations");

        req.setAttribute("h15", "Habilidades");
        req.setAttribute("habilidade1", "Banco de dados, Oracle, SQL Server, DB2 e MySQL:");
        req.setAttribute("habilidade2", "Redes");
        req.setAttribute("habilidade3", "SAP ABAP");

        req.setAttribute("h17", "Projetos");
        req.setAttribute("projeto1", "Você pode encontrar alguns dos meus projetos no GitHub, acessando o meu perfil em: <a href=\"https://github.com/bruninhovamp\">https://github.com/bruninhovamp</a>. Lá, você poderá conferir exemplos do meu trabalho e habilidades em ação.");

        req.getRequestDispatcher("cv.jsp").forward(req, resp);
    }
}
