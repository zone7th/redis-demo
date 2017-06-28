/**
 * <p>
 * Copyright(c) @2016 TIANPING AUTO INSURANCE CO.,LTD.
 * </p>
 */
package priv.rlliu.redis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * description:控制层
 * </p>
 * 
 * @author ex_liuruili
 * @since 2016年7月25日
 * @see
 */
@Controller
@RequestMapping("/redis")
public class RedisController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
