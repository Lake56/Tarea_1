public abstract class Moneda implements Comparable<Moneda> {
    @Override
    public int compareTo(Moneda otraMoneda) {
        return Integer.compare(this.getValor(), otraMoneda.getValor());
    }

    abstract public String toString();
    public abstract int getValor();
}