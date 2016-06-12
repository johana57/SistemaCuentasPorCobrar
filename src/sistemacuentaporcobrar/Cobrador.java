/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacuentaporcobrar;

/**
 *
 * @author hshome
 */
public class Cobrador {
    
    private String nombreCobrador;
    private String apellidoCobrador;
    private String cedulaCobrador;
    private String direccioCobrador;

    public Cobrador(String nombreCobrador, String apellidoCobrador, String cedulaCobrador, String direccioCobrador) {
        this.nombreCobrador = nombreCobrador;
        this.apellidoCobrador = apellidoCobrador;
        this.cedulaCobrador = cedulaCobrador;
        this.direccioCobrador = direccioCobrador;
    }

    /**
     * @return the nombreCobrador
     */
    public String getNombreCobrador() {
        return nombreCobrador;
    }

    /**
     * @param nombreCobrador the nombreCobrador to set
     */
    public void setNombreCobrador(String nombreCobrador) {
        this.nombreCobrador = nombreCobrador;
    }

    /**
     * @return the apellidoCobrador
     */
    public String getApellidoCobrador() {
        return apellidoCobrador;
    }

    /**
     * @param apellidoCobrador the apellidoCobrador to set
     */
    public void setApellidoCobrador(String apellidoCobrador) {
        this.apellidoCobrador = apellidoCobrador;
    }

    /**
     * @return the cedulaCobrador
     */
    public String getCedulaCobrador() {
        return cedulaCobrador;
    }

    /**
     * @param cedulaCobrador the cedulaCobrador to set
     */
    public void setCedulaCobrador(String cedulaCobrador) {
        this.cedulaCobrador = cedulaCobrador;
    }

    /**
     * @return the direccioCobrador
     */
    public String getDireccioCobrador() {
        return direccioCobrador;
    }

    /**
     * @param direccioCobrador the direccioCobrador to set
     */
    public void setDireccioCobrador(String direccioCobrador) {
        this.direccioCobrador = direccioCobrador;
    }
    
    
}
