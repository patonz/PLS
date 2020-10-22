import java.util.*;

class Stuff {
    public static void main(String[] args) {

        Oggetto obj = new Oggetto(5);

        Oggetto obj2 = new Oggetto(9);
        String codiceFiscale = "ciaone";
       

        HashMap<String, ArrayList<ContoCorrente>> conti = new HashMap<>();
        if(!conti.containsKey(codiceFiscale)){
            conti.put(codiceFiscale, new ArrayList<ContoCorrente>());
         
        }
        conti.get(codiceFiscale).add(new ContoCorrente());

      /*  System.out.println(obj);
        System.out.println(obj2);


        if(obj.compareTo(obj2) == 1){
            System.out.println("sono lo stesso Oggetto");
        } else {
            System.out.println("non sono lo stesso Oggetto");
        }
*/
        ArrayList<Oggetto> listaOggetti = new ArrayList<>();

        listaOggetti.add(obj);
        listaOggetti.add(obj2);

        Iterator<Oggetto> iteratorListaOggetti = listaOggetti.iterator();

        System.out.println(iteratorListaOggetti.next().getNumero());
        System.out.println(iteratorListaOggetti.next().getNumero());
        if(iteratorListaOggetti.hasNext()){
            System.out.println(iteratorListaOggetti.next().getNumero());
        }

     
    
    }

   

}