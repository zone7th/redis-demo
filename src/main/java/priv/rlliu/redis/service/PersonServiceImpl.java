/**
 *<p>
 * Copyright(c) @2016 
 * TIANPING AUTO INSURANCE CO.,LTD. 
 *</p>
 */
package priv.rlliu.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import priv.rlliu.redis.model.Person;

/**
 *<p>
 *description:
 *</p>
 * @author ex_liuruili
 * @since 2016年9月21日
 * @see 
 */
@Service("personService")
public class PersonServiceImpl implements IPersonService{
    
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /* 
     * @see priv.rlliu.redis.service.IPersonService#addPerson()
     */
    @Override
    public void addPerson() {
        Person person = new Person("GTX", 1080);
        //序列化有这几种：StringRedisTemplate JdkSerializationRedisSerializer FastJson JackJson..
        //推荐使用JSON格式或者JDK格式
        String personString = JSONObject.toJSONString(person);
        stringRedisTemplate.opsForValue().set(person.getName(), personString);
        System.out.println("已执行存入数据,Person的名字为：" + person.getName());
    }

    /* 
     * @see priv.rlliu.redis.service.IPersonService#removePerson()
     */
    @Override
    public void getPerson() {
        String result = stringRedisTemplate.opsForValue().get("GTX");
        //反序列化
        Person person = JSONObject.parseObject(result, Person.class);
        System.out.println("成功取出数据,Person的年龄为：" + person.getAge());
    }
    
    
}
