package pro.ETSjdoc;
public class ProgramaComposicionCono {

    /**
     * Método que imprime un objeto en la consola.
     * 
     * @param datos El objeto a imprimir.
     */

    private static void imprimir(Object datos) {
        System.out.println(datos);
    }

    /**
     * Método main que crea instancias de la clase Cono con diferentes radios y
     * alturas, y las imprime en la consola.
     * 
     * @param args
     */
    public static void main(String[] args) {
        java.util.Random aleatorio = new java.util.Random();
        for (int i = 1; i <= 5; i++) {
            int radio = aleatorio.nextInt(9) + 1;
            Cono cono = new Cono(1, 2, radio, i, "Azul");
            cono.imprimir();
            imprimir(cono);
        }
    }
}