class RefrigeratorManager {
    public static void main(String[] args){

        // creo una lista della spesa
        Item pollo = new Item("pollo", 20200314, true);
        Item minestrone = new Item("minestrone", 20200312, true);
        Item[] myShopList = new Item[12];
        for(int i = 0; i < myShopList.length-2; i++){
            myShopList[i] = new Item("nome"+i, 20200311+i, false);
        }

        //aggiungo 2 elementi surgelati
        myShopList[10] = pollo;
        myShopList[11] = minestrone;



        Refrigerator refrigerator = new Refrigerator(3,4,1,5);

        for(int i = 0; i< myShopList.length; i++){
            refrigerator.putItem(myShopList[i]);
        }
        
        refrigerator.printNormalShelfs();
        refrigerator.printFreezingShelfs();

        refrigerator.clean(20200313);
    }
}