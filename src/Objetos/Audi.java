package Objetos;

public class Audi {
    //Atributos
    private String marca;
    private Integer modelo;
    private Double motor;
    private Combustible combustible;
    private Tipo tipo;
    private Integer puertas;
    private Integer asientos;
    private Integer velocidadMax;
    private Color color;
    private Integer velocidadAct;
    
    //Enums
    public enum Combustible{
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GASNATURAL;
    }
    
    public enum Tipo{
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV;
    }
    
    public enum Color{
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA;
    }

    //Metodos
    public void acelerar(Integer aumentar) {
        if (velocidadAct + aumentar > velocidadMax) {
            velocidadAct = velocidadMax;
            System.out.println("Has acelerado hasta el maximo de " +
                    velocidadMax + " Km/h");
        } else {
            velocidadAct = velocidadAct + aumentar;
            System.out.println("Aceleraste hasta la velocidad de " +
                    velocidadAct + " Km/h");
        }
    }
    
    public void desacelerar(Integer desminuir){
        if (velocidadAct - desminuir < 0) {
            velocidadAct = 0;
            System.out.println("Desaceleraste hasta detenerte");
        } else {
            velocidadAct = velocidadAct - desminuir;
            System.out.println("Desaceleraste hasta la velocidad de " +
                    velocidadAct + " Km/h");
        }
    }
    
    public void frenar(){
        velocidadAct = 0;
        System.out.println("Has frenado por completo");
    }
    //esto fue un mata cabeza XD
    public void destino(Integer distancia){
        if (velocidadAct > 0) {
            Integer destino = distancia / velocidadAct;
            System.out.println("El destino está a = " + destino + " h");
        } else {
            System.out.println("El carro está detenido y asi no llegara al"
                    + " destino");
        }
    }
    
    //Construtor
    public Audi(String marca, Integer modelo, Double motor,
            Combustible combustible, Tipo tipo, Integer puertas,
            Integer asientos, Integer velocidadMax, Color color,
            Integer velocidadAct) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.combustible = combustible;
        this.tipo = tipo;
        this.puertas = puertas;
        this.asientos = asientos;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.velocidadAct = velocidadAct;
    }

    //getter y setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Double getMotor() {
        return motor;
    }

    public void setMotor(Double motor) {
        this.motor = motor;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    public Integer getAsientos() {
        return asientos;
    }

    public void setAsientos(Integer asientos) {
        this.asientos = asientos;
    }

    public Integer getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Integer velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getVelocidadAct() {
        return velocidadAct;
    }

    public void setVelocidadAct(Integer velocidadAct) {
        this.velocidadAct = velocidadAct;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n----------[Auto]------------");
        sb.append("\nMarca = ").append(marca);
        sb.append("\nModelo = ").append(modelo);
        sb.append("\nMotor = ").append(motor);
        sb.append("\nTipo de combustible = ").append(combustible);
        sb.append("\nTipo de carro = ").append(tipo);
        sb.append("\nNumero de puertas = ").append(puertas);
        sb.append("\nNumero de asientos = ").append(asientos);
        sb.append("\nVelocidad máxima = ").append(velocidadMax);
        sb.append("\nColor = ").append(color);
        sb.append("\nVelocidad actual = ").append(velocidadAct);
        return sb.toString();
    } 
}
