package pe.edu.unmsm.urcs.modelo;
// Generated 11/07/2015 09:19:57 PM by Hibernate Tools 4.3.1



/**
 * Opcion generated by hbm2java
 */
public class Opcion  implements java.io.Serializable {


     private Integer idOpcion;
     private Perfil perfil;
     private String descripcion;

    public Opcion() {
    }

	
    public Opcion(Perfil perfil) {
        this.perfil = perfil;
    }
    public Opcion(Perfil perfil, String descripcion) {
       this.perfil = perfil;
       this.descripcion = descripcion;
    }
   
    public Integer getIdOpcion() {
        return this.idOpcion;
    }
    
    public void setIdOpcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


