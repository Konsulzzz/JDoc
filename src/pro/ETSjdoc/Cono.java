package pro.ETSjdoc;

/**
 * Esta clase representa un cono en un espacio, definido por su base, altura y
 * color.
 * 
 * @author Christian
 */

public class Cono {
    private Circulo base;
    private float altura;
    private String color;

    /**
     * Constructor de la clase Cono.
     * 
     * @param cX    La coordenada x del centro de la base del cono.
     * @param cY    La coordenada y del centro de la base del cono.
     * @param r     El radio de la base del cono.
     * @param h     La altura del cono.
     * @param color El color del cono.
     */
    public Cono(float cX, float cY, float r, float h, String color) { // constructor
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }

    /**
     * Devuelve la base del cono.
     * 
     * @return La base del cono.
     */
    public Circulo getBase() {
        return base;
    }

    /**
     * Establece la base del cono.
     * 
     * @param base La nueva base del cono.
     */
    public void setBase(Circulo base) {
        this.base = base;
    }

    /**
     * Devuelve la altura del cono.
     * 
     * @return La altura del cono.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece la altura del cono.
     * 
     * @param altura La nueva altura del cono.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Devuelve el color del cono.
     * 
     * @return El color del cono.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del cono.
     * 
     * @param color El nuevo color del cono.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método que imprime en la consola las coordenadas x e y y el radio de la base
     * del cono, su altura y su color.
     */
    public void imprimir() {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }
}