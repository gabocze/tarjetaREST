package tarjetaop.tarjetarest;

import tarjetaOp.Marca;

public class TasaOperacionRes {
    private Marca marca;
    private float monto;
    private float tasa;
    
    public TasaOperacionRes(Marca marca, float monto, float tasa) {
        this.marca = marca;
        this.monto = monto;
        this.tasa = tasa;
    }

    public Marca getMarca() {
        return marca;
    }
    public float getMonto() {
        return monto;
    }
    public float getTasa() {
        return tasa;
    }
}
