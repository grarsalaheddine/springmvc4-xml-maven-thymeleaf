package dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.eheio.model.consultation;
import com.eheio.model.maladie;

public interface MaladieDao {

	
	public void setSessionFactory(SessionFactory sessionFactory);

	public void addConsultation(maladie maladie);
	public void removeMaladie(int id);
	public maladie getMaladie(int id);
	public List<maladie> getMaladies();
}
