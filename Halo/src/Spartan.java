import java.util.Scanner;

public class Spartan {
    //atributos del spartan

    public String nombre;
    int salud;
    int escudo;
    String arma_principal;

    //Metodos del Spartan

    public void mostrar_info(){
        System.out.println("--------Informacion del Spartan-------");
        System.out.println("nombre:" + nombre);
        System.out.println("Salud:" + salud);
        System.out.println("Escudo:" + escudo);
        System.out.println("Arma Principal:" + arma_principal);
        System.out.println("----------------------------------------------------");
    }
        public void Atacar(String enemigo){
            System.out.println(nombre + "atacar a" + enemigo +"con" + arma_principal);
        
        }
        public void Recargar_arma (int municiones){
         int restante = 10;
         int total = restante + municiones;
         System.out.println("El arma esta recargada " + arma_principal + "tiene" + total + "balas");
          
        }  
        public void Correr (boolean status){
            if (status){
                System.out.println("El Spartan" + nombre + "Esta corriendo");
                System.out.println("El Spartan" + nombre + "Se detuvo");
            }

        }


    }// llave clase 


