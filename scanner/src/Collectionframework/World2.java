package Collectionframework;
import java.util.*;

public class World2 {

    public static void main(String[] args) {

        List<String> mumbai = new ArrayList<>();
        mumbai.add("parel");
        mumbai.add("dadar");

        List<String> pune = new ArrayList<>();
        pune.add("karvenagar");
        pune.add("hinjavdi");

        List<List<String>> india = new ArrayList<>();
        india.add(mumbai);
        india.add(pune);

        List<String> tokyo = new ArrayList<>();
        tokyo.add("Ebisu");
        tokyo.add("asakusa");

        List<String> hiroshima = new ArrayList<>();
        hiroshima.add("nagasaki");
        hiroshima.add("okayama");

        List<List<String>> japan = new ArrayList<>();
        japan.add(tokyo);
        japan.add(hiroshima);

        List<String> LA = new ArrayList<>();
        LA.add("uptown");
        LA.add("downtown");

        List<String> NewYork = new ArrayList<>();
        NewYork.add("uptown");
        NewYork.add("downtown");

        List<List<String>> usa = new ArrayList<>();
        usa.add(LA);
        usa.add(NewYork);

        List<List<List<String>>> World = new ArrayList<>();
        World.add(usa);
        World.add(japan);
        World.add(india);

        for (List<List<String>> country : World) {
            for (List<String> cityList : country) {
                for (String city : cityList) {
                    System.out.println(city);
                }
            }
        }
    }
}
