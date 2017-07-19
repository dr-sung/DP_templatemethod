/*
 * participant: AbstractClass
 */

public abstract class AbstractBookletPrinter {

    protected abstract int getPageCount();

    protected abstract void printFrontCover();

    protected abstract void printTableOfContents();

    protected abstract void printPage(int pageNumber);

    protected abstract void printIndex();

    protected abstract void printBackCover();

    // This is the 'Template Method'
    public final void print() {
        printFrontCover();
        printTableOfContents();
        for (int i = 1; i <= getPageCount(); i++) {
            printPage(i);
        }
        printIndex();
        printBackCover();
    }
}
