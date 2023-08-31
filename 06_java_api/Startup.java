import java.util.ArrayList;

public class Startup {

    private ArrayList<String> locationCells;
    // private int numOfHits;
    // don't need to track this now

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        // If it's not in the list, returns -1
        if (index >= 0) {
            locationCells.remove(index);
            if(locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }  // end if
        }  // end outer if
        return result;
    }  // end method
}  // end class