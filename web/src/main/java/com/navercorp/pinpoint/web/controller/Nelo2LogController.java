package com.navercorp.pinpoint.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yushuqiang on 2016/3/21.
 */
@Controller
public class Nelo2LogController {

    @RequestMapping(value = "/translog")
    public String NeloLogForTransactionId(@RequestParam (value= "transactionId", required=true) String transactionId,
                                          @RequestParam(value= "spanId" , required=false) String spanId,
                                          @RequestParam(value="time" , required=true) long time ) {

        // you should implement the logic to retrieve your agent’s logs.
        return "";
    }

}
