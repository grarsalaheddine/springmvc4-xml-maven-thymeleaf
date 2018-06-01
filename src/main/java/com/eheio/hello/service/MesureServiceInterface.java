package service;

import java.util.List;

import com.eheio.model.mesure;
import com.eheio.model.utilisateur;

public interface MesureServiceInterface {
	
	
	public void addConsultation(mesure mesure);
	public void removeMesure(int id);
	public utilisateur getMesure(int id);
	public List<utilisateur> getMesures();

}
