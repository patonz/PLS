public class Book {
    private String title;
    private String author;
    private String type;
    private int pages;

    private String color;


    public Book(String title, String author, String type, int pages, String colorCostruttore){
        this.title = title;
        this.author = author;
        this.type = type;
        this.pages = pages;
        color = colorCostruttore;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getType(){
        return this.type;
    }

    public String getColor(){
        return color;
    }

    public String getInfo(){
        return this.title + " - " + this.author + " - " + this.type + " - " + this.pages + " pagine";
    }

    
}
