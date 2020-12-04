public class Album {

    private static int maxModify = 3;
    private int currentModify = 0;
    private Author author;

    private String title;

    private Song[] songs = new Song[8];

    public Album(){}


    public void setTitle(String title){
        if(this.currentModify < maxModify){
            this.title = title;
            this.currentModify++;
        } else {
            System.out.println("Non puoi piu modificare il titolo di questo album");
        }
     
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String name){
        this.author = new Author();
    }

    public void addSong(String title, int time){
        boolean created = false;
        for(int i = 0; i < this.songs.length; i++){
           if(this.songs[i] == null){
                // creo;
                this.songs[i] = new Song(title, time, "un path");
                System.out.println("Canzone aggiunta all'album");

                created = true;
                break;
           }
        }
    }

    public void printSongs(){
        for(int i=0; i < songs.length; i++){
            if (songs[i] == null) {
                System.out.println(i + "- slot canzone vuoto");
            } else {
                System.out.println(i + "- " + songs[i].title);
            }
        }
    }


}
