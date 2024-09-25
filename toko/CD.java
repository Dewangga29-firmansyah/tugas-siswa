package toko;
//Inheritance (Pewarisan)
public class CD extends Product{
    private String artist;
    private int numSong;
    private String label;

    public CD() {
        super();//constructor dari super class
        this.artist = "";
        this.numSong = 0;
        this.label = "";
    }
    public CD(int number, String name, int quantity, double price, String artist, int numSong, String label) {
        super(number, name, quantity, price);
    }
    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    //Override dari super class
    public void print(){
        super.print();
        System.out.println("Artist : " + artist);
        System.out.println("Number of Song : " + numSong);
        System.out.println("Label : " + label);
    }
}
