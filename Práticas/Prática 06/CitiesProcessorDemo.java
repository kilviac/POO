import java.io.IOException;
import java.util.Comparator;
import java.util.Set;

public class CitiesProcessorDemo {
    public static void main (String[] args) throws IOException {
        CitiesProcessor cp = new CitiesProcessor();
        Set<City> set = cp.buildSetOfCities("cities_duplicatas.txt");

        cp.setCitiesSet(set);
        cp.writeSetOfCities("cities_ordered_by_name.txt", Comparator.naturalOrder());

        ComparatorByZipCode comparadorZip = new ComparatorByZipCode();
        cp.writeSetOfCities("cities_ordered_by_zipcode.txt", comparadorZip);

        ComparatorByState comparadorState = new ComparatorByState();
        cp.writeSetOfCities("cities_ordered_by_state.txt", comparadorState);
    }
}
