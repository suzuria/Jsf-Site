package com.mergeCons.egitim.util;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.apache.commons.collections.functors.IfClosure;
import org.hibernate.loader.custom.Return;
import org.hibernate.property.Dom4jAccessor.ElementAttributeSetter;


public class Giris {
	private String kullaniciAdi;
	private String sifre;
	
	public String giris() {
		if(kullaniciAdi.equals("Kerim")&& sifre.equals("123"))
			return "dogru";
		else
			return "yanlis";
	}
	
	
	
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
}








/*
//@Entity(name="giris")
//@Table(name="giris")
public class Giris implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	private String kullaniciAdi;
	private String sifre;
	
	@OneToOne(mappedBy="giris")
	private Calisan calisan;
	
	public String Kontrol() {
		EntityManager en = EntityUtil.getEntityManager();
		List<Giris> list = en
				.createQuery("select m from giris m where KullaniciAdi like :KullaniciAdi and Sifre lise :Sifre")
				.setParameter("KullaniciAdi", getKullaniciAdi())
				.setParameter("Sifre", getSifre()).getResultList();
	
	if (list.size() == 1) {
		return "login";
	} else
		return "yanlis";
	
	}
	
	
	
	
	public Long getId() {
		return id;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public Calisan getCalisan() {
		return calisan;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public void setCalisan(Calisan calisan) {
		this.calisan = calisan;
	}
}
*/