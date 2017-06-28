/**
 *<p>
 * Copyright(c) @2016 
 * TIANPING AUTO INSURANCE CO.,LTD. 
 *</p>
 */
package priv.rlliu.redis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import priv.rlliu.redis.service.PersonServiceImpl;

/**
 *<p>
 *description:redis测试类
 *</p>
 * @author ex_liuruili
 * @since 2016年9月21日
 * @see 
 */
public class RedisTest {
    
    @Test
    public void addPerson(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("redis-servlet.xml");
        PersonServiceImpl personService = (PersonServiceImpl) ctx.getBean("personService");
        personService.addPerson();
        
    }
    
    @Test
    public void getPerson(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("redis-servlet.xml");
        PersonServiceImpl personService = (PersonServiceImpl) ctx.getBean("personService");
        personService.getPerson();
    }
}
