class Item {

    private String name;
    private int expireDate;
    private boolean freeze;

    public Item(String itemName, int itemExpireDate, boolean isFreeze) {
        name = itemName;
        expireDate = itemExpireDate;
        freeze = isFreeze;
    }

    public String getName(){
        return name;
    }

    public void setName(String itemName){
        if(name != null){
            name = itemName;
        }
       
    }

    public int getExpireDate(){
        return expireDate;
    }

    public boolean isFreeze(){
        return freeze;
    }

    public String toString(){
        return "{ name: "+ name + ", expireDate: "+ expireDate+ ", freeze: "+freeze+"}";
    }
}