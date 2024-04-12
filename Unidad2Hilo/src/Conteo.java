public abstract class Conteo extends Thread {
    String nombre="Evelyn";
    abstract void Num(int numero, String nombre);

    public void run() {
        for (int i = 1; i <= 24; i++) {
            Num(i, nombre);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
