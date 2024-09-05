//Buat Object Class dari Driver Blass berikut
public class PlayInstrument {

    public static void main(String[] args) {
        Instrument a = new Instrument("guitar", 300.0);
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.9);

        a.setType("guitar");
        a.setPrice(300.0);

        b.setType("Piano");
        b.setPrice(200.0);

        c.setType("Violin");
        c.setPrice(150.9);

        a.print();
        b.print();
        c.print();

        System.out.println("");

        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("yang paling mahal gitar");
        } else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("yang paling mahal piano");
        } else {
            System.out.println("yang paling mahal violin");
        }

        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("yang paling mahal gitar");
        } else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("yang paling murah piano");
        } else {
            System.out.println("yang paling mahal violin");
        }

        }
    }

