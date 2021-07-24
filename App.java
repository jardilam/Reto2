public class App
{
    public static void main( String[] args ) {
    Alimentos listaAlimentos1[] = new Alimentos[5]; 
    listaAlimentos1[0] = new Alimentos(); 
    listaAlimentos1[1] = new Refrescos(120.2,8,'N'); 
    listaAlimentos1[2] = new Carnicos(210.0,60); 
    listaAlimentos1[3] = new Refrescos(120.0,10,'i'); 
    listaAlimentos1[4] = new Carnicos(190.0,10);

    PrecioTotal solucion1 = new PrecioTotal(listaAlimentos1); 
    solucion1.mostrarTotal();
    System.out.println();
    } 
}
