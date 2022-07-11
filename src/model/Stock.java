package model;
import java.util.Date;
public class Stock extends BaseModel {
	
	private String StokKodu;
	private String StokAdi;
	private int StokTipi;
	private String Birim;
	private String Barkod;
	private double KDVTipi;
	private String Aciklama;
	private String Tarih;
	
	
	public String getStokKodu() {
		return StokKodu;
	}
	public void setStokKodu(String stokKodu) {
		StokKodu = stokKodu;
	}
	public String getStokAdi() {
		return StokAdi;
	}
	public void setStokAdi(String stokAdi) {
		StokAdi = stokAdi;
	}
	public int getStokTipi() {
		return StokTipi;
	}
	public void setStokTipi(int stokTipi) {
		StokTipi = stokTipi;
	}
	public String getBirim() {
		return Birim;
	}
	public void setBirim(String birim) {
		Birim = birim;
	}
	public String getBarkod() {
		return Barkod;
	}
	public void setBarkod(String barkod) {
		Barkod = barkod;
	}
	public double getKDVTipi() {
		return KDVTipi;
	}
	public void setKDVTipi(double kDVTipi) {
		KDVTipi = kDVTipi;
	}
	public String getAciklama() {
		return Aciklama;
	}
	public void setAciklama(String aciklama) {
		Aciklama = aciklama;
	}
	public String getTarih() {
		return Tarih;
	}
	public void setTarih(String tarih) {
		Tarih = tarih;
	}
	
	
	
	public void save() {
		//insert 
	}
	
	public void update() {
		//update
	}
	
	public void delete() {
		
	}
	
	
	
}
