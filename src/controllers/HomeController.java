package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet() 
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
   	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   	 */
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		// TODO Auto-generated method stub
   		//response.getWriter().append("Served at: ").append(request.getContextPath());
   		
   		String param0 = request.getParameter("param0");
   		if("mention".equals(param0)){
   			this.getServletContext().getRequestDispatcher("/WEB-INF/mentionslegales.jsp").forward(request, response);
   		}else if("accueil".equals(param0)){
   			this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
   		}else if("quisommesnous".equals(param0)){
   			this.getServletContext().getRequestDispatcher("/WEB-INF/qui-sommes-nous.jsp").forward(request, response);
   		}
   		
   	}

   	/**
   	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   	 */
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		// TODO Auto-generated method stub
   		//doGet(request, response);
   		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
   	}

}
