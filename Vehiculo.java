class Vehiculo {

    private int anio;
    private String marca;
    private String modelo;
    private String color;
    private int ruedas;

    public Vehiculo() {

    }

    public Vehiculo(String color) {
        this.color = color;
    }

    public Vehiculo(String color, String marca, String modelo) {
        /* color ="rojo"; marca= "Honda"; modelo = "Civic" */
        this.color = color; //carro3.color = "rojo";
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void arrancar() {
        System.out.println("RUUUM");
    }

}