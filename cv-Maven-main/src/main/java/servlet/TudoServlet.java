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

        req.setAttribute("title", "Willian de Almeida Oliveira");
        req.setAttribute("h11", "Willian de Almeida Oliveira");
        req.setAttribute("subtitulo", "Estudante de Análise e Desenvolvimento de Sistemas");
        req.setAttribute("contato2", "wlln.almeida.oliveira@gmail.com");
        req.setAttribute("contato3", "linkedin.com/in/wllnao");
        req.setAttribute("contato4", "github.com/wlln148");

        req.setAttribute("h12", "Resumo");
        req.setAttribute("resumo", "Estudante de ADS no Senac SP, Trabalhando não registrado em comércio.");

        req.setAttribute("h13", "Formação Acadêmica");
        req.setAttribute("formacao1", "Tecnólogo em Análise e Desenvolvimento de Sistemas");
        req.setAttribute("formacao2", "Centro Universitário Senac (Cursando)");

        req.setAttribute("formacao3", "Bacharel em Ciências Economicas");
        req.setAttribute("formacao4", "Faculdades Metropolitanas Unidas, Concluído.");

        req.setAttribute("h14", "Certificações");
        req.setAttribute("certificacao1", "Práticas de Cloud Services usando Swift com ênfase em Serviços Cognitivos.");
         req.setAttribute("certificacao2", "Desenvolvimento WEB, Rocketseat.");

        req.setAttribute("h15", "Habilidades");
        req.setAttribute("habilidade1", "Java: POO, Funções Recursivas, CRUD.");
        req.setAttribute("habilidade2", "Front-End: HTML5, CSS3, javascript.");
        req.setAttribute("habilidade3", "Infraestrutura: Manutenção e instalção de hardwares e softwares.");

        req.setAttribute("h17", "Projetos");
        req.setAttribute("projeto1", "Você pode encontrar alguns dos meus projetos no GitHub, acessando o meu perfil em: <a href=\"https://github.com/wlln148\">https://github.com/wlln148</a>. Lá, você poderá conferir exemplos do meu trabalho e habilidades em ação.");

        req.getRequestDispatcher("cv.jsp").forward(req, resp);
    }
}
