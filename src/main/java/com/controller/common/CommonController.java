package com.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yuyu on 2016/12/20.
 */
@Controller
public class CommonController {

    @RequestMapping("/tomutipart")
    public String toMultipart(){
        return "/multipart";
    }

}
