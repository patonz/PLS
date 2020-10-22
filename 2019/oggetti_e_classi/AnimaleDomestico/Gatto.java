
public class Gatto extends AnimaleDomestico {


    String mangime;
    public Gatto(Date birthDate, double peso, String mangime ){
        super(birthDate, peso);
        this.mangime = mangime;
    }

    @Override
    public int getAge(){
        return super.getAge() * 7;
    }

}