public class Noria {
    public class Noria extends Atraccion implements Mantenimiento {
        private int alturaMaxima;

        // Constructor
        public Noria(String nombre, int capacidadMaxima, int duracion, int alturaMaxima) {
            super(nombre, capacidadMaxima, duracion);
            this.alturaMaxima = alturaMaxima;
        }

        // Métodos getters y setters
        public int getAlturaMaxima() {
            return alturaMaxima;
        }

        public void setAlturaMaxima(int alturaMaxima) {
            this.alturaMaxima = alturaMaxima;
        }

        // Método abstracto
        @Override
        public void iniciar() {
            System.out.println("La noria está girando");
        }

        // Métodos de la interfaz
        @Override
        public void realizarMantenimiento() {
            System.out.println("Realizando mantenimiento en la noria");
        }

        @Override
        public boolean estadoMantenimiento() {
            // Ejemplo simple: se necesita mantenimiento si la altura es mayor a 50 metros
            return alturaMaxima > 50;
        }
    }

}
