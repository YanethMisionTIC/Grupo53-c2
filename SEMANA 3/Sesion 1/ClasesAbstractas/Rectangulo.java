package ClasesAbstractas;


public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujarFigura() {
        System.out.println("Cómo dibujar un rectangulo ... ");
    }
}
