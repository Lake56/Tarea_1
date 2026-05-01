public abstract class Moneda implements Comparable<Moneda>{
    //constructor
    public Moneda() {}
    //getters
    public Moneda getSerie() {
        return this;
    }
    public abstract int getValor();

    public int compareTo(Moneda otra) {
        return this.getValor()-otra.getValor();
    }
    //tostring
    public String toString() {
        return "moneda: serie=" + hashCode() + ", valor=" + getValor() + "]";
    }
}