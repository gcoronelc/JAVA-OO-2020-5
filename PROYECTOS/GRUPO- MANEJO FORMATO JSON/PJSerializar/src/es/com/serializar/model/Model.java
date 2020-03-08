package es.com.serializar.model;

public class Model {
    private String Nombre;
    private String APaterno;
    private String AMaterno;
    private int CantAlumnos;
    private float Nota;
    private boolean Aprobado;
    
    public Model(String Nombre, String APaterno, String AMaterno, int CantAlumnos, float Nota, boolean Aprobado) {
        this.Nombre = Nombre;
        this.APaterno = APaterno;
        this.AMaterno = AMaterno;
        this.CantAlumnos = CantAlumnos;
        this.Nota = Nota;
        this.Aprobado = Aprobado;
              
    }

    public Model() {
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAPaterno() {
        return APaterno;
    }

    public void setAPaterno(String APaterno) {
        this.APaterno = APaterno;
    }

    public String getAMaterno() {
        return AMaterno;
    }

    public void setAMaterno(String AMaterno) {
        this.AMaterno = AMaterno;
    }

    public int getCantAlumnos() {
        return CantAlumnos;
    }

    public void setCantAlumnos(int CantAlumnos) {
        this.CantAlumnos = CantAlumnos;
    }

    public float getNota() {
        return Nota;
    }

    public void setNota(float Nota) {
        this.Nota = Nota;
    }

    public boolean isAprobado() {
        return Aprobado;
    }

    public void setAprobado(boolean Aprobado) {
        this.Aprobado = Aprobado;
    }
    
    
    
}
