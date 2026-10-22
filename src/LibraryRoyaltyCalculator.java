public class LibraryRoyaltyCalculator {
    void main(){
        Author author1 = new Author("Karen Blixen");

        author1.addTitle(new PrintedBook("Den afrikanske farm", "SKØN", 350, 50));
        author1.addTitle(new PrintedBook("Syv fantastiske fortællinger", "SKØN", 200, 30));
        author1.addTitle(new AudioBook("Babettes gæstebud", "SKØN", 20, 210));

        System.out.println(author1.getName() + ": " + author1.calculateRoyalties() + " kr.");



        Author author2 = new Author("Tina Ibsen");

        author2.addTitle(new EBook("Big Bang", "FAG", 97, 50, 205, 360000, true));
        author2.addTitle(new EBook("Danmark i rummet", "FAG", 97, 80, 500, 400000, false));
        author2.addTitle(new EAudioBook("RumSnak", "FAG", 97, 10, 5, 60));

        System.out.println(author2.getName() + ": " + author2.calculateRoyalties() + " kr.");



    }
}
