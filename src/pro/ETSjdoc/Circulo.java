package pro.ETSjdoc;

/**
 * Esta clase representa un círculo, definido por sus
 * coordenadas x e y y su radio.
 * 
 * @author Christian
 */

public class Circulo {
    private float x, y;
    private float radio;

    /**
     * Constructor de la clase Circulo.
     * 
     * @param cX La coordenada x del centro del círculo.
     * @param cY La coordenada y del centro del círculo.
     * @param r  El radio del círculo.
     */
    public Circulo(float cX, float cY, float r) {
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }

    /**
     * Devuelve la coordenada x del centro del círculo.
     * 
     * @return La coordenada x del centro del círculo.
     */
    public float getX() {
        return x;
    }

    /**
     * Establece la coordenada x del centro del círculo.
     * 
     * @param x La nueva coordenada x del centro del círculo.
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Devuelve la coordenada y del centro del círculo.
     * 
     * @return La coordenada y del centro del círculo.
     */
    public float getY() {
        return y;
    }

    /**
     * Establece la coordenada y del centro del círculo.
     * 
     * @param y La nueva coordenada y del centro del círculo.
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Devuelve el radio del círculo.
     * 
     * @return El radio del círculo.
     */
    public float getRadio() {
        return radio;
    }

    /**
     * Establece el radio del círculo.
     * 
     * @param radio El nuevo radio del círculo.
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

    /**
     * Calcula y devuelve el área del círculo.
     * 
     * @return El área del círculo.
     */
    public float area() {
        return (float) Math.PI * radio * radio;
    }

    /**
     * Imprime en la consola las coordenadas x e y y el radio del
     * círculo, además del área.
     */
    public void imprimir() {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}