package src.main.java.com.glazermicroservices.dashboard.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by michaelglazer on 8/19/17.
 */
@Data
@RequiredArgsConstructor
public class Account {

    private String id;
    private String traderId;
    private String orderType;

    public Account withAccountId(String id){
        //this(id);
        return this;
    }

    public Account withTraderId(String traderId){
        //this.setProductName(traderId);
        return this;
    }

    public Account withOrderype(String orderType){
        //this.setLicenseType(licenseType);
        return this;
    }

}
