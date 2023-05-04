public abstract class AbstractInputDevice implements InputDevice {
    private String fabricante;
    private String modelo;
    private int precio;
    private String tipoConector;
    private int[] puertoValidos;

    public AbstractInputDevice(String fabricante, String modelo, int precio, String tipoConector, int[] puertoValidos) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.tipoConector = tipoConector;
        this.puertoValidos = puertoValidos;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public int[] getPuertoValidos() {
        return puertoValidos;
    }
}
