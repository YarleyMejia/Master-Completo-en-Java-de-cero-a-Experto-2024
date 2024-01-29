package org.ycmejia.POO.proyectoFactura.Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int codigoFactura;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] itemsFactura;
    private int indiceItems;
    public static final int MAX_ITEMS = 100;//cantidadde tipos de productos comprados
    private static int ultimoFolio;


    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.itemsFactura = new ItemFactura[MAX_ITEMS];
        this.codigoFactura = ++ultimoFolio;
        this.fecha = new Date();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ItemFactura[] getItemsFactura() {
        return itemsFactura;
    }

    public void addItemFactura(ItemFactura itemFactura) {
        if (indiceItems < MAX_ITEMS) {
            this.itemsFactura[indiceItems++] = itemFactura;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : this.itemsFactura) {
            if (item == null) {
                continue;
            }
            total += item.calcularValorParcial();
        }
        return total;
    }

    public String generarDetalleFactura() {//construimos la factura
        StringBuilder cadena = new StringBuilder("FACTURA No.: ");
        cadena.append(codigoFactura)
                .append("\nCLIENTE: ")
                .append(this.cliente.getNombre())
                .append("\t NIT: ")
                .append(cliente.getNit())
                .append("\nDESCRIPCION: ")
                .append(this.descripcion)
                .append("\n");
        SimpleDateFormat formatoFecha= new SimpleDateFormat(" dd 'de ' MMMM, 'del 'yyyy'->HORA:'HH:MM:ss");
        cadena.append("Fecha de emision: ").append(formatoFecha.format(this.fecha))
                .append("\n")
                .append("\nITEM  \t NOMBRRE \t $ \t CANTIDAD \t VALOR PARCIAL: \n");



        for( ItemFactura item: this.itemsFactura){
            if (item==null){
                continue;

                // en el video 169 muestra como cambiar todo esto por un metodo toString

            }
            cadena.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularValorParcial())
                    .append("\n");
        }
        cadena.append("\n TOTAL A PAGAR: ")
                .append(calcularTotal());
        return cadena.toString();
    }

}


