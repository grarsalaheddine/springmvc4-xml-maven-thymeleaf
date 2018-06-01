package daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.eheio.model.consultation;
import com.eheio.model.maladie;

import dao.MaladieDao;

public class MaladieDaoImpl implements MaladieDao{

private SessionFactory sessionFactory;
	
	@Autowired
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addConsultation(maladie maladie) {
		this.sessionFactory.getCurrentSession().save(maladie);
		
	}
	
	@Override
	public void removeMaladie(int id) {
		this.sessionFactory.getCurrentSession().delete(getMaladie(id));
		
	}

	@Override
	public maladie getMaladie(int id) {
		return (maladie) this.sessionFactory.getCurrentSession().get(maladie.class, id);
	}

	@Override
	public List<maladie> getMaladies() {
		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		Query qry = session.createQuery("from maladie");
		return qry.list();
	}
	
	
	

}
