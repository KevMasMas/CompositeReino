
public class ReinoMedieval {
    public static void main(String[] args) {
        Guerrero arquero = new Guerrero("Arquero", 10);
        Guerrero mago = new Guerrero("Mago", 20);
        Guerrero caballero = new Guerrero("Caballero", 30);

        Ejercito ejercitoNorte = new Ejercito("Ejército del Norte");
        ejercitoNorte.agregar(arquero);
        ejercitoNorte.agregar(mago);

        Ejercito ejercitoCentral = new Ejercito("Ejército Central");
        ejercitoCentral.agregar(caballero);
        ejercitoCentral.agregar(ejercitoNorte); // Ejército dentro de otro ejército

        ejercitoCentral.mostrar();
        System.out.println("Poder total del Ejército Central: " + ejercitoCentral.obtenerPoder());
    }
}