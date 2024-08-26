public class Guru {
    String nama, mapel, status;
    int nip;

    public Guru(String n, String m, String s, int i) {
        nama = n;
        mapel = m;
        status = s;
        nip = i; 
    }

    //Getter
    //Setter
    //Method



    public void print() {
        System.out.println("Nama : " + nama);
        System.out.println("Mapel : " + mapel);
        System.out.println("Status : " + status);
        System.out.println("NIP : " + nip);
    }


}
