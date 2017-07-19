/*
 * participant: ConcreteClass
 */
public class ServiceHistoryBooklet extends AbstractBookletPrinter {

    @Override
    protected int getPageCount() {
        return 5;
    }

    @Override
    protected void printFrontCover() {
        System.out.println("printing the front cover for Service History booklet");
    }

    @Override
    protected void printTableOfContents() {
        System.out.println("printing the table of contents for Service History booklet");
    }

    @Override
    protected void printPage(int pageNumber) {
        System.out.println("printing page " + pageNumber + " for Service History booklet");
    }

    @Override
    protected void printIndex() {
        System.out.println("printing the index for Service History booklet");
    }

    @Override
    protected void printBackCover() {
        System.out.println("printing the back cover for Service History booklet");
    }
    
}
