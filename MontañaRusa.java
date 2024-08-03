public class MontañaRusa {
    public class MontañaRusa extends Atraccion implements Mantenimiento {
        private String intensidad;

        // Constructor
        public MontañaRusa(String nombre, int capacidadMaxima, int duracion, String intensidad) {
            super(nombre, capacidadMaxima, duracion);
            this.intensidad = intensidad;
        }

        // Métodos getters y setters
        public String getIntensidad() {
            return intensidad;
        }

        public void setIntensidad(String intensidad) {
            this.intensidad = intensidad;
        }

        // Método abstracto
        @Override
        public void iniciar() {
            System.out.println("La montaña rusa está en marcha");
        }

        // Métodos de la interfaz
        @Override
        public void realizarMantenimiento() {
            System.out.println("Realizando mantenimiento en la montaña rusa");
        }

        @Override
        public boolean estadoMantenimiento() {
            // Ejemplo simple: se necesita mantenimiento si la intensidad es "alta"
            return "alta".equals(intensidad);
        }

        // Método adicional
        public void aumentarIntensidad() {
            if ("baja".equals(intensidad)) {
                intensidad = "media";
            } else if ("media".equals(intensidad)) {
                intensidad = "alta";
            }
            System.out.println("Intensidad actual: " + intensidad);
        }
    }

}
