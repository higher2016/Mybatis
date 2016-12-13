package com.jm.model;

public class TestView {
    private Long id;

    private Long money;

    private Long uu;

    private Long hu;
    
    @Override
    public String toString(){
    	return "id:"+this.id+"  "+"money:"+this.money+"  "+"uu:"+this.uu+"  "+"hu:"+this.hu+"  ";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Long getUu() {
        return uu;
    }

    public void setUu(Long uu) {
        this.uu = uu;
    }

    public Long getHu() {
        return hu;
    }

    public void setHu(Long hu) {
        this.hu = hu;
    }
}