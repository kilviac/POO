import java.util.Comparator;

public class ComparatorByZipCode implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        return o1.getCep().compareTo(o2.getCep());
    }
}
