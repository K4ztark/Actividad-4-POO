package Figuras;

public class Piramide extends FiguraGeometrica {
    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(CalcularVolumen());
        this.setSuperficie(CalcularSuperficie());
    }

    public double CalcularVolumen() {
        double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
        return volumen;
    }

    public double CalcularSuperficie() {
        double areabase= Math.pow(base, 2.0);
        double arealado = 2.0 * base * apotema;
        return arealado+ areabase;
    }

}
