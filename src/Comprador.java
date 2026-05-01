class Comprador {
    private String sabor;
    private int vuelto;

    public Comprador(Moneda m, int tipo, Expendedor exp) {
         throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
            vuelto = 0;
            sabor = null;

            Producto p = exp.comprarProducto(m, tipo);
            sabor = p.Sabor();
        Moneda moneda;
        while ((moneda = exp.getVuelto()) != null) {
            vuelto += moneda.getValor();
        }
    }
    public int cuantoVuelto() {
        return vuelto;
    }
    public String queBebiste() {
        return sabor;
    }
}
