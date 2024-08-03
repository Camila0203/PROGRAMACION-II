public class Perro {
    public class Perro extends Animal implements Alimentable {

        // Constructor
        public Perro(String nombre, int edad) {
            super(nombre, edad);
        }

        @Override
        public void hacerSonido() {
            System.out.println("El perro ladra");
        }

        @Override
        public void comer() {
            System.out.println("El animal está comiendo");
        }

        @Override
        public void beber() {
            System.out.println("El animal está bebiendo");
        }

        // Sobrecarga de métodos hacerTruco
        public void hacerTruco() {
            System.out.println("El perro está haciendo un truco");
        }

        public void hacerTruco(String nombreTruco) {
            System.out.println("El perro está haciendo el truco: " + nombreTruco);
        }
    }

}
