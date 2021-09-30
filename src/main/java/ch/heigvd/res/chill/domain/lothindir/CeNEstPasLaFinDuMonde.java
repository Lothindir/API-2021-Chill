package ch.heigvd.res.chill.domain.lothindir;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class CeNEstPasLaFinDuMonde implements IProduct {

    public final static String NAME = "Ce n'est pas La Fin du Monde ";
    public final static BigDecimal PRICE = new BigDecimal(4.6);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}