/*
 * participant: ConcreteClass
 */
public class SaloonBooklet extends AbstractBookletPrinter {

    @Override
    protected int getPageCount() {
        return 10;
    }

    @Override
    protected void printFrontCover() {
        System.out.println("printing the front cover for Saloon car booklet");
    }

    @Override
    protected void printTableOfContents() {
        System.out.println("printing the table of contents for Saloon car booklet");
    }

    @Override
    protected void printPage(int pageNumber) {
        System.out.println("printing page " + pageNumber + " for Saloon car booklet");
    }

    @Override
    protected void printIndex() {
        System.out.println("printing the index for Saloon car booklet");
    }

    @Override
    protected void printBackCover() {
        System.out.println("printing the back cover for Saloon car booklet");
    }
    
}
