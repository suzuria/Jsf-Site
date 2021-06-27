package com.mergeCons.egitim.util;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Formula;

public class CalisanView {
	private String arAd;
	private String arSoyad;
	@Formula("maas*12")
	private Integer YillikGelir;
	private Calisan calisan = new Calisan();
	private List<Calisan> listele = new ArrayList<Calisan>();
	
	public void kaydet() {
		listele.add(calisan);
		calisan = new Calisan();
	}
	
	public void sil() {
		listele.remove(calisan);
		calisan = new Calisan();
	}
	
	public void duzenle() {
		calisan = new Calisan();
	}

	
	
	
	
	
	public Calisan getCalisan() {
		return calisan;
	}

	public List<Calisan> getListele() {
		return listele;
	}

	public void setCalisan(Calisan calisan) {
		this.calisan = calisan;
	}

	public void setListele(List<Calisan> listele) {
		this.listele = listele;
	}

	public String getArAd() {
		return arAd;
	}

	public String getArSoyad() {
		return arSoyad;
	}

	public Integer getYillikGelir() {
		return YillikGelir;
	}

	public void setArAd(String arAd) {
		this.arAd = arAd;
	}

	public void setArSoyad(String arSoyad) {
		this.arSoyad = arSoyad;
	}

	public void setYillikGelir(Integer yillikGelir) {
		YillikGelir = yillikGelir;
	}
	
	

}
