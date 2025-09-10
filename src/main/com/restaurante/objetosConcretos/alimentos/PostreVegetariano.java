package objetosConcretos.alimentos;

import fabricas.Postre;

public class PostreVegetariano implements Postre {
    @Override
    public String crearPostre() {
        return "Creando Postre";
    }
}
