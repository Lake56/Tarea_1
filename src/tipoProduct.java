/**
 * Se crea la clase enum que contiene los valores y codigos verificadores de producto
 * Ademas retornar uno de estos parametros para su uso en el codigo
 */
public enum tipoProduct  {
    COCA(1, "CocaCola", 500),
    SPRITE(2, "Sprite", 500),
    FANTA(3, "Fanta", 500),
    SNICKERS(4, "Snickers", 400),
    SUPER8(5, "Super8", 300);
    private int precio;
    private String nombre;
    private int identificador;

    /**
     * Se asigna valor al precio e identificador del producot
     * @param precio del producto
     * @param nombre del producto
     * @param identificador del producto
     */
    private tipoProduct(int precio, String nombre, int identificador) {
        this.precio = precio;
        this.nombre = nombre;
        this.identificador = identificador;
    }

    /**
     * @return el valor del producto
     */
    public int getPrecio() {
        return precio;
    }
    /**
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @return el numero verificador del producto
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * Entrega el producto dependiendo su identificador
     * @param identificador del producto
     */
    public static tipoProduct getProducto(int identificador) {
        if (identificador == COCA.identificador){
            return COCA;
        }
        if (identificador == SPRITE.identificador){
            return SPRITE;
        }
        if (identificador == FANTA.identificador){
            return FANTA;
        }
        if (identificador == SNICKERS.identificador){
            return SNICKERS;
        }
        if (identificador == SUPER8.identificador){
            return SUPER8;
        }
        return null;
    }
}