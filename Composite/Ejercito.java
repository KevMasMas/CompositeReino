import java.util.ArrayList;
import java.util.List;

class Ejercito implements UnidadReino {
    private String nombre;
    private List<UnidadReino> unidades;

    public Ejercito(String nombre) {
        this.nombre = nombre;
        this.unidades = new ArrayList<>();
    }

    public void agregar(UnidadReino unidad) {
        unidades.add(unidad);
    }

    public void eliminar(UnidadReino unidad) {
        unidades.remove(unidad);
    }

    @Override
    public void mostrar() {
        System.out.println("Ejército: " + nombre);
        for (UnidadReino unidad : unidades) {
            unidad.mostrar();
        }
    }

    @Override
    public int obtenerPoder() {
        int poderTotal = 0;
        for (UnidadReino unidad : unidades) {
            poderTotal += unidad.obtenerPoder();
        }
        return poderTotal;
    }
}