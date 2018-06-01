package service;

import java.util.List;

import com.eheio.model.maladie;
import com.eheio.model.utilisateur;

public interface MaladieServiceInterface {

	
	public void addMaladie(maladie maladie);
	public void removeMaladie(int id);
	public utilisateur getMaladie(int id);
	public List<utilisateur> getMaladies();
}
