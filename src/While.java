public class While {
    public static void main(String[] args) {
        // while = loop, ciclu repetitiv
        // zona de cod care se repeta atata timp cat o conditie e true

        // problema: masina merge cat timp are benzina
        int litri_benzina = 10;
        while (litri_benzina > 0) {
            // acceleram
            System.out.println("Vruum Vruum!");
            // scadem benzina
            litri_benzina = litri_benzina - 1;
            // aprindem beculetul cand avem <= 3 litri
            if (litri_benzina <= 3) {
                System.out.println("Se aprinde becul rosu!");
            }
        }
        System.out.println("STOP! Nu mai avem benzina");
    }
}
