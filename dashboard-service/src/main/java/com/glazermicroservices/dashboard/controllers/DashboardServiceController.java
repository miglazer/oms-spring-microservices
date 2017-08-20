package src.main.java.com.glazermicroservices.dashboard.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.main.java.com.glazermicroservices.dashboard.model.Account;

/**
 * Created by michaelglazer on 8/19/17.
 */
@RestController
@RequestMapping(value="/v1/accounts/{accountId}/dashboardcomponents")
public class DashboardServiceController {

    @RequestMapping(value = "/{accountId}", method = RequestMethod.GET)
    public Account getAccounts(
            @PathVariable("accountId") String id,
            @PathVariable("traderId") String traderId) {

        return new Account()
                .withAccountId("1")
                .withOrderype("Equity")
                .withTraderId("aTrader");

    }

}
