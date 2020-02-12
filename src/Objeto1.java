/**
 * 
 * @author danielmesa
 */
public class Objeto1 {
    /**
     *  Se declara la variable saldo (int)
     */
    private int saldo= 0;
    /**
     * Se declara la clase "Introducir" que no devuelve nada al declararla, y se le introduce la cantidad de saldo a incrementar
     * @param cantidadIncrementar 
     */
    public void introducir(int cantidadIncrementar){
        /**
         * Tras recibir la cantidad a incrementar, se irá sumando dicha cifra nueva a la variable saldo
         */
        saldo+=cantidadIncrementar;
    }
    /**
     * Se declara la clase "Sacar" que no devuelve nada al declararla, y se le introduce la cantidad de saldo a desincrementar
     * @param cantidadDesincrementar 
     */
    public void sacar(int cantidadDesincrementar){
        /**
         * Tras recibir la cantidad a desincrementar, depende de si el saldo a desicrementar es mayor o menor al saldo de la cuenta, ocurrirá el if o else
         */
        if(cantidadDesincrementar<=saldo){
            /**
             * Si la cantidad a desincrementar es menor o igual al saldo actual, se desincrementará con éxito
             */
            saldo-=cantidadDesincrementar;
        }
        else{
            /**
             * Si la cantidad a desincrementar mayor al saldo actual, saltará el mensaje de "Saldo insuficiente" y no se realizará cambios en la variable saldo
             */
            System.out.println("Saldo insuficiente");
        }
    }
    /**
     * Se declara la clase informar que no devolverá nada ni se le introduce variables
     */
    public void informar(){
        /**
         * Tras declarar la clase, saldrá por pantalla el mensaje del saldo actual que se encuentra en la variable "Saldo"
         */
        System.out.println("Su saldo es: "+saldo);
    }

    public static void main(String[] args) {
        /**
         * Se declara la clase miHucha usando como cuerpo la clase "Objeto1"
         * Donde saldo=0
         */
        Objeto1 miHucha= new Objeto1();
        /**
         * Se usa la clase introducir, para añadir 50 a saldo
         * saldo=50
         */
        miHucha.introducir(50);
        /**
         * Se usa la clase sacar, para desincrementar 20 al saldo
         * saldo=30
         */
        miHucha.sacar(20);
        /**
         * Se usa la clase informar, para notificar del saldo actual.
         * mensaje: saldo=30
         */
        miHucha.informar();
    }
    
}
