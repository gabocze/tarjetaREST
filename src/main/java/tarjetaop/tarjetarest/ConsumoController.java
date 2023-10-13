package tarjetaop.tarjetarest;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tarjetaOp.CardBasicOp;
import tarjetaOp.ConsumoService;
import tarjetaOp.Marca;

@RestController
public class ConsumoController {
    @GetMapping
    @RequestMapping(path="/consumo")
    public TasaOperacionRes consultarTasa(@RequestParam Marca marca, @RequestParam float monto, @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) Date fecha) {
        LocalDate localDate = fecha.toInstant().atZone(ZoneOffset.UTC).toLocalDate();
        TasaOperacionReq req = new TasaOperacionReq(marca, monto, localDate);
        float tasa = new CardBasicOp(new ConsumoService()).calcularTasa(req.getMarca(), req.getMonto(), req.getFecha());

        return new TasaOperacionRes(req.getMarca(), req.getMonto(), tasa);
 
    }
}