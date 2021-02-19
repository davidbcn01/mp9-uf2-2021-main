package a3.filosofs;



public class Filosof extends Thread {

    String nombre;
    Cobert c;
    Cobert c2;

    public String getNombre() {
        return nombre;
    }

    public Filosof(String nom, Cobert cobert1, Cobert cobert2) {

        this.nombre = nom;
        c = cobert1;
        c2 = cobert2;
    }

    @Override
    public void run() {
        for (; ; ) {

                System.out.println(getNombre() + ": " + "Bueno, voy a comer");
                c.agafar();
                try {
                    Thread.sleep((long) (Math.random() * 3000) + 2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getNombre() + ": " + "Estoy lleno");
                c.deixar();


            }
        }
    }

