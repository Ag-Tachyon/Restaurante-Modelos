package objetosConcretos.menus;

import fabricas.Bebida;
import fabricas.fabricaMenu;
import objetosConcretos.alimentos.BebidaVegetariana;

public class MenuVegetariano implements fabricaMenu {
    @Override
    public String traerEntrada() {
        return "treyendo";
    }

    @Override
    public String traerPlatoPrincipal() {
        return "trayendo";
    }

    @Override
    public Bebida traerBebida() {
        BebidaVegetariana bebidaFinal  = new BebidaVegetariana();
        return bebidaFinal;
    }

    @Override
    public String traerPostre() {
        return "kjh";
    }
}
