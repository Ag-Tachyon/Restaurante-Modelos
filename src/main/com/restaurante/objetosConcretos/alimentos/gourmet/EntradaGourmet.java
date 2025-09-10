package objetosConcretos.alimentos.gourmet;

import fabricas.Entrada;

public class EntradaGourmet implements Entrada{
    @Override
    public String crearEntrada() {
        return "Creando entrada Gourmet";
    }
}
