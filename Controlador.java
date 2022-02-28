public class Controlador{
    public static void main(String[] args){
        Vista vista;
        boolean terminado = false;
        while(!terminado){
            vista = new Vista();
            if(vista.input().toLowerCase().equals("exit")){
                terminado = true;
            }

        }
        
    }
}