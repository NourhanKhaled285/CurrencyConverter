package com.example.currencyconverter;

public class converter {

     private float currency;

    public converter(float currency) {
        this.currency = currency;
    }

    public converter() {
    }

    public void setCurrency(float currency) {
        this.currency = currency;
    }

    public float getCurrency() {
        return currency;
    }

    public float convert_dollar_to_pound(){
          float conv_cur=getCurrency();
                 conv_cur*=15.69f;

//        float conv_cur=currency*15.69f;
        return conv_cur;
    }

    public float convert_pound_to_dollar(){
        float conv_cur=getCurrency();
              conv_cur/=15.69f;

//        float conv_cur=currency/15.69f;
        return conv_cur;
    }
}
