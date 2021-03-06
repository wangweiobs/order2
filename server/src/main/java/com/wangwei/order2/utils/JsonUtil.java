package com.wangwei.order2.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @Auther wangwei
 * @Date 2018/4/14 下午4:53
 */
public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 将一个对象转换成json字符串
     * @param object
     * @return
     */
    public static String toJson(Object object){
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * json转对象
     * @param string
     * @param classType
     * @return
     */
    public static Object fromJson(String string, Class classType){
        try {
            return objectMapper.readValue(string, classType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * json转对象
     * @param string
     * @param typeReference
     * @return
     */
    public static Object fromJson(String string, TypeReference typeReference){
        try {
            return objectMapper.readValue(string, typeReference);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
