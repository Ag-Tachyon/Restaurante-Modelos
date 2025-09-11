package objetosConcretos.alimentos.vegetariana;

import fabricas.PlatoPrincipal;

public class platoPrincipalVeg implements PlatoPrincipal {
    @Override
    public String crearPlatoPrincipal() {
        return "Creando plato principal";
    }
}
