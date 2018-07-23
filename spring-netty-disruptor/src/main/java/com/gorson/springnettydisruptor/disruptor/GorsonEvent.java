package com.gorson.springnettydisruptor.disruptor;

import lombok.Data;

import java.io.Serializable;

/**
 * 此类的描述是：
 *
 * @create 2018-06-03 22:45
 **/
@Data
public class GorsonEvent implements Serializable {
    private int id;
    private String name;
}
