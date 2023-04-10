package manager;

import java.util.Date;

import org.hibernate.Session;

import bean.User;
import util.HibernateUtil;

public class UserManager {
  
	/* Ajouter  une personne */
	public void ajoutPersonne(User p){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		try{
			// j'ouvre  ma session
			session.beginTransaction();
			User utilisateur =  new User();
			//
			utilisateur.setName(p.getName());
			utilisateur.setLastname(p.getLastname());
			utilisateur.setEmail(p.getEmail());	
			utilisateur.setPassword(p.getPassword());
			/* 
			 * Nous récupèrons la date de creation
			 * Date de creation égale date de modification
			 */
			Date date = new Date(System.currentTimeMillis());
			utilisateur.setCreated(date); 
			utilisateur.setModified(date);
			// on enregistre dans la base de données
			session.save(utilisateur);
			//je ferme ma session 
			session.getTransaction().commit();
		}catch (Throwable ex){
			System.err.println("La suppresion de la personne est echoué" + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
	}
	/* supprimer  une personne */
	public void supprimerPersonne(int id){
		 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 try{
			 session.beginTransaction();
			 User p = (User) session.load(User.class, id);
			 session.delete(p);
			 session.getTransaction().commit();
		 }catch(Throwable ex) {
			 System.err.println("La suppresion de la personne est échoué : " + ex);
			 throw new ExceptionInInitializerError(ex);
		 }
	}
	
	// permet d'afficher les utilisateur 
	 public User afficher(int id){
		 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 session.beginTransaction();
		 User personne  = (User) session.load(User.class, new Integer(id));
		 return personne;
		 //session.getTransaction().commit();
	 }
	 
	 // Permet de mettre en jour
	 /*public void updatePersonne(User p, int id){
		 
		 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 session.beginTransaction();
		 User personne  = (User) session.load(User.class, new Integer(id));
		 try{
			 if(p.getNom() != null){
				 personne.setNom(p.getNom());
			 }
			 if(p.getPrenom() != null){
				 personne.setPrenom(p.getPrenom());
			 }
			 if(p.getEmail()!= null){
				 personne.setEmail(p.getEmail());
			 }
			 if(p.getTelephone()!= null){
				 personne.setTelephone(p.getTelephone());
			 }
			 if(p.getPassword()!= null){
				 personne.setPassword(p.getPassword());
			 }
			 if(p.getDateNaissance()!= null){
				 personne.setDateNaissance(p.getDateNaissance());
			 }
			 session.update(personne);
			 session.getTransaction().commit();
			 }catch(Throwable ex){
				 System.err.println("La mise en jour de la personne est en erreur" + ex);
				 throw new ExceptionInInitializerError(ex);
			 }
	 }*/
	 
}
