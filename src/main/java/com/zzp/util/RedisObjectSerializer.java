package com.zzp.util;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * Created by zhuzhengping on 2017/6/25.
 * 序列化与反序列化
 */
public class RedisObjectSerializer implements RedisSerializer<Object> {

    private Converter<Object,byte[]> serializer = new SerializingConverter();
    private Converter<byte[],Object> deserializer = new DeserializingConverter();

    static final byte[] EMPTY_ARRAY = new byte[0];


    @Override
    public byte[] serialize(Object o) throws SerializationException {

        if(o == null){
            return EMPTY_ARRAY;
        }

        try {
            return serializer.convert(o);
        }catch (Exception e){
            return EMPTY_ARRAY;
        }
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if(isEmpty(bytes)){
            return null;
        }
        try {
            return deserializer.convert(bytes);
        }catch (Exception e){
            throw new SerializationException("Can not deserializer",e);
        }

    }

    private boolean isEmpty(byte[] data){

        return (data == null || data.length == 0);
    }
}
