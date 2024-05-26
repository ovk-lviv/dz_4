package dz6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public  void removeDuplicates (List<String> cities) {
        Set<String> noDuplicates = new HashSet<String>(cities);
        System.out.println(noDuplicates);
    }
    // alternative method to show usage of loops
    public void removeDuplicates2 (List<String>cities) {
        for (int i=0; i<= cities.size(); i++){
            if (cities.get(i+1).equals(cities.get(i))) {
                cities.remove(cities.get(i+1));
            }
        }
        System.out.println(cities);
    }
}
