package a3.filosofs;

public class MainFilosofs {
    public static void main(String[] args) throws InterruptedException {
        Cobert c0 = new Cobert();
        Cobert c1 = new Cobert();
        Cobert c2 = new Cobert();
        Cobert c3 = new Cobert();

        Filosof f0 = new Filosof("Aristoteles",c3,c0);
        Filosof f1 = new Filosof("Socrates",c1,c0);
        Filosof f2 = new Filosof("Parmenides",c1,c2);
        Filosof f3 = new Filosof("Heraclito",c3,c2);
        f0.start();

        f1.start();

        f2.start();

        f3.start();


    }
}
