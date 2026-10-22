public class PrintedBook extends PhysicalTitle{
    private int pages;


    public PrintedBook(String title, String literatureType,int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        //Sider × litteraturtype × eksemplarer
        //166 × 1,7 × 140 = 39508 point
        return (pages * convertLiteratureType() * copies);
    }


}
