package pe.edu.unmsm.urcs.modelo;
// Generated 29/06/2015 02:00:34 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private Perfil perfil;
     private String correo;
     private String pass;
     private String nombre;
     private String apellido;
     private String anexo;
     private int oficinaIdOficina;
     private Set<Solicitud> solicituds = new HashSet<Solicitud>(0);

    public Usuario() {
    }

	
    public Usuario(Perfil perfil, int oficinaIdOficina) {
        this.perfil = perfil;
        this.oficinaIdOficina = oficinaIdOficina;
    }
    public Usuario(Perfil perfil, String correo, String pass, String nombre, String apellido, String anexo, int oficinaIdOficina, Set<Solicitud> solicituds) {
       this.perfil = perfil;
       this.correo = correo;
       this.pass = pass;
       this.nombre = nombre;
       this.apellido = apellido;
       this.anexo = anexo;
       this.oficinaIdOficina = oficinaIdOficina;
       this.solicituds = solicituds;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getAnexo() {
        return this.anexo;
    }
    
    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
    public int getOficinaIdOficina() {
        return this.oficinaIdOficina;
    }
    
    public void setOficinaIdOficina(int oficinaIdOficina) {
        this.oficinaIdOficina = oficinaIdOficina;
    }
    public Set<Solicitud> getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set<Solicitud> solicituds) {
        this.solicituds = solicituds;
    }




}

