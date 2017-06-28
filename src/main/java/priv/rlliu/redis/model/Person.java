/**
 *<p>
 * Copyright(c) @2016 
 * TIANPING AUTO INSURANCE CO.,LTD. 
 *</p>
 */
package priv.rlliu.redis.model;

import java.io.Serializable;

/**
 *<p>
 *description:实体
 *</p>
 * @author ex_liuruili
 * @since 2016年9月21日
 * @see 
 */
public class Person implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String name;
    
    private int age;
    
    
    /**
     * 
     */
    public Person() {
        super();
    }

    /**
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
