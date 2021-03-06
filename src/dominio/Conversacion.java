package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public final class Conversacion implements Serializable {

    private ArrayList<InformacionMensaje> listaMensajes;
    public Persona usuario;
    public Persona profesional;
    private boolean fueAtendidaConsulta;

    public Conversacion(Persona user, Persona pr, ArrayList<InformacionMensaje> lista) {
        setUsuario(user);
        setProfesional(pr);
        setListaMensajes(lista);
        setFueAtendidaConsulta(false);
    }
    
    public Conversacion(){
        this.listaMensajes = new ArrayList<InformacionMensaje>();
        this.usuario = new Persona();
        this.profesional = new Persona();
        this.fueAtendidaConsulta = false;
    }
    
    public Conversacion(Persona usuario, Persona profesional){
        this.listaMensajes = new ArrayList<InformacionMensaje>();
        this.usuario = usuario;
        this.profesional = profesional;
        this.fueAtendidaConsulta = false;
    }

    public boolean getFueAtendidaConsulta() {
        return fueAtendidaConsulta;
    }

    public void setFueAtendidaConsulta(boolean fueAtendida) {
        this.fueAtendidaConsulta = fueAtendida;
    }

    public ArrayList<InformacionMensaje> getListaMensajes() {
        return this.listaMensajes;
    }

    public void setListaMensajes(ArrayList<InformacionMensaje> lista) {
        if (lista == null || lista.isEmpty()) {
            this.listaMensajes = new ArrayList<>();
        } else {
            this.listaMensajes = lista;
        }
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona unUsuario) {
        this.usuario = unUsuario;
    }

    public Persona getProfesional() {
        return this.profesional;
    }

    public void setProfesional(Persona unProfesional) {
        this.profesional = unProfesional;
    }

    public boolean agregarMensaje(String mensaje, boolean intercambioRemitente) {
        InformacionMensaje informacion = new InformacionMensaje(getUsuario().getNombreCompleto(), getProfesional().getNombreCompleto(), mensaje);
        if (intercambioRemitente) {
            informacion.intercambiarRemitente();
        }
        listaMensajes.add(informacion);
        boolean agregueMensaje = true;
        return agregueMensaje;
    }

    @Override
    public boolean equals(Object obj) {
        final Conversacion conversacionParametro = (Conversacion) obj;
        return getProfesional().equals(conversacionParametro.getProfesional())
                && getUsuario().equals(conversacionParametro.getUsuario());
    }

    @Override
    public String toString() {
        String retorno = "Inicio de conversacion";
        if (!getListaMensajes().isEmpty()) {
            retorno = "";
            retorno = listaMensajes.stream().map((InformacionMensaje info) -> "\n" + info.getRemitente() + "\n"
                    + info.getMensaje() + "\n").reduce(retorno, String::concat);
        }
        return retorno;
    }

}
