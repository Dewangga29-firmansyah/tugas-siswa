public class Guru {
    String nama;
    String mapel;
    String status;
    int nip;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMapel() {
		return this.mapel;
	}

    public void set(String mapel ) {
		this.mapel = nama;
	}

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNip() {
        return this.nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public Guru(String n, String m, String s, int i) {
        nama = n;
        mapel = m;
        status = s;
        nip = i; 
    }

    public void print() {
        System.out.println("Nama : " + nama);
        System.out.println("Mapel : " + mapel);
        System.out.println("Status : " + status);
        System.out.println("NIP : " + nip);
    }


}
