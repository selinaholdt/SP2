public abstract class Title {
    private String title;
    private String literatureType;
    private static final double rate = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double roundTwoDecimals(double value){
        return Math.round(value * 100) / (double)100;
    }

    public double calculateRoyalty(){
        //39508 × 0.067574 + 22848 × 0.067574 = 4213.64 kr (afrundet med 2 decimaler)
        return roundTwoDecimals(calculatePoints() * rate);
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType(){
        if (literatureType.equalsIgnoreCase("BI")){
            return 3;
        } else if (literatureType.equalsIgnoreCase("TE")){
            return 3;
        } else if (literatureType.equalsIgnoreCase("LYRIK")) {
            return 6;
        } else if (literatureType.equalsIgnoreCase("SKØN")) {
            return 1.7;
        } else if (literatureType.equalsIgnoreCase("FAG")) {
            return 1;
        } else {
            System.out.println("Not a literature type");
            return 0;

        }

    }


}
