package models;

public class Contacto {
    private String nombre;
    private String apelldio;
    private String telefono;

    public Contacto(String nombre, String apelldio, String telefono) {
        this.nombre = nombre;
        this.apelldio = apelldio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApelldio() {
        return apelldio;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return nombre + " " + apelldio + " - " + telefono;
    }

    //@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apelldio == null) ? 0 : apelldio.hashCode());
        result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
        return result;
    }

    //@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contacto other = (Contacto) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apelldio == null) {
            if (other.apelldio != null)
                return false;
        } else if (!apelldio.equals(other.apelldio))
            return false;
        if (telefono == null) {
            if (other.telefono != null)
                return false;
        } else if (!telefono.equals(other.telefono))
            return false;
        return true;
    }

    
    
}
