import java.util.ArrayList;

class ListeEccezioni {
    public static void main(String[] args) {

     

        ArrayList<Integer> lista = new ArrayList<Integer>();
     
        for(int i = 0; i < 10; i++){
            lista.add(i);
        }
     

        try {
            int num = lista.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("provavo a prendere un elemento non esistente");
        } finally {
            System.out.println("finally");
        }

        System.out.print("ciaone");
   
  


    }   


    public Integer[] add(Integer[] integers, Integer integer){
        Integer[] nuovoArray = new Integer[integers.length+1];


        for(int i = 0; i < integers.length; i++){
            nuovoArray[i] = integers[i];
        }

        nuovoArray[nuovoArray.length-1] = integer;
        return nuovoArray;
    }
}