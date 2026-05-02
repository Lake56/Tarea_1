import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Expendedor expendedor = new Expendedor(2); // Creamos la máquina con 2 productos de cada uno

        System.out.println("-- Prueba De Compras Exitosas --");
        try {
            // Compramos CocaCola
            Moneda moneda1 = new Moneda1000();
            Comprador comprador1 = new Comprador(moneda1, tipoProduct.COCA, expendedor);
            System.out.println("El comprador compro: " + comprador1.queBebiste() + " | Vuelto: $" + comprador1.cuantoVuelto());

            // Compramos Snickers
            Moneda moneda2 = new Moneda500();
            Comprador comprador2 = new Comprador(moneda2, tipoProduct.SNICKERS, expendedor);
            System.out.println("El comprador compro: " + comprador2.queBebiste() + " | Vuelto: $" + comprador2.cuantoVuelto());

            // Compramos Sprite
            Moneda moneda3 = new Moneda1000();
            Comprador comprador3 = new Comprador(moneda3, tipoProduct.SPRITE, expendedor);
            System.out.println("El comprador compro: " + comprador3.queBebiste() + " | Vuelto: $" + comprador3.cuantoVuelto());

        } catch (Exception e) {
            System.out.println("Error en la compra: " + e.getMessage());
        }

        System.out.println("-- Prueba De Excepciones --");

        System.out.println("Prueba Dinero Insuficiente");
        try {
            Moneda moneda4= new Moneda100();
            // Intentamos comprar un Super8 con una moneda de 100
            Comprador compradorError1 = new Comprador(moneda4, tipoProduct.SUPER8, expendedor);
        } catch(PagoInsuficienteException e) {
            System.out.println("Excepcion obtenida: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ha habido una excepcion equivocada");
        }

        System.out.println("Prueba Sin Stock");
        try {
            Moneda moneda5 = new Moneda1000();
            // Compramos 2 Fantas para agotar el stock
            new Comprador(new Moneda1000(), tipoProduct.FANTA, expendedor);
            new Comprador(new Moneda1000(), tipoProduct.FANTA, expendedor);
            System.out.println("Stock de Fanta agotado. Intentando comprar la tercera...");

            Comprador compradorError2 = new Comprador(moneda5, tipoProduct.FANTA, expendedor);
        } catch(NoHayProductoException e) {
            System.out.println("Excepcion obtenida: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ha habido una excepcion equivocada");
        }

        System.out.println("Prueba Moneda Nula");
        try {
            Moneda moneda5 = null;
            Comprador compradorError3 = new Comprador(moneda5, tipoProduct.COCA, expendedor);
        } catch(PagoIncorrectoException e) {
            System.out.println("Excepcion obtenida: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ha habido una excepcion equivocada");
        }

        System.out.println("\n-- Prueba De Monedas --");
        ArrayList<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda1000());
        monedas.add(new Moneda100());
        monedas.add(new Moneda500());

        System.out.println("Monedas Desordenadas: " + monedas);

        monedas.sort(null);

        System.out.println("Monedas Ordenadas: " + monedas);
    }
}