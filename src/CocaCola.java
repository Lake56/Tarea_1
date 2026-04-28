public class CocaCola extends Bebida {
    public CocaCola(int serie) {
        super(serie);
    }

    @Override
    public String Beber() {
        return new String("Sabor CocaCola");
    }
}
