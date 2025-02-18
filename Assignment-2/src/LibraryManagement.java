import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book 
{
    String title, author;
    int price;
    
    Book(String title, String author, int price) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void display() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book 
{
    Fiction(String title, String author, int price) 
    {
        super(title, author, price);
    }
    
    void display() 
    {
        System.out.println("Fiction Book Details:");
        super.display();
    }
}

class NonFiction extends Book 
{
    NonFiction(String title, String author, int price) 
    {
        super(title, author, price);
    }
    
    void display() 
    {
        System.out.println("Non-Fiction Book Details:");
        super.display();
    }
}

public class LibraryManagement 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        for (int i = 1; i <= 2; i++) 
        {
            System.out.println("Book " + i + ":");
            System.out.print("Type (Fiction/Non-Fiction): ");
            String type = scanner.next();
            scanner.nextLine();
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            int price = scanner.nextInt();
            
            if (type.equalsIgnoreCase("Fiction")) 
            {
                books.add(new Fiction(title, author, price));
            } 
            else if (type.equalsIgnoreCase("Non-Fiction")) 
            {
                books.add(new NonFiction(title, author, price));
            }

            System.out.print("\n") ;
        }
        
        for (Book book : books) 
        {
            book.display();
            System.out.println();
        }
        
        scanner.close();
    }
}
