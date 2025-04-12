package OOPS;

public class Earth implements Planet{
    private int diameter;
    private int distance;
    private boolean isHabitable;
    private String nearestStarName;

    public Earth(int diameter, int distance, boolean isHabitable, String nearestStarName) {
        this.diameter = diameter;
        this.distance = distance;
        this.isHabitable = isHabitable;
        this.nearestStarName = nearestStarName;
    }

    @Override
    public int findWater() {
        System.out.println("Finding water....");
        return 89;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isHabitable() {
        return isHabitable;
    }

    public void setHabitable(boolean habitable) {
        isHabitable = habitable;
    }

    public String getNearestStarName() {
        return nearestStarName;
    }

    public void setNearestStarName(String nearestStarName) {
        this.nearestStarName = nearestStarName;
    }
}
