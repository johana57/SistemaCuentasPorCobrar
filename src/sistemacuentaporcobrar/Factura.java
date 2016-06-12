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
public class Factura {
    private int idFactura;
    private int idCliente;
    private String fechaEmision;
    private float monto;

    public Factura(int idFactura, int idCliente, String fechaEmision, float monto) {
        this.idFactura = idFactura;
        this.idCliente = idCliente;
        this.fechaEmision = fechaEmision;
        this.monto = monto;
    }

    /**
     * @return the idFactura
     */
    public int getIdFactura() {
        return idFactura;
    }

    /**
     * @param idFactura the idFactura to set
     */
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the fechaEmision
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * @param fechaEmision the fechaEmision to set
     */
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * @return the monto
     */
    public float getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(float monto) {
        this.monto = monto;
    }
 
    
    
}
