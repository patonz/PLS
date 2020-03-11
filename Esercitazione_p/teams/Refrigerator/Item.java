class Item {

    private String name;
    private int expireDate;
    private boolean freeze;
    private String type; //facoltativo

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
        return "Item -name: "+ name + ", -expireDate: "+ expireDate;
    }
}