package com.maxhayday.cw.cw03.design_patterns_by_evgeniy;

import com.maxhayday.cw.cw03.design_patterns.Codes;
import com.maxhayday.cw.cw03.design_patterns.DBUtils;

public class DistributionService {
    public void sandMail(){
        //int mailCode = DBUtils.getMailCode();
        Codes.getByCode(DBUtils.getMailCode()).getHandler().getCode();
    }
}
