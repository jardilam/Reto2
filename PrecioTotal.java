public class PrecioTotal {
    // Atributos
    private Double tAlimentos;
    private Double tRefrescos;
    private Double tCarnicos;
    private Alimentos listaAlimentos[];
    private Alimentos precioFinalA;
    private Carnicos precioFinalC;
    private Refrescos precioFinalR;

    // Constructores
    public PrecioTotal() {
        
    }
    public PrecioTotal(Double tAlimentos, Double tRefrescos, Double tCarnicos, Alimentos listaAlimentos[]){
       this.tAlimentos = precioFinalA;
       this.tRefrescos = precioFinalR;
       this.tCarnicos = precioFinalC;

    }
    // Metodo mostrar Total
    public void mostrarTotal(){
        // Codigo calculo de total
        System.out.println("El precio total de los Productos Alimentos es de " + tAlimentos);
        System.out.println("La suma del precio de las Refrescos es de " + tRefrescos);
        System.out.println("La suma del precio de los Cárnicos es de " + tCarnicos);
    } 
}