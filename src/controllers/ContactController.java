package controllers;

import java.awt.TextField;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Contact;
import manager.ContactManager;
import util.HibernateUtil;

/**
 * Servlet implementation class ContactController
 */

public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/contact/contact.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ContactManager ctm = new ContactManager();
		Contact ct         = new Contact();
		String name        = request.getParameter("nom");
		String email       = request.getParameter("email");
		String phone       = request.getParameter("phone");
		String subject     = request.getParameter("objet");
		String message     = request.getParameter("message");
		/* ajouter les données données */
		ct.setName(name);
		ct.setEmail(email);
		ct.setPhone(phone);
		ct.setSubject(subject);
		ct.setMessage(message);
		ctm.add(ct);
		this.getServletContext().getRequestDispatcher("/WEB-INF/contact/contact.jsp").forward(request, response);
		//HibernateUtil.sessionFactory.close();
		
	}

}
