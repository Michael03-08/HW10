import java.util.Scanner;

public class Main {
    static String booksInfo = "";
    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double price = inputPrice();
            addBook(name);
            addBook(name, pageCount);
            addBook(name, pageCount, price);
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.print("Введите название книги: ");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.print("Введите кол-во страниц: ");
        return new Scanner(System.in).nextInt();
    }
    public static double inputPrice() {
        System.out.print("Ввдите цену: ");
        return new Scanner(System.in).nextDouble();
    }

    public static void addBook(String bookName){addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        addBook(bookName,  pageCount,  0);
    }
    public static void addBook(String bookName, int pageCount, double price){
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр."
                + "Цена - " + (price > 0 ? price + " руб." : "N/A" ) + "\n";
    }


    public static void printInfo() {
        System.out.println(booksInfo);
    }

}
