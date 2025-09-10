package objetosConcretos.menus;

import fabricas.Bebida;
import fabricas.Entrada;
import fabricas.PlatoPrincipal;
import fabricas.Postre;
import objetosConcretos.alimentos.EntradaVegetariana;
import objetosConcretos.alimentos.platoPrincipalVeg;
import fabricas.fabricaMenu;
import objetosConcretos.alimentos.BebidaVegetariana;
import objetosConcretos.alimentos.PostreVegetariano;

public class MenuVegetariano implements fabricaMenu {
    @Override
    public Entrada traerEntrada() {
        EntradaVegetariana entradaFinal = new EntradaVegetariana();
        return entradaFinal;
    }

    @Override
    public PlatoPrincipal traerPlatoPrincipal() {
        PlatoPrincipal platoPrincipalFinal = new platoPrincipalVeg();
        return platoPrincipalFinal;
    }

    @Override
    public Bebida traerBebida() {
        BebidaVegetariana bebidaFinal  = new BebidaVegetariana();
        return bebidaFinal;
    }

    @Override
    public Postre traerPostre() {
        Postre postreFinal = new PostreVegetariano();
        return postreFinal;
    }
}
