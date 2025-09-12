package objetosConcretos.menus;

import fabricas.Bebida;
import fabricas.Entrada;
import fabricas.PlatoPrincipal;
import fabricas.Postre;
import fabricas.fabricaMenu;
import objetosConcretos.alimentos.japon.BebidaJapon;
import objetosConcretos.alimentos.japon.EntradaJapon;
import objetosConcretos.alimentos.japon.PlatoPrincipalJap;
import objetosConcretos.alimentos.japon.PostreJapon;
import objetosConcretos.alimentos.vegetariana.platoPrincipalVeg;

public class MenuJapon implements fabricaMenu {
    @Override
    public Bebida traerBebida() {
        Bebida bebidaFinalJapon = new BebidaJapon();
        return bebidaFinalJapon;
    }

    @Override
    public Entrada traerEntrada() {
        Entrada entradaFinalJapon = new EntradaJapon();
        return entradaFinalJapon;
    }

    @Override
    public PlatoPrincipal traerPlatoPrincipal() {
        PlatoPrincipal platoPrincipalFinal = new PlatoPrincipalJap();
        return platoPrincipalFinal;
    }

    @Override
    public Postre traerPostre() {
        Postre postreFinalJapon = new PostreJapon();
        return postreFinalJapon;
    }
}
