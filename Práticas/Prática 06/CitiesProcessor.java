import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;

public class CitiesProcessor {
    private Set<City> citiesSet = new TreeSet<>();

    public Set<City> buildSetOfCities(String filePath) throws IOException { // lê o arquivo de cidades
        String linha;
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        while ((linha = br.readLine()) != null) {
            String aux[] = linha.split(",");
            City c = new City(aux[0], aux[1], aux[2]);
            citiesSet.add(c);
        }
        br.close();
        return citiesSet;
    }

    public void writeSetOfCities(String filePath, Comparator <City> comparator) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));

        TreeSet<City> cities_aux = new TreeSet<>(comparator);
        cities_aux.addAll(citiesSet);

        for (City c : cities_aux) {
            bw.write(c.toString());
            bw.newLine();
        }
        bw.close();
    }

    public void setCitiesSet(Set<City> citiesSet) {
        this.citiesSet = citiesSet;
    }
}
