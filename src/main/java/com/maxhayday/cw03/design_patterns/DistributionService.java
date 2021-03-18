package com.maxhayday.cw03.design_patterns;

public class DistributionService {
    public void sandMail(){
        //int mailCode = DBUtils.getMailCode();
        Codes.getByCode(DBUtils.getMailCode()).getHandler().getCode();
    }
}
