
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
        System.out.println("CLICCA 1 SE VUOI ACCENDERE LA LAMPADINA OPPURE 0 PER SPEGNERLA\n");

        for (int i = 0; i <=numeroClick; i++) {
            stato++;
            stato();
        }
    }

    public void stato() {
        // (ON=0----OFF=1---ROTTA=10)
           if (this.stato % 2 == 0 && this.stato <= this.maxClick) {
                System.out.println("OFF");
            } else if (this.stato % 2 == 1 && this.stato <= this.maxClick) {
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
