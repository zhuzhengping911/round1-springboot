package com.zzp;

import com.zzp.dao.jpa.AddressRepository;
import com.zzp.pojo.Address;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Round1ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private AddressRepository addressRepository;

	@Test
	public void jpaTest() throws Exception{


//		插入10条记录
		addressRepository.save(new Address(Long.valueOf(3),"SH"));
		addressRepository.save(new Address(Long.valueOf(4),"XA"));
		addressRepository.save(new Address(Long.valueOf(5),"BJ"));
		addressRepository.save(new Address(Long.valueOf(6),"GZ"));
		addressRepository.save(new Address(Long.valueOf(7),"WX"));
		addressRepository.save(new Address(Long.valueOf(14),"NC"));
		addressRepository.save(new Address(Long.valueOf(15),"HLJ"));
		addressRepository.save(new Address(Long.valueOf(15),"XJ"));
		addressRepository.save(new Address(Long.valueOf(15),"DL"));
		addressRepository.save(new Address(Long.valueOf(16),"M78"));

//		测试查询所有记录
		Assert.assertEquals(10,addressRepository.findAll().size());

//		测试查询UserId为7，addressID为5的记录是不是WX
		Assert.assertEquals("WX",addressRepository.findByAddressIdAndUserId(Long.valueOf(5),Long.valueOf(7)).getAddressInfo());

//		测试查询15号用户是否是三条记录
		Assert.assertEquals(3,addressRepository.findByUserId(Long.valueOf(15)).size());

//		测试查询SH内容用户是不是3号用户
		Assert.assertEquals(3,addressRepository.findAddress("SH").getUserId().longValue());

//		测试删除内容是M78的记录
		addressRepository.delete(addressRepository.findAddress("M78"));

//		测试查询记录，看删除是否成功
		Assert.assertEquals(9,addressRepository.findAll().size());
	}

}
