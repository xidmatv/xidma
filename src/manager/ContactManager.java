package manager;


import java.sql.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import bean.Contact;
import util.HibernateUtil;

public class ContactManager {
	
	/* Ajouter  une personne */
	public void add(Contact msg){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		try{
			// j'ouvre  ma session
			System.out.println("je suis en test");
			session.beginTransaction();
			Contact message =  new Contact();
			message.setName(msg.getName());
			message.setEmail(msg.getEmail());
			message.setPhone(msg.getPhone());
			message.setSubject(msg.getSubject());
			message.setMessage(msg.getMessage());
			/* 
			 * Nous récupèrons la date de creation
			 * Date de creation égale date de modification
			 */
			Date date = new Date(System.currentTimeMillis());
			message.setCreated(date);
			// on enregistre dans la base de données
			session.save(message);
			//je ferme ma session 
			session.getTransaction().commit();
		}catch (Throwable ex){
			System.err.println("La suppresion de la personne est echoué" + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
	}
	// cette fonction permet d'afficher les donnes
	public List<Contact> affiche(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "FROM Contact";
		Query query = (Query)session.createQuery(hql);
		List<Contact> contacts = query.list();
		return contacts;
		//for(Contact cont : contacts){
			//System.out.println("nom :"+ cont.getEmail());
		//}
		
	}
	public void supprimer(int id){
		
	}
}
