import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // creamos objeto
Spartan jefe_maestro = new Spartan();
Spartan reach = new Spartan();

jefe_maestro.nombre = "john pepetoro";
jefe_maestro.salud=100;
jefe_maestro.escudo=98;
jefe_maestro.arma_principal="AK 47";

//Usar sus metodos
jefe_maestro.mostrar_info();
jefe_maestro.Atacar( "Elite");
jefe_maestro.Recargar_arma(65);
jefe_maestro.Correr(true);

reach.nombre = "emilia";
reach.salud=0;
reach.escudo=0;
reach.arma_principal="Mp5";

reach.mostrar_info();
reach.Atacar( "Elite");
reach.Recargar_arma(65);
reach.Correr(true);

    }

}