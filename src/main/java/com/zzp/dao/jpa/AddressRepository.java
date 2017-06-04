package com.zzp.dao.jpa;

import com.zzp.pojo.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by zhuzhengping on 2017/5/30.
 */
public interface AddressRepository extends JpaRepository<Address,Long> {

    List<Address> findByUserId(Long userId);

    Page<Address> findAll(Pageable pageable);

    Address findByAddressIdAndUserId(Long addressId,Long userId);

    @Query(value = "select  t from Address t where t.addressInfo = :addressInfo")
    Address findAddress(@Param("addressInfo") String addressInfo);
}
