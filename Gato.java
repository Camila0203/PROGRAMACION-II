public class Gato {
    public class Gato extends Animal implements Alimentable {

        // Constructor
        public Gato(String nombre, int edad) {
            super(nombre, edad);
        }

        @Override
        public void hacerSonido() {
            System.out.println("El gato maúlla");
        }

        @Override
        public void comer() {
            System.out.println("El animal está comiendo");
        }

        @Override
        public void beber() {
            System.out.println("El animal está bebiendo");
        }
    }
}
