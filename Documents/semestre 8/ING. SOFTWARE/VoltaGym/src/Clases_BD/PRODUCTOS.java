/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_BD;

public class PRODUCTOS {
   private Integer idPRODUCTO;
 private String nombreProductos;
 private String presentacionProducto;
 private String marcaProductos;
 private Integer    precioProductos;
 private String codigoProductos;

    public PRODUCTOS(Integer idPRODUCTO, String nombreProductos, String presentacionProducto, String marcaProductos, Integer precioProductos, String codigoProductos) {
        this.idPRODUCTO = idPRODUCTO;
        this.nombreProductos = nombreProductos;
        this.presentacionProducto = presentacionProducto;
        this.marcaProductos = marcaProductos;
        this.precioProductos = precioProductos;
        this.codigoProductos = codigoProductos;
    }

    public PRODUCTOS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getIdPRODUCTO() {
        return idPRODUCTO;
    }

    public void setIdPRODUCTO(Integer idPRODUCTO) {
        this.idPRODUCTO = idPRODUCTO;
    }

    public String getNombreProductos() {
        return nombreProductos;
    }

    public void setNombreProductos(String nombreProductos) {
        this.nombreProductos = nombreProductos;
    }

    public String getPresentacionProducto() {
        return presentacionProducto;
    }

    public void setPresentacionProducto(String presentacionProducto) {
        this.presentacionProducto = presentacionProducto;
    }

    public String getMarcaProductos() {
        return marcaProductos;
    }

    public void setMarcaProductos(String marcaProductos) {
        this.marcaProductos = marcaProductos;
    }

    public Integer getPrecioProductos() {
        return precioProductos;
    }

    public void setPrecioProductos(Integer precioProductos) {
        this.precioProductos = precioProductos;
    }

    public String getCodigoProductos() {
        return codigoProductos;
    }

    public void setCodigoProductos(String codigoProductos) {
        this.codigoProductos = codigoProductos;
    }
  
 
 
}
