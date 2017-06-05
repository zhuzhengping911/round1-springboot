package com.zzp.dao.jpa;

import com.zzp.Round1Application;
import com.zzp.pojo.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by zhuzhengping on 2017/6/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Round1Application.class)
public class AddressRepositoryTest {

    @Autowired
    private AddressRepository addressRepository;

    @Test
    public void findAll() throws Exception {

        int page = 0,size = 10;
        Sort sort = new Sort(Sort.Direction.DESC,"addressId");
        Pageable pageable = new PageRequest(page,size,sort);
        Page<Address> a = addressRepository.findAll(pageable);
        System.out.println(a.getTotalPages());
        System.out.println(a.getTotalElements());
        List<Address> aa = a.getContent();
        for (Address u : aa){
            System.out.println(u.toString());
        }
    }

}