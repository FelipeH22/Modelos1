package singleton;

public class persona {
    private static persona instancia;
    
    private persona(){
    }
    
    public static persona getInstancia(){
        if(instancia == null)
        {
            instancia = new persona();
            System.out.println("Persona creada");
        }
        else
        {
            System.out.println("Ya existe un objeto");
        }
        return instancia;
    }
}
