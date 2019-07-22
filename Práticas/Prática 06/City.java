import java.util.Objects;

public class City implements Comparable<City> {
    private String nome, estado, cep;

    public City(String nome, String estado, String cep) {
        this.nome = nome;
        this.estado = estado;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(getNome(), city.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    public int compareTo(City c) {
        return this.getNome().compareTo(c.getNome());
    }

    @Override
    public String toString() {
        return "\nName: " + this.nome + "; State: " + this.estado + "; Zipcode: " + this.cep;
    }
}
