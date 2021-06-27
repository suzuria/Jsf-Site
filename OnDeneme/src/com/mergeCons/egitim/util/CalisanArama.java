package com.mergeCons.egitim.util;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;




public class CalisanArama {
	private Calisan calisan = new Calisan();
	private List<Calisan> listele = new ArrayList<Calisan>();
	private String araAd;
	private String araSoyad;
	

	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(calisan.getAdres());
		en.persist(calisan);
		en.getTransaction().commit();
		calisan = new Calisan();
	}
	public void sil() {
		listele.remove(calisan);
		calisan = new Calisan();
	}
	/*
	public void sil(EntityManager en) {
		EntityManager entityManager = EntityUtil.getEntityManager();
		en.remove(calisan);
		calisan = new Calisan();
	}*/
	/*
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
	*/
	public List<Calisan> getCalisanListesi() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("select m From Calisan m").getResultList();
	}

	public List<Calisan> getCalisanListesiAra() {
		EntityManager en = EntityUtil.getEntityManager();
		return en
				.createQuery("select m From Calisan m where " + "ad like :isim " + "and soyad like :soyad "
						+ "and maas > :deger ")
				.setParameter("isim", this.araAd = "%").setParameter("soyad", this.araSoyad = "%")
				.setParameter("deger", this.calisan.getMaas()).getResultList();
	}

	public Calisan getCalisan() {
		return calisan;
	}

	public void setCalisan(Calisan calisan) {
		this.calisan = calisan;
	}

	public String getAraAd() {
		return araAd;
	}

	public String getAraSoyad() {
		return araSoyad;
	}

	public void setAraAd(String araAd) {
		this.araAd = araAd;
	}

	public void setAraSoyad(String araSoyad) {
		this.araSoyad = araSoyad;
	}
	/*
	public List<Calisan> getListele() {
		return listele;
	}
	public void setListele(List<Calisan> listele) {
		this.listele = listele;
	}
*/
}
