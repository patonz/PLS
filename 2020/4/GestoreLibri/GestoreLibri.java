

public class GestoreLibri {

    // 4 posti per ripiano, 3 ripiani;
    static Book[][] libreria = new Book[3][4];
    static Book[] libri = new Book[10];
    public static void main(String[] args) {


        String[] titles = new String[10]; // va da 0 a 9 = lunghezza 10;
        titles[0] = "It";
        titles[1] = "Shining";
        titles[2] = "Signore degli Anelli";
        titles[3] = "Lo Hobbit";
        titles[4] = "La Storia Infinita";
        titles[5] = "I Love Shopping";
        titles[6] = "Quando tutto inizia";
        titles[7] = "Storia dell'Architettura Moderna";
        titles[8] = "Reti di calcolatori e internet";
        titles[9] = "...che Dio perdona a Tutti";
    
        String[] types = {"horror", "horror", "fantasy", "fantasy", "fantasy", "romantic", "romantic", "technical", "technical", "narrative"};
        String[] authors = {"Stephen King","Stephen King","J.R.R. Tolkien", "J.R.R. Tolkien", "Michael Ende", "Sophie Kinsella", "Fabio Volo", "Leonardo Benevolo", "Kurose", "Pif"};
       
        int[] pages = {300, 450, 1200, 400, 370, 280, 400, 550, 700, 170 };
        
       
        for(int i = 0; i < libri.length; i++){
            String title = titles[i];
            String author = authors[i];
            String type = types[i];
            int pag = pages[i];
            String color = "colore"+i;

            Book libro = new Book(title, author, type,pag, color);
            libri[i] = libro;
        }

        Book libro1 = new Book("titolo", "autore", "generwe", 100, "yellow");
        Book libro2 = new Book("titolo", "autore", "generwe", 100, "blue");

        GestoreLibri.stampaListaLibri();
        GestoreLibri.inserisciLibriPerTipo("narrative");
    
     
        System.out.println();
        System.out.println();
        System.out.println();
        GestoreLibri.stampaLaMiaLibreria();



     
    }


    public static void stampaListaLibri(){
        for(int i = 0; i < libri.length; i++){
            Book libro = libri[i];
           System.out.println(libro.getColor());
        }
    }
    public static void stampaLaMiaLibreria() {
        stampaLibreriaGenerica(libreria);
    }

    public static void stampaLibreriaGenerica(Book[][] lib){
        for (int i = 0; i < lib.length; i++) {
            System.out.print("Scaffale " + i + ": ");
            for (int j = 0; j < lib[i].length; j++) {
                if (lib[i][j] == null) {
                    System.out.print("vuoto; ");
                } else {
                    System.out.print(lib[i][j].getTitle() + "; ");
                }
            }
            System.out.println();
        }
    }

    public static void inserisciLibriPerTipo(String type){
        int indiceLibri = 0;
        for (int i = 0; i < libreria.length; i++) {
            Book[] scaffale = libreria[i];

            for (int j = 0; j < scaffale.length; j++) {
                if (indiceLibri < libri.length && type.equals(libri[indiceLibri].getType())) {
                    scaffale[j] = libri[indiceLibri]; 
                   
                }
                indiceLibri++;

            }
        }
    }
}
