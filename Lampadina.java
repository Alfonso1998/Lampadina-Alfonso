public class Lampadina {
    private int maxClick;
    private int stato;

    // COSTRUTTORE
    public Lampadina(int maxClick) {
        this.maxClick = maxClick;
        this.stato = 0;
    }

    // METODI
    public void click(int numeroClick) {
            // OGNI CLICK LA LAMPADINA CAMBIA IL SUO STATO DA SPENTA AD ACCESA O ROTTA

        for (int i = 0; i <=numeroClick; i++) {
            stato++;
            stato();
        }
    }

    public void stato() {
        // (ON=0----OFF=1---ROTTA=10)
           if (stato % 2 == 0 && stato <= maxClick) {
                System.out.println("OFF");
            } else if (stato % 2 == 1 && stato <= maxClick) {
                System.out.println("ON");
            } else {
                System.out.println("Rotta");
                
            }
        
       
    }

    public int getMaxClick() {
        return this.maxClick;
    }

    public int getStato() {
        return this.stato;
    }

    public void setMaxClick(int maxClick) {
        this.maxClick = maxClick;
    }

    public void setStato(int stato) {
        this.stato = stato;
    }
}
