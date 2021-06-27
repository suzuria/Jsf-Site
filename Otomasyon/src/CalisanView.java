import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class CalisanView {
	private Calisan bir= new Calisan();
	
	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(bir);
		//en.persist(bir.setAdres(adres););
		en.getTransaction().commit();
	}

	public Calisan getBir() {
		return bir;
	}

	public void setBir(Calisan bir) {
		this.bir = bir;
	}



}
