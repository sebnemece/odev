package com.vektorel.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Table
@Entity
public class tblurun {

	@Id
	@SequenceGenerator(name = "tblkitap_sq_id",
    allocationSize = 1, initialValue = 1,
    sequenceName = "tblkitap_sq_id")
	@GeneratedValue(generator = "tblkitap_sq_id")
	private Long id;
	private String ad;
	private String tur;
	private String aciklama;
	private int fiyat;
	private int adet;
	
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
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	
}
