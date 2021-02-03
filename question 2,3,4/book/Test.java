// Manoj Kumar Vemuri ID 2022213

import java.util.ArrayList;
public class Test {

   public static void main(String[] args) {
       Book book1=new Book();
       Book book2=new Book("Wuthering Heights",200,"E. Bronte","novel");
       Book b3=new Book("Dyson Vaccum cleaner manual",200,"Dyson"," manual");
       Book b4=new Book("Gone girl ",200,"Gillian Flynn","thriller");
  
       ArrayList<Book> arrayList = new ArrayList<Book>();   //adding objects to list
   arrayList.add(b2);
   arrayList.add(b3);
   arrayList.add(b4);
   arrayList.add(b1);
     
  
   for(Book book: arrayList) {
       System.out.println(book);
       }
   }
  
     

}