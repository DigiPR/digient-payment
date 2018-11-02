/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.payment.business.client;

import org.springframework.stereotype.Component;
import rocks.process.payment.business.domain.Amount;
import rocks.process.payment.business.domain.CardTransaction;

@Component
public class PaymentServiceProviderClient {
    public CardTransaction chargeCreditCard(Amount amount, String cardNumber, String securityCode) {
        throw new UnsupportedOperationException();
    }
}
