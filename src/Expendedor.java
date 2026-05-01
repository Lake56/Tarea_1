class Expendedor {
    private Deposito<Producto> depositoCoca;
    private Deposito<Producto> depositoSprite;
    private Deposito<Producto> depositoFanta;
    private Deposito<Producto> depositoSnickers;
    private Deposito<Producto> depositoSuper8;
    private Deposito<Moneda> depositoVuelto;

    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int FANTA = 3;
    public static final int SNICKER = 4;
    public static final int SUPER8 = 5;
    private int precio;

    public Expendedor(int numProductos) {
        depositoCoca = new Deposito<Producto>();
        depositoSprite = new Deposito<Producto>();
        depositoFanta = new Deposito<Producto>();
        depositoSnickers = new Deposito<Producto>();
        depositoSuper8 = new Deposito<Producto>();
        depositoVuelto = new Deposito<Moneda>();

        //se llenan todos magicamente x igual
        for (int i = 0; i < numProductos; i++) {
            depositoCoca.add(new CocaCola(i));
            depositoSprite.add(new Sprite(i));
            depositoFanta.add(new Fanta(i));
            depositoSnickers.add(new Snickers(i));
            depositoSuper8.add(new Super8(i));
        }
    }
    //"tipoProduct" cambiara dependiendo el nombre del enum
    private Deposito<Producto> getDeposito(tipoProduct tipo) {
        if (tipo == tipoProduct.COCA) {
            return depositoCoca;
        }
        if (tipo == tipoProduct.SPRITE) {
            return depositoSprite;
        }
        if (tipo == tipoProduct.FANTA) {
            return depositoFanta;
        }
        if (tipo == tipoProduct.SNICKERS) {
            return depositoSnickers;
        }
        if (tipo == tipoProduct.SUPER8) {
            return depositoSuper8;
        }
        return null;
    }
    public Producto comprarProducto(Moneda m, int Producto) {
        if (m == null || m.getValor() < precio) {
            if (m != null) vuelto.add(m);
            return null;
        }
        if (Producto !=COCA && Producto !=SPRITE && Producto !=FANTA && Producto !=SNICKER && Producto !=SUPER8) {
            vuelto.add(m);
            return null;
        }
        if ((Producto ==COCA && coca.isEmpty()) || (Producto ==SPRITE && sprite.isEmpty()) || (Producto ==FANTA && fanta.isEmpty()) || (Producto ==SNICKER && snicker.isEmpty()) || Producto ==SUPER8 && super8.isEmpty()) {
            vuelto.add(m);
            return null;
        }
        int cambio = m.getValor() - precio;
        while (cambio >= 100) {
            vuelto.add(new Moneda100());
            cambio -= 100;
        }
        if (Producto == COCA) {
            return coca.get();
        } else if (Producto ==SPRITE){
            return sprite.get();
        }
        else if(Producto ==FANTA){
            return fanta.get();
        }
        else if(Producto ==SNICKER){
            return snicker.get();
        }
        else{
            return super8.get();
        }
    }
    public Moneda getVuelto() {
        return vuelto.get();
    }
}