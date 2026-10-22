public abstract class NetTitle extends Title{
    private int availability;
    private int reach;
    private int use;

    public NetTitle(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    public int getReach() {
        return reach;
    }

    public int getUse() {
        return use;
    }

    public int getAvailability() {
        return availability;
    }

    protected double getPseudoCopies() {
        return 0;
    }

    private int getUseFactor(){
        return  0;
    }



}
