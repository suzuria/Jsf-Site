import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Proje {

	@Id
	@GeneratedValue
	private Long id;
	private String projeAdi;
	
	@ManyToMany(mappedBy="calisilanprojeler")
	private List<Calisan> projeCalisanlari = new ArrayList<Calisan>(); 
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public String getProjeAdi() {
		return projeAdi;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setProjeAdi(String projeAdi) {
		this.projeAdi = projeAdi;
	}
	public List<Calisan> getProjeCalisanlari() {
		return projeCalisanlari;
	}
	public void setProjeCalisanlari(List<Calisan> projeCalisanlari) {
		this.projeCalisanlari = projeCalisanlari;
	}
	
}
