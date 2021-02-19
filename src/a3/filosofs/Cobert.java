package a3.filosofs;

public class Cobert {
    boolean libre;

    public Cobert() {
        libre=true;
    }

    public synchronized void agafar(){
        try {
            while(!libre) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        libre = false;
        notifyAll();

    }
    public synchronized void deixar() {
        libre = true;

        notifyAll();
    }

}
