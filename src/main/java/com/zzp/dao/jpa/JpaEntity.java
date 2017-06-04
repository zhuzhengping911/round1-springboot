package com.zzp.dao.jpa;

import com.zzp.pojo.Address;

/**
 * Created by zhuzhengping on 2017/6/4.
 */
public interface JpaEntity {

//    List<Address> findAll();

    Address findAddress(Long addressId);
}
