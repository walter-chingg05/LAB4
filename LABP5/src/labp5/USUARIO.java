/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labp5;

/**
 *
 * @author walle
 */
public class USUARIO {
    
    public int Id;
   public String Nombre;
   public String Semestre;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Semestre
     */
    public String   getSemestre() {
        return Semestre;
    }

    /**
     * @param Semestre the Semestre to set
     */
    public void setSemestre(String  Semestre) {
        this.Semestre = Semestre;
    }
   
    
}
