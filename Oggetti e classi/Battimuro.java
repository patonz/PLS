public class Battimuro {
    public static void main(String[] args) {
            Palla palla1 = new Palla("bianco", 31.5, 100);
            palla1.palleggi(4);
            palla1.stampaAttributi();

            if(palla1.valoreGonfio() == false){
                System.out.println("la palla è sgonfia!");
                palla1.gonfiaPalla();
            }

            palla1.gonfiaPalla();

            palla1.palleggi(10);

            palla1.palleggi(1);

            palla1.palleggi(3);
            palla1.palleggi(-2);
    }
}