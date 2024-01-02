package uas;

import java.time.LocalDate;
import java.time.Period;

public class setgetform {
    private String nama;
    private int nim;
    private LocalDate ttl;
    private String alamat;

    public String getNama() {return nama;}

    public void setNama(String nama) {this.nama = nama;}

    public int getNim() {return nim;}

    public void setNim(int nim) {this.nim = nim;}

    public LocalDate getTtl() {return ttl;}

    public void setTtl(int year,int bln,int tgl) {this.ttl = LocalDate.of(tgl,bln,year);}

    public String getAlamat() {return alamat;}

    public void setAlamat(String alamat) {this.alamat = alamat;}

    public String umur(){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(ttl, currentDate);
        return "Usia          :" + " " + period.getYears() + " tahun, " + period.getMonths() + " bulan, " + period.getDays() + " hari";
    }

}
