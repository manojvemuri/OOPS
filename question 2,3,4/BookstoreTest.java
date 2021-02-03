// Manoj Kumar Vemuri ID 2022213

public class BookstoreTest{
    public static void main(String[] args) {

        //making an instance of bookstore class
        Bookstore bookStore = Bookstore.getInsatance();

        //creating instance for all genres
        Bookcase bc_novel1 = new Bookcase("novel");
        Bookcase bc_novel2 = new Bookcase("novel");
        Bookcase bc_thriller = new Bookcase("thriller");
        Bookcase bc_essay = new Bookcase("essay");
        Bookcase bc_manual = new Bookcase("manual");
       

        //adding books of same genre to the same bookcase
        Book b1 = new Book("the life of of pi", "novel");
        Book b2 = new Book("pride and prejudice", "novel");
        bc_novel1.addBook(b1);
        bc_novel1.addBook(b2);

        Book b3 = new Book("the wings of fire", "novel");
        Book b4 = new Book("lord of the rings", "novel");
        bc_novel2.addBook(b3);
        bc_novel2.addBook(b4);


        Book b5 = new Book("the girl with the dragon tattoo", "thriller");
        Book b6 = new Book("Disturbia", "thriller");
        bc_thriller.addBook(b5);
        bc_thriller.addBook(b6);


        Book b7 = new Book("Essay on the works of Shakespeare","essay");
        Book b8 = new Book("Robin Williams impact on comedy","essay");
        bc_essay.addBook(b7);
        bc_essay.addBook(b8);

        Book b9 = new Book("iFixit: Apple Pencil Manual","manual");
        Book b10 = new Book("Fixing your chainsaw","manual");
        bc_manual.addBook(b9);
        bc_manual.addBook(b10);


        //Adding these bookcases to the bookstore
        bookStore.addBookCase(bc_novel1);
        bookStore.addBookCase(bc_novel2);
        bookStore.addBookCase(bc_thriller);
        bookStore.addBookCase(bc_essay);
        bookStore.addBookCase(bc_manual);


        //printing the bookstore
        System.out.println(bookStore);

    }
}
