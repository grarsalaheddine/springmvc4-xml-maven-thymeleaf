package dao;

import java.util.List;

import org.hibernate.SessionFactory;


import com.eheio.model.utilisateur;

public interface UtilisateurDao {
	
	
	public void setSessionFactory(SessionFactory sessionFactory);

	public void addutilisateur(utilisateur utilisateur);
	public void removeUser(int id);
	public utilisateur getUser(int id);
	public List<utilisateur> getUsers();

}
