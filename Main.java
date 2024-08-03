public class Main {
    public static void main(String[] args) {
        // Crear instancias de las atracciones
        MontañaRusa montañaRusa = new MontañaRusa("Montaña Rusa A", 30, 5, "media");
        Noria noria = new Noria("Noria B", 40, 10, 55);
        AutitosChocadores autitosChocadores = new AutitosChocadores("Autitos Chocadores C", 20, 7, 6);

        // Llamar a los métodos
        montañaRusa.iniciar();
        montañaRusa.detenir();
        montañaRusa.realizarMantenimiento();
        System.out.println("¿Necesita mantenimiento? " + montañaRusa.estadoMantenimiento());
        montañaRusa.aumentarIntensidad();

        noria.iniciar();
        noria.detenir();
        noria.realizarMantenimiento();
        System.out.println("¿Necesita mantenimiento? " + noria.estadoMantenimiento());

        autitosChocadores.iniciar();
        autitosChocadores.iniciar(10);
        autitosChocadores.detenir();
        autitosChocadores.realizarMantenimiento();
        System.out.println("¿Necesita mantenimiento? " + autitosChocadores.estadoMantenimiento());
    }
}
