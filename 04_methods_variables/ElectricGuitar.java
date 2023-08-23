class ElectricGuitar {
    private String brand;
    private int numOfPickups;
    private boolean rockStarUSesIt;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String aBrand) {
        brand = aBrand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int num) {
        if (num > 0) {
            numOfPickups = num;
        }
    }

    public boolean getRockStarUsesIt() {
        return rockStarUSesIt;
    }

    public void setRockStarUsesIt (boolean yesOrNo) {
        rockStarUSesIt = yesOrNo;
    }
}