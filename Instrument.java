//Object Class
public class Instrument {
    //variabel
    private String type;
    private double price;

	public String gettype() {
		return this.type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public double getprice() {
		return this.price;
	}

	public void setprice(double price) {
		this.price = price;
	}


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Constructor


    public Instrument(String t, double p) {
        type = t;
        price = p;
    }

    //getter
    //setter
    //method
    public void print() {
        System.out.println("Piano : " + 200.0);
        System.out.println("Violin : " + 150.9);
    }
}
