public enum PreciosProductos {
    COCACOLA(500, 1),
    SPRITE(500, 2),
    FANTA(500, 5),
    SNIKERS(400, 4),
    SUPER8(300, 5);
    public int precio;
    public int identificador;

    private PreciosProductos(int valor, int identificador) {
        this.precio = valor;
        this.identificador = identificador;
    }

    public int valor() {
        return precio;
    }

    public int getIdentificador() {
        return identificador;
    }
}