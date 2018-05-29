package daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.eheio.model.maladie;
import com.eheio.model.mesure;

import dao.MesureDao;

public class MesureDaoImpl implements MesureDao{

private SessionFactory sessionFactory;
	
	@Autowired
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addMesure(mesure mesure) {
		this.sessionFactory.getCurrentSession().save(mesure);
		
		
	}

	@Override
	public void removeMesure(int id) {
		this.sessionFactory.getCurrentSession().delete(getMesure(id));
		
	}

	@Override
	public mesure getMesure(int id) {
		return (mesure) this.sessionFactory.getCurrentSession().get(mesure.class, id);
	}

	@Override
	public List<mesure> getMesures() {
		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		Query qry = session.createQuery("from mesure");
		return qry.list();
	}

}
