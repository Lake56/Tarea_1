/**
 * Se crea la clase enum que contiene los valores y codigos verificadores de producto
 * Ademas retornar uno de estos parametros para su uso en el codigo
 */
public enum PreciosProductos {
    COCACOLA(500, 1),
    SPRITE(500, 2),
    FANTA(500, 3),
    SNIKERS(400, 4),
    SUPER8(300, 5);
    private final int precio;
    private final int identificador;

    /**
     * Se asigna valor al precio e identificador del producot
     * @param precio del producto
     * @param identificador del producto
     */
    private PreciosProductos(int precio, int identificador) {
        this.precio = precio;
        this.identificador = identificador;
    }

    /**
     * @return el valor de la bebida
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @return el numero verificador del producto
     */
    public int getIdentificador() {
        return identificador;
    }
}