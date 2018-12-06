public class Country extends MapObject {
    private String name;
    private int popula;

    public Country(String name, int popula, int x, int y) {
        super(x, y);
        this.name = name;
        this.popula = popula;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return popula;
    }

    public String toString() {
        String print = "";
        print += getName() + " is located at " + "(" + getX() + "," + getY() + ")" + " with a population of "
                + getPopulation() + " people." + "\n";
        return print;
    }
}