package DemoGrafo;

public class Grafo {

    Nodo inicio;
    String nombre;
    String descripcion;

    public Grafo() {
        inicio=null;
    }

    public Grafo(String nombre) {
        this.nombre = nombre;
    }

    public Grafo(Nodo inicio) {
        this.inicio = inicio;
    }

    boolean vacio(){
        return inicio==null;
    }

    Nodo veUltimo(){
        if(!vacio()){
            Nodo temp=inicio;
            while(temp.sigHermano!=null){
                temp=temp.sigHermano;
            }
            return temp;
        }
        return null;
    }

    Nodo busca(String n){
        if(!vacio()){
            Nodo temp=inicio;
            while(temp.sigHermano!=null && temp.nombre.compareTo(n)!=0){
                temp=temp.sigHermano;
            }
            if(temp.nombre.compareTo(n)==0) {
                return temp;
            }
        }
        return null;
    }

    public void addNodo(String n){
        if(busca(n)==null) {
            Nodo temp = veUltimo();
            if (temp == null) {
                inicio = new Nodo(n);
            } else {
                temp.sigHermano = new Nodo(n);
            }
            System.out.println("Nodo: "+n+" Agregado");
        }
        else{
            System.out.println("Nodo: "+n+" Ya Existe");
        }
    }



    boolean addArista(String origen, String destino, int costo){
        Nodo o=busca(origen);
        Nodo d=busca(destino);
        if(o!=null && d!=null ){
            Arista temp=new Arista(costo,d);
            Arista Aristatemp=o.primeraArista;
            if(Aristatemp!=null) {
                while (Aristatemp.sigArista != null) {
                    Aristatemp = Aristatemp.sigArista;
                }
                Aristatemp.sigArista=temp;
            }
            else{
                o.primeraArista=temp;
            }
            return true;
        }
        else{
            return false;
        }


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append(nombre + "\n" );
        if(inicio!=null) {
            Nodo temp = inicio;
            sb.append(temp + "\n");
            while (temp.sigHermano != null) {
                    temp = temp.sigHermano;
                    sb.append(temp+ "\n");
            }
        }
        return sb.toString();
    }
}
