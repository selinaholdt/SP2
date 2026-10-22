public class EAudioBook extends NetTitle implements IAudioBook{
    private int durationsInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationsInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationsInMinutes = durationsInMinutes;
    }

    @Override
    protected double calculatePoints() {
        //Varighed / 2 × litteraturtype × ((udbredelse × 5) + (tilgængelighed × 0,5) + anvendelsesfaktor)
        //220 sider × 1 × ((50 × 5) + (97 × 0,5) + 205) = 110770 point
        return ((durationsInMinutes / 2) * convertLiteratureType() * ((getReach() * 5) + (getAvailability() * 0.5) + getUse()));
    }

    @Override
    public int getDurationInMinutes() {
        return durationsInMinutes;
    }
}
