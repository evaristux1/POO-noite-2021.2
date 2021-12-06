import java.util.ArrayList;

public class Categorias {
    private final ArrayList<String> categorias;
    public Categorias() {
        categorias = new ArrayList<>();
        this.instanciarCategorias();
    }

    private void instanciarCategorias() {
        categorias.add("cereais");
        categorias.add("carnes");
        categorias.add("bebidas");
    }

    public String defineCategoria(int index) {
        return categorias.get(index);
    }
}