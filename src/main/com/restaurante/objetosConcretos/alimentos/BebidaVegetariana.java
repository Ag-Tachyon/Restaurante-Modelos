package objetosConcretos.alimentos;

import fabricas.Bebida;

public class BebidaVegetariana implements Bebida{

    @Override
    public String crearBebida() {
        return "Creando Bebida Vegetariana";
    }
}
