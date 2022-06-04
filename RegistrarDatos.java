public class RegistrarDatos {
    String[] vector;
    protected int indiceVector;

    public RegistrarDatos() {
        this.vector = new String[5];
        this.indiceVector = 0;
    }

    public void registrarDatos(String departamento ,String municipios, String cabecera ) {
        this.vector[indiceVector] = "Departamento: "+departamento + " --> "+ "Numero de municipios: " + municipios + " --> " + "Cabecera Departamental: " +  cabecera;

        this.indiceVector = this.indiceVector + 1;

    }
    public void mostrarDatos() {

        for(int i=0; i<this.vector.length; i++){
            if(this.vector[i]!=null){
                System.out.println(vector[i]);
            }
        }


    }

}
