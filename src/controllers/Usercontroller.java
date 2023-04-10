package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Usercontroller
 *
 * /
 * @author utilisateur
 *
 */
public class Usercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usercontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// nous récupèrons la valeur du paramètre
		String param = request.getParameter("param");
		//
		if("inscription".equals(param)){
			this.getServletContext().getRequestDispatcher("/WEB-INF/users/inscription.jsp").forward(request, response);
		}else if("connexion".equals(param)){
			this.getServletContext().getRequestDispatcher("/WEB-INF/users/connexion.jsp").forward(request, response);
		}else{
			this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/users/inscription.jsp").forward(request, response);
	}
}
