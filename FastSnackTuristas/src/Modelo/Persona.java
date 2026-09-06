package Modelo;

/**
 *
 * @author fl1pc08
 */

public abstract class Persona implements InterfacecPersona {

    protected String nombre;
    protected String telefono;
    // Si tu diagrama usa apellido, puedes activarlo:
    // protected String apellido;

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public abstract void accederCliente();
}