package com.maxhayday.cw.cw03.design_patterns;

public class DistributionService {
    public void sendMail(){
        //int mailCode = DBUtils.getMailCode();
        Codes.getByCode(DBUtils.getMailCode()).getHandler().getCode();
    }
}
