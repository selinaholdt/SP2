public class AudioBook extends PhysicalTitle implements IAudioBook{
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }


    @Override
    protected double calculatePoints() {
        //(varighed i minutter × 0.5) × litteraturtype × eksemplarer
        //(192 × 0.5) × 1,7 × 140 = 22848 point
        return ((durationInMinutes * 0.5) * convertLiteratureType() * copies);
    }


    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
