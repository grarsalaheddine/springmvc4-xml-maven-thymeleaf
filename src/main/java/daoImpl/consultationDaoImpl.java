package daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eheio.model.consultation;

import dao.ConsultationDao;
@Repository
public class consultationDaoImpl implements ConsultationDao {

	private SessionFactory sessionFactory;
	@Autowired
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		
	}

	@Override
	public void addConsultation(consultation consultation) {
		this.sessionFactory.getCurrentSession().save(consultation);
		
	}

	@Override
	public void removeCconsultation(int id) {

		this.sessionFactory.getCurrentSession().delete(getConsultation(id));
	}

	@Override
	public consultation getConsultation(int id) {
		return (consultation) this.sessionFactory.getCurrentSession().get(consultation.class, id);
	}

	@Override
	public List<consultation> getConsultations() {
		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		Query qry = session.createQuery("from consultation");
		return qry.list();
	}

}
