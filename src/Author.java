import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }

    public void addTitle(Title title){
        titles.add(title);
    }

    public double roundTwoDecimals(double value){
        return Math.round(value * 100) / (double)100;
    }

    public double calculateRoyalties(){
        double totalRoyalties = 0;
        for (Title title : titles){
            totalRoyalties += title.calculateRoyalty();
        }
        return roundTwoDecimals(totalRoyalties);
    }

    public String getName(){
        return name;
    }


}
