package com.zzp.dao.jpa;

import com.zzp.pojo.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhuzhengping on 2017/6/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaEntityImplTest {

    @Autowired
    private JpaEntityImpl jpaEntity;

//    @Test
//    public void findAll() throws Exception {
//
//        List<Address> list = jpaEntity.findAll();
//        System.out.println(list.size());
//        for (Address address : list){
//            System.out.println(address.toString());
//        }
//    }

    @Test
    public void findAddress() throws Exception {
        Address address = jpaEntity.findAddress(Long.valueOf(9));
        System.out.println(address.toString());
    }

}