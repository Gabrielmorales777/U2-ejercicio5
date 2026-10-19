public class Main {

    public static void main(String[] args) {

        HubCentral hub = new HubCentral();

        DispositivoInteligente foco =
                new DispositivoInteligente("Foco del dormitorio", true);

        DispositivoInteligente aire =
                new DispositivoInteligente("Aire acondicionado", true);

        DispositivoInteligente persiana =
                new DispositivoInteligente("Persiana del living", false);

        hub.agregarDispositivo(foco);
        hub.agregarDispositivo(aire);
        hub.agregarDispositivo(persiana);

        foco.encender();
        aire.encender();

        hub.activarModoNoche();
    }
}
