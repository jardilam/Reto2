public class Carnicos extends Alimentos {
    // Atributos
    private Integer TEMPERATURA = 0;
    private Integer temperatura;
    private Integer adicion;
    private Double precioFinal;
    // Contructores
    public Carnicos(){

    }
    public Carnicos(Double precioBase, Integer peso){
        TEMPERATURA = 10;
    }
    public Carnicos(Double precioBase, Integer peso, Integer temperatura){

        if (temperatura >= 5 && temperatura < 10) {
            // Se adiciona 20$
        } else if (temperatura >= 10 && temperatura <= 15) {
            // Se adiciona 18$
        } else if (temperatura > 15) {
            // Se adiciona 5$
        }

    }
    public Double calcularPrecio(){ 
    // Codigo calcular precio final
    precioFinal = precioBase + adicion;
    return precioFinal; 
    }
}
