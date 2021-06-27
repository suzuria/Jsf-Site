import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departman implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String ad;
	
	
	@OneToMany(mappedBy="departman")
	private List<Calisan> calisankisiler= new ArrayList<Calisan>(); 
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	public List<Calisan> getCalisankisiler() {
		return calisankisiler;
	}
	public void setCalisankisiler(List<Calisan> calisankisiler) {
		this.calisankisiler = calisankisiler;
	}

}
