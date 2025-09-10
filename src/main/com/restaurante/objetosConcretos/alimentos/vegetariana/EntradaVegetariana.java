package objetosConcretos.alimentos;

import fabricas.Entrada;

public class EntradaVegetariana implements Entrada{

    @Override
    public String crearEntrada() {
        return "Creando Entrada Vegetariana";
    }
}
