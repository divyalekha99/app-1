package com.example.sarjhu.procheque;

class ManualDetails {
    String Id;
    String date;
    String pay_name;
    String amount_words;
    Integer amount_num;
    Integer accno;
    Integer cheq;
    Integer micr;
    Integer brno;
    Integer two;

    public ManualDetails(String Id, String date, String pay_name, String amount_words, Integer amount_num, Integer accno, Integer cheq, Integer micr,Integer brno, Integer two)
    {
        this.Id = Id;
        this.date = date;
        this.pay_name = pay_name;
        this.amount_words = amount_words;
        this.amount_num = amount_num;
        this.accno = accno;
        this.cheq = cheq;
        this.micr = micr;
        this.brno = brno;
        this.two = two;
    }

    public String getId(){
        return Id;
    }

    public String getDate() {
        return date;
    }

    public String getPay_name() {
        return pay_name;
    }

    public String getAmount_words() {
        return amount_words;
    }

    public Integer getAmount_num() {
        return amount_num;
    }

    public Integer getAccno() {
        return accno;
    }

    public Integer getCheq() {
        return cheq;
    }

    public Integer getMicr() {
        return micr;
    }

    public Integer getBrno() {
        return brno;
    }

    public Integer getTwo() {
        return two;
    }

}
