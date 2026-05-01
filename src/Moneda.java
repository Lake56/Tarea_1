public abstract class Moneda implements Comparable<Moneda>{

    public Moneda() {}

    public Moneda getSerie() {
        return this;
    }
    public abstract int getValor();

    public int compareTo(Moneda otra) {
        return this.getValor()-otra.getValor();
    }
    public String toString() {
        return "moneda: serie=" + hashCode() + ", valor=" + getValor() + "]";
    }
}