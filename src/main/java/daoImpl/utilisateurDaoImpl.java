package daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.eheio.model.mesure;
import com.eheio.model.utilisateur;

import dao.UtilisateurDao;

public class utilisateurDaoImpl implements UtilisateurDao{

	private SessionFactory sessionFactory;
	@Autowired
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		
	}

	@Override
	public void addutilisateur(utilisateur utilisateur) {
		this.sessionFactory.getCurrentSession().save(utilisateur);
		
	}

	@Override
	public void removeUser(int id){
		this.sessionFactory.getCurrentSession().delete(getUser(id));
	}

	@Override
	public utilisateur getUser(int id){
		return (utilisateur) this.sessionFactory.getCurrentSession().get(utilisateur.class, id);
	}

	@Override
	public List<utilisateur> getUsers(){
		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		Query qry = session.createQuery("from utilisateur");
		return qry.list();
	}

}
