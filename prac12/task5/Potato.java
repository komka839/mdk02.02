package prac12.task5;

public class Potato implements Comparable<Potato> {

    public int id;
    public double weight;
    public double length;
    public double girth;

    public Potato(int id, double weight, double length, double girth) {
        this.id = id;
        this.weight = weight;
        this.length = length;
        this.girth = girth;
    }

    public int calculateAlpha(Potato o) {
        return (int) (o.weight * 0.5 + o.length * 0.65 + o.girth * 0.80);
    }

    private int alpha() {
        return calculateAlpha(this);
    }

    @Override
    public int compareTo(Potato o) {
        return Integer.compare(alpha(), o.alpha());
    }

    @Override
    public String toString() {
        return "Картошка{id=" + id + ", альфа=" + alpha() + "}";
    }
}
