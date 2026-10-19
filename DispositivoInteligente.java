public class DispositivoInteligente {

    private String nombre;
    private boolean conectado;
    private boolean encendido;

    public DispositivoInteligente(String nombre, boolean conectado) {
        this.nombre = nombre;
        this.conectado = conectado;
        this.encendido = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void encender() {
        if (!conectado) {
            System.out.println(nombre + ": desconectado. No se puede encender.");
            return;
        }

        encendido = true;
        System.out.println(nombre + ": encendido.");
    }

    public void apagar() {
        if (!conectado) {
            System.out.println(nombre + ": desconectado. No se puede apagar.");
            return;
        }

        encendido = false;
        System.out.println(nombre + ": apagado.");
    }

    public void configurar(String parametro) {
        if (!conectado) {
            System.out.println(nombre + ": desconectado. No se puede configurar.");
            return;
        }

        System.out.println(nombre + ": configurado en " + parametro + ".");
    }
}