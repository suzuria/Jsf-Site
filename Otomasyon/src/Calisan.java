import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Calisan implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private	String ad;
	private	String soyad;
	
	@ManyToOne
	private Departman departman = new Departman();
	
	@ManyToMany
	private List<Proje> calisilanprojeler = new ArrayList<Proje>();
	
	@OneToOne
	private Adres adres = new Adres();
	
	
	
	
	
	
	
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	public List<Proje> getCalisilanprojeler() {
		return calisilanprojeler;
	}
	public void setCalisilanprojeler(List<Proje> calisilanprojeler) {
		this.calisilanprojeler = calisilanprojeler;
	}
	public Long getId() {
		return id;
	}
	public String getAd() {
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public Departman getDepartman() {
		return departman;
	}
	public void setDepartman(Departman departman) {
		this.departman = departman;
	}
	
	}
