public class Carnicos extends Alimentos {
    // Atributos
    private Integer TEMPERATURA = 10;
    private Integer temperatura;
    private Integer adicion;
    private Double precioFinal;
    // Contructores
    public Carnicos(){
        // Método: 
    }
    public Carnicos(Double precioBase, Integer peso){
        // Método: 
        if (precioBase == 0 && peso == 0) {
            this.precioBase = PRECIO_BASE; // El precioBase tomaría el valor
            // de PRECIO_BASE
            this.peso = PESO_BASE; // El peso tomaría el valor
            // de PESO_BASE
        }
        precioBase = precioBase * peso;
    }
    public Carnicos(Double precioBase, Integer peso, Integer temperatura){
        // Método:
        if (temperatura == 0) {
            this.temperatura = TEMPERATURA; // La temperatura tomaría el valor
            // de TEMPERATURA
        } 
        if (temperatura >= 5 && temperatura < 10) {
            // Se adiciona 20$:
            adicion = 20;
        } else if (temperatura >= 10 && temperatura <= 15) {
            // Se adiciona 18$:
            adicion = 18;
        } else if (temperatura > 15) {
            // Se adiciona 5$
            adicion = 5;
        }
    }
    public Double calcularPrecio(){
        // Método: 
        // Codigo calcular precio final
        precioFinal = precioBase + adicion;
        return precioFinal;
    }
}
