/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.payment.business.client;

import org.springframework.stereotype.Component;
import rocks.process.payment.business.domain.Customer;

@Component
public class CustomerServiceClient {
    public Customer retrieveCustomerById(Long customerId) {
        throw new UnsupportedOperationException();
    }

    public void editLoyaltyBalance(Customer customer) {
    }
}
