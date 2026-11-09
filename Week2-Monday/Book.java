public class Book {
    String author = "Chinua Achebe";
    String title = "Things Fall apart";
    int pages = 209;
    
    void display(){
        System.out.println("The author is: " + author);
        System.out.println("The title of the book is: " + title);
        System.out.println("It has how many pages: " + pages);
    }
    
    public Book(String author, String title , int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public Book(){
        this.author = "Unknown";
        this.title = "Not included";
        this.pages = 0;
    }
}
