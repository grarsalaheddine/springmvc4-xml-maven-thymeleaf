package dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.eheio.model.consultation;

public interface ConsultationDao {

	
	public void setSessionFactory(SessionFactory sessionFactory);

	public void addConsultation(consultation consultation);
	public void removeCconsultation(int id);
	public consultation getConsultation(int id);
	public List<consultation> getConsultations();
	
	
}
