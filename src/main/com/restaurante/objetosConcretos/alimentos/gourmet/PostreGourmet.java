package objetosConcretos.alimentos.gourmet;
import fabricas.Postre;

public class PostreGourmet implements Postre {
   @Override
   public String crearPostre() {
       return "Creando Postre";
   }
}
