package objetosConcretos.alimentos;

import fabricas.Bebida;

public class BebidaGourmet implements Bebida{
    @Override
    public String crearBebida() {
        return "Creando Bebida Gourmet";
    }
}
