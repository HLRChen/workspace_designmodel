package com.hlrchen.demo.design;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrizeController {

    private static final Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq req){

        String reqJson = JSON.toJSONString(req);
        AwardRes awardRes = null;
        try{
            logger.info("奖品发放开始{},req:{}",req.getUid(),reqJson);
            if(req.getAwardType() == 1){
                new Cou
            }
        }catch(Exception e){

        }


    }

}
