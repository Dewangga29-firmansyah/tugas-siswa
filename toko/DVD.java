package toko;

public class DVD extends Product {
    private int length;
    private String rating;
    private String studio;

    public DVD() {
        super();
        this.length = 0;
        this.rating = "";
        this.studio = "";
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;

        //Override dari super class
        this.print();
        System.out.println("Length : " + length);
        System.out.println("Rating : " + rating);
        System.out.println("Studio : " + studio);
    }
    
}
