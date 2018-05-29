package service;

import java.util.List;

public interface utilisateur {
	
	
	public void addConsultation(utilisateur utilisateur);
	public void removeutilisateur(int id);
	public utilisateur getUser(int id);
	public List<utilisateur> getUsers();

}
