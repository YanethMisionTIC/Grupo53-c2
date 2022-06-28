package ClasesAbstractas;

public class Circulo extends FiguraGeometrica{

    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujarFigura() {
        System.out.println("Cómo implementar un circulo");
    }
    
}
