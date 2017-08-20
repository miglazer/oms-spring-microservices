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
        this.setId(id);
        return this;
    }

    public Account withTraderId(String traderId){
        this.setTraderId(traderId);
        return this;
    }

    public Account withOrderype(String orderType){
        this.setOrderType(orderType);
        return this;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTraderId(String traderId) {
        this.traderId = traderId;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
