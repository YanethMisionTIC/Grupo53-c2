package ClasesAbstractas;

public abstract class FiguraGeometrica {
    //1. Creamos los atributos de la clase
    protected String tipoFigura;
    
    //2. Insertamos el constructor de la clase con todos los atributos
    public FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    // 3. Crear método dibujarfigura
    // No se puede generalizar este método en esta clase
    public abstract void dibujarFigura();
    
    //4. Añadir la función que retorna el objeto de la clase

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
    
}
