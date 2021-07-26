public class Refrescos extends Alimentos {
    // Atibutos:
    private char lugarOrigen;
    private char LUGAR_ORIGEN = 'N';
    private Integer adicion;
    private Double precioFinalR;

    // Constructores
    public Refrescos(){ 
    }
    public Refrescos(Double precioBase, Integer peso){
        // Metodo:
        if (precioBase == 0 && peso == 0) {
            this.precioBase = PRECIO_BASE; // El precioBase tomaría el valor
            // de PRECIO_BASE
            this.peso = PESO_BASE; // El peso tomaría el valor
            // de PESO_BASE
        }
        precioBase = precioBase * peso;
    }
    public Refrescos(Double precioBase, Integer peso, char lugarOrigen){ 
        // Metodo:
        this.lugarOrigen = LUGAR_ORIGEN;   
    }
    public void comprobarLugarOrigen(char lugarOrigen){ 
        // Metodo:

        // Condicion validar lugar de origen N,I:
        if (lugarOrigen == 'N') {
            adicion = 5;
        } else if (lugarOrigen == 'i') {
            adicion = 15;
        }
    }
    public Double calcularPrecio(){
        // Metodo:
        precioFinalR = precioBase + adicion;
        // Codigo calcular precio final return precioFinal;
        return precioFinalR;
    }
}

