package objetosConcretos.alimentos.vegetariana;

import fabricas.Bebida;

public class BebidaVegetariana implements Bebida{

    @Override
    public String crearBebida() {
        return "Creando Bebida Vegetariana";
    }
}
