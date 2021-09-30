package ch.heigvd.res.chill.domain.lothindir;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CeNEstPasLaFinDuMondeTest {
    @Test
    void thePriceAndNameForCeNEstPasLaFinDuMondeShouldBeCorrect() {
        CeNEstPasLaFinDuMonde beer = new CeNEstPasLaFinDuMonde();
        assertEquals(beer.getName(), CeNEstPasLaFinDuMonde.NAME);
        assertEquals(beer.getPrice(), CeNEstPasLaFinDuMonde.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCeNEstPasLaFinDuMonde() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.lothindir.CeNEstPasLaFinDuMonde";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = CeNEstPasLaFinDuMonde.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
