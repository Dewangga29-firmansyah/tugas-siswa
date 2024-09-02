//Buat Object Class dari Driver Blass berikut
public class PlayInstrument {

    public static void main(String[] args) {
        Instrument a = new Instrument("android", 300.0);
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.9);

        a.type = "guitar";
        a.price = 101.5;
        a.print();
        b.print();
        c.print();
    }
}
