package tarjetaop.tarjetarest;

import java.time.LocalDate;

import tarjetaOp.Marca;

public class TasaOperacionReq {
    private Marca marca;
    private float monto;
    private LocalDate fecha;
    
    public TasaOperacionReq(Marca marca, float monto, LocalDate localDate) {
        this.marca = marca;
        this.monto = monto;
        this.fecha = localDate;
    }
    public Marca getMarca() {
        return marca;
    }
    public float getMonto() {
        return monto;
    }
    public LocalDate getFecha() {
        return fecha;
    }

}
