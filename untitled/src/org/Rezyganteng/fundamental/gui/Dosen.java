package org.Rezyganteng.fundamental.gui;

public class Dosen {
    private String NamaLengkap;
    private String Alamat;
    private String NoPendaftaran;
    private String TTL;

    public Dosen() {
    }

    public Dosen(String namaLengkap, String alamat, String noPendaftaran, String TTL) {
        NamaLengkap = namaLengkap;
        Alamat = alamat;
        NoPendaftaran = noPendaftaran;
        this.TTL = TTL;
    }

    public String getNamaLengkap() {
        return NamaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        NamaLengkap = namaLengkap;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getNoPendaftaran() {
        return NoPendaftaran;
    }

    public void setNoPendaftaran(String noPendaftaran) {
        NoPendaftaran = noPendaftaran;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    @Override
    public String toString() {
        return "Dosen{" +
                "NamaLengkap='" + NamaLengkap + '\'' +
                ", Alamat='" + Alamat + '\'' +
                ", NoPendaftaran='" + NoPendaftaran + '\'' +
                ", TTL='" + TTL + '\'' +
                '}';
    }
}
