package controlador;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet({ "/index", "/home", "/default" })
public class IndexServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public IndexServlet() { }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		request.setAttribute("tituloPagina",
				"Sistema de Controle Banc�rio Web - P�gina Inicial");
		
		request.setAttribute("pathView", "/WEB-INF/index.jsp");
		
		RequestDispatcher rd =
				request.getRequestDispatcher("/WEB-INF/template.jsp");
		
		rd.forward(request, response);
	}
}
