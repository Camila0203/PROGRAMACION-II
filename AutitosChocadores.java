public class AutitosChocadores {
    public class AutitosChocadores extends Atraccion implements Mantenimiento {
        private int numeroDeAutitos;

        // Constructor
        public AutitosChocadores(String nombre, int capacidadMaxima, int duracion, int numeroDeAutitos) {
            super(nombre, capacidadMaxima, duracion);
            this.numeroDeAutitos = numeroDeAutitos;
        }

        // Métodos getters y setters
        public int getNumeroDeAutitos() {
            return numeroDeAutitos;
        }

        public void setNumeroDeAutitos(int numeroDeAutitos) {
            this.numeroDeAutitos = numeroDeAutitos;
        }

        // Método abstracto
        @Override
        public void iniciar() {
            System.out.println("Los autitos chocadores están en marcha");
        }

        // Sobrecarga del método iniciar
        public void iniciar(int numeroAutitosEnFuncionamiento) {
            System.out.println("Los autitos chocadores están en marcha con " + numeroAutitosEnFuncionamiento + " autitos en funcionamiento");
        }

        // Métodos de la interfaz
        @Override
        public void realizarMantenimiento() {
            System.out.println("Realizando mantenimiento en los autitos chocadores");
        }

        @Override
        public boolean estadoMantenimiento() {
            // Ejemplo simple: se necesita mantenimiento si hay menos de 5 autitos
            return numeroDeAutitos < 5;
        }
    }

}
