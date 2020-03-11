class Refrigerator {

     private Item[][] normalShelfs;
     private Item[][] freezingShelfs;

     public Refrigerator(int normalShelfs, int itemPerNormalShelfs, int freezingShelfs, int itemPerFreezingShelfs) {
          this.normalShelfs = new Item[normalShelfs][itemPerNormalShelfs];
          this.freezingShelfs = new Item[freezingShelfs][itemPerFreezingShelfs];
     }

     public Item[][] getNormalShelfs() {
          return normalShelfs;
     }

     public Item[][] getFreezingShelfs() {
          return freezingShelfs;
     }

     private void putItemInSlot(Item item, int shelf, int slot) {
          if (item.isFreeze()) {
               if (shelf < freezingShelfs.length && slot < freezingShelfs[shelf].length) {
                    if (freezingShelfs[shelf][slot] != null) {
                         freezingShelfs[shelf][slot] = item;
                    }
               }

          } else {
               if (shelf < normalShelfs.length && slot < normalShelfs[shelf].length) {
                    if (normalShelfs[shelf][slot] != null) {
                         normalShelfs[shelf][slot] = item;
                    }
               }
          }
     }

     public boolean putItem(Item item) {
          if (item.isFreeze()) {
               return putFreeSlotFreezingShelfs(item);
          } else {
               return putFreeSlotNormalShelfs(item);
          }
     }

     public boolean putFreeSlotFreezingShelfs(Item item) {
          boolean putIn = false;
          for (int i = 0; i < freezingShelfs.length; i++) {
               for (int j = 0; j < freezingShelfs[i].length; j++) {
                    if (freezingShelfs[i][j] == null && !putIn) {
                         freezingShelfs[i][j] = item;
                         putIn = true;
                         return putIn;
                    }
               }
          }
          return putIn;
     }

     public boolean putFreeSlotNormalShelfs(Item item) {
          boolean putIn = false;
          for (int i = 0; i < normalShelfs.length; i++) {
               for (int j = 0; j < normalShelfs[i].length; j++) {
                    if (normalShelfs[i][j] == null && !putIn) {
                         normalShelfs[i][j] = item;
                         putIn = true;
                         return putIn;
                    }
               }
          }
          return putIn;
     }

     public void printNormalShelfs() {
          System.out.println("stampa degli item negli scaffali normali");
          // Item[][] normalShelfs = refrigerator.getNormalShelfs();
          for (int i = 0; i < normalShelfs.length; i++) {
               for (int j = 0; j < normalShelfs[i].length; j++) {
                    if (normalShelfs[i][j] != null) {
                         String itemInfo = normalShelfs[i][j].toString();
                         System.out.println("scaffale " + i + ", scomparto " + j + " " + itemInfo);
                    } else {
                         System.out.println("scaffale " + i + ", scomparto " + j + " è vuoto");
                    }
               }
          }
     }

     public void printFreezingShelfs() {
          System.out.println("stampa degli item negli scaffali congelati");

          for (int i = 0; i < freezingShelfs.length; i++) {
               for (int j = 0; j < freezingShelfs[i].length; j++) {
                    if (freezingShelfs[i][j] != null) {
                         String itemInfo = freezingShelfs[i][j].toString();
                         System.out.println("scaffale " + i + ", scomparto " + j + " " + itemInfo);
                    } else {
                         System.out.println("scaffale " + i + ", scomparto " + j + " è vuoto");
                    }
               }
          }
     }

     public void clean(int currentDate) {
          for (int i = 0; i < freezingShelfs.length; i++) {
               for (int j = 0; j < freezingShelfs[i].length; j++) {
                    if (freezingShelfs[i][j] != null && currentDate >= freezingShelfs[i][j].getExpireDate()) {
                         System.out.println("L'elemento " + freezingShelfs[i][j].toString()
                                   + " è stato buttato via dal congelatore");
                         freezingShelfs[i][j] = null;

                    }
               }
          }

          for (int i = 0; i < normalShelfs.length; i++) {
               for (int j = 0; j < normalShelfs[i].length; j++) {
                    if (normalShelfs[i][j] != null && currentDate >= normalShelfs[i][j].getExpireDate()) {
                         System.out.println(
                                   "L'elemento " + normalShelfs[i][j].toString() + " è stato buttato via dal frigo");
                         normalShelfs[i][j] = null;

                    }
               }
          }
     }

}