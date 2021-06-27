import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Adres implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String cadde;
	private String sokak;
	
	@OneToOne
	private Calisan calisan;
	
	
	
	
	
	public Calisan getCalisan() {
		return calisan;
	}
	public void setCalisan(Calisan calisan) {
		this.calisan = calisan;
	}
	public Long getId() {
		return id;
	}
	public String getCadde() {
		return cadde;
	}
	public String getSokak() {
		return sokak;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
	}
	public void setSokak(String sokak) {
		this.sokak = sokak;
	}
	 
}
