//package taller.sofka.e16;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class Persona {
//
//
//    String nombre;
//    int edad;
//    String dni;
//    enum Genero {H,M}
//    double  peso;
//    double altura;
//    //Constructor
//
//    public Persona(){
//        nombre = "";
//        edad = 0;
//        dni = "";
//        Genero genero = Persona.Genero.M;
//        peso = 0;
//        altura = 0;
//
//    }
//
//    public Persona(String nombre; int edad; ){
//
//    }
//
//    public Persona(){
//
//    }
//
//    //Metodos
//
//    public void opcionMenu() {
//
//        boolean continuar = false;
//
//        do{
//            try{
//                continuar = false;
//                System.out.println(display_menu);
//                System.out.println("Ingrese un numero del menu ");
//                opcion = Integer.parseInt(buffer.readLine());
//            }catch(Exception e){
//                continuar = true;
//            }
//
//            if( opcion < 1 || opcion > 8 ){
//                System.out.println("OPCION INCORRECTA");
//                continuar = true;
//            }
//
//        }while(continuar);
//
//        if( opcion == 8){
//            System.out.println("Programa terminado");
//            System.exit(0);
//        }
//
//        opcionMenu();
//
//    }
//}
//
//
