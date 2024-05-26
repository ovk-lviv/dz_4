package dz6;

import java.util.List;

public class Task1 {
    public boolean workWithCities (List<String> cities, String search) {
        boolean result = false;
        for (String city:cities) {
            if (city.equals(search)) {
                result = true;
            }
        }
        return result;
    }
}
