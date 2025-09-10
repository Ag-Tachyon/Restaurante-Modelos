package objetosConcretos.menus;

import fabricas.Bebida;
import fabricas.Entrada;
import fabricas.PlatoPrincipal;
import fabricas.Postre;
import fabricas.fabricaMenu;
import objetosConcretos.alimentos.gourmet.BebidaGourmet;
import objetosConcretos.alimentos.gourmet.EntradaGourmet;
import objetosConcretos.alimentos.gourmet.PlatoprincipalGour;
import objetosConcretos.alimentos.gourmet.PostreGourmet;

public class MenuGourmet implements fabricaMenu {
    @Override
    public Bebida traerBebida() {
        Bebida bebidafinal = new BebidaGourmet();
        return bebidafinal;
    }

    @Override
    public PlatoPrincipal traerPlatoPrincipal() {
        PlatoPrincipal platoPrincipalFinal = new PlatoprincipalGour();
        return platoPrincipalFinal;
    }

    @Override
    public Entrada traerEntrada() {
        Entrada entradaFinal = new EntradaGourmet();
        return entradaFinal;
    }

    @Override
    public Postre traerPostre() {
        Postre postreFInal = new PostreGourmet();
        return postreFInal;
    }
}
