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
public class Cliente {  
    private int IdCliente;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApelido;
    private String cedulaCliente;
    private Cobrador cobrador;

    public Cliente(int IdCliente, String primerNombre, String segundoNombre, String primerApellido, String segundoApelido, String cedulaCliente, Cobrador cobrador) {
        this.IdCliente = IdCliente;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApelido = segundoApelido;
        this.cedulaCliente = cedulaCliente;
        this.cobrador = cobrador;
    }

    @Override
    public String toString() {
        return primerNombre + " " + primerApellido + " " + cedulaCliente;
    }
    
    
    
}
