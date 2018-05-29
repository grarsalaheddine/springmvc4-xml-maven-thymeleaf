package service;

import java.util.List;

import com.eheio.model.consultation;
import com.eheio.model.utilisateur;

public interface ConsultationServiceInterface {
	
	
	public void addConsultation(consultation consultation);
	public void removeConsultationr(int id);
	public utilisateur getConsultation(int id);
	public List<utilisateur> getConsultations();

}
