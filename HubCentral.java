
    import java.util.ArrayList;
import java.util.List;

    public class HubCentral {

        private List<DispositivoInteligente> dispositivos;

        public HubCentral() {
            dispositivos = new ArrayList<>();
        }

        public void agregarDispositivo(DispositivoInteligente dispositivo) {
            dispositivos.add(dispositivo);
            System.out.println("Dispositivo agregado: " + dispositivo.getNombre());
        }

        public void activarModoNoche() {
            System.out.println("\n=== ACTIVANDO MODO NOCHE ===");

            for (DispositivoInteligente dispositivo : dispositivos) {

                if (dispositivo.isConectado()) {
                    dispositivo.apagar();
                    dispositivo.configurar("modo noche");
                } else {
                    System.out.println(dispositivo.getNombre()
                            + ": desconectado. Se omiten los comandos.");
                }
            }

            System.out.println("=== RUTINA FINALIZADA ===");
        }
    }

