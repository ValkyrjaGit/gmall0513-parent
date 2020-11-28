package com.atguigu.gmall0513.mock.util;

/**
 * @Author:xudechang
 * @Date:Created in 2020/11/27 17:46
 * @Description:
 */
public class RanOpt<T>{
    T value ;
    int weight;

    public RanOpt ( T value, int weight ){
        this.value=value ;
        this.weight=weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }
}

