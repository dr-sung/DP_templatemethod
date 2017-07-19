
// Example: Template Method design pattern
// This example is based on the code presented at the book:
// "Java Design Pattern Essentials" by Tony Bevis

public class Main {
    
    public static void main(String[] args) {
        System.out.println("About to print a booklet for Saloon cars");
        AbstractBookletPrinter saloonBooklet = new SaloonBooklet();
        saloonBooklet.print();
        
        System.out.println("\nAbout to print a booklet for Service History");
        AbstractBookletPrinter serviceHistoryBooklet = new ServiceHistoryBooklet();
        serviceHistoryBooklet.print();
    }
    
}
