package dao;

import java.util.List;
import org.hibernate.SessionFactory;
import com.eheio.model.mesure;

public interface MesureDao {

	
	public void setSessionFactory(SessionFactory sessionFactory);

	public void addMesure(mesure mesure);
	public void removeMesure(int id);
	public mesure getMesure(int id);
	public List<mesure> getMesures();
}
