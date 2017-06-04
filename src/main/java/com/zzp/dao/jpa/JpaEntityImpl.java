package com.zzp.dao.jpa;

import com.zzp.pojo.Address;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.awt.print.Pageable;
import java.util.List;

/**
 * Created by zhuzhengping on 2017/6/4.
 */
@Repository
public class JpaEntityImpl implements JpaEntity {

    @PersistenceContext
    private EntityManager entityManager;

//    @Override
//    public List<Address> findAll() {
//        return this.entityManager.createQuery("select t from Address t",Address.class)
//                .getResultList();
//    }


    @Override
    public Address findAddress(Long addressId) {
        return this.entityManager.createQuery("select t from Address t where t.addressId = ?",Address.class)
                .setParameter(1,addressId)
                .getSingleResult();
    }
}
