public class Alimentos {
    // Atributos
    public char TIPO_ALIMENTO = 'N';
    public Double PRECIO_BASE = 80.0;
    public Integer PESO_BASE = 5;
    public Double precioBase;
    public Integer peso;
    public char tipoAlimento;
    private Double precioFinal;
    private Integer adicion;
    
    // Contructores
    public Alimentos(){
    }
    public Alimentos(Double precioBase, Integer peso){
        if (peso == 0) {
            this.peso = PESO_BASE; // El peso tomaría el valor
            // de PESO_BASE
        } 
        if (peso >= 1 && peso <= 9) {
            // Se adiciona 20$:
            adicion = 6;
        } else if (peso > 9 && peso <= 16) {
            // Se adiciona 18$:
            adicion = 8;
        } else if (peso > 16) {
            // Se adiciona 5$
            adicion = 20;
        }
    }
    public Alimentos(Double precioBase, Integer peso, char tipoAlimento){
        if (tipoAlimento == 0) /* REVISAR */ {
            this.tipoAlimento = TIPO_ALIMENTO;
        }
        precioBase = precioBase * peso;
    }
    public void comprobarTipoAlimento(char tipoAlimento){

        // Condicion validar tipo de alimento N,C
        if (tipoAlimento == 'N') {
            adicion = 40;
        } else if (tipoAlimento == 'C') {
            adicion = 20;
        }
    }
    public Double calcularPrecio(){
        // Codigo calcular precio final
        precioFinal = precioBase + adicion;
        return precioFinal;
    }
}

