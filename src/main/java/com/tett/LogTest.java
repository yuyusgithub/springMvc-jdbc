package com.tett;

import org.apache.log4j.Logger;

/**
 * Created by yuyu on 2016/11/4.
 */
public class LogTest extends Thread{
    Logger logger = Logger.getLogger("D");
    @Override
    public void run() {
        for(int i = 0 ; i < 1000 ; i++){
            logger.error(i+"");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.error("???");
            }
        }
    }
}
