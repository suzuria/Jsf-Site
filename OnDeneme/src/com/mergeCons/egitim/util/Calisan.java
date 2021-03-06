package com.mergeCons.egitim.util;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Formula;

@Entity
public class Calisan implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String ad;
	private String soyad;
	private Integer Telefon;
	private Integer maas = 1000;
	@Formula("maas*12")
	private Integer YillikGelir;
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.ALL})
	private CalisanAdres adres = new CalisanAdres();

	public String getAd() {
		return ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMaas() {
		return maas;
	}

	public Integer getYillikGelir() {
		return YillikGelir;
	}

	public void setMaas(Integer maas) {
		this.maas = maas;
	}

	public void setYillikGelir(Integer yillikGelir) {
		YillikGelir = yillikGelir;
	}

	public CalisanAdres getAdres() {
		return adres;
	}

	public void setAdres(CalisanAdres adres) {
		this.adres = adres;
	}

	public Integer getTelefon() {
		return Telefon;
	}

	public void setTelefon(Integer telefon) {
		Telefon = telefon;
	}


}
