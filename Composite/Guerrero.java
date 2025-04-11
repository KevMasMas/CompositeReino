
class Guerrero implements UnidadReino {
    private String nombre;
    private int poder;

    public Guerrero(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    @Override
    public void mostrar() {
        System.out.println("Guerrero: " + nombre + ", Poder: " + poder);
    }

    @Override
    public int obtenerPoder() {
        return poder;
    }
}
