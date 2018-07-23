package com.gorson.springnettydisruptor.disruptor;

import com.lmax.disruptor.EventFactory;

/**
 * 此类的描述是：事件工厂
 *
 * @create 2018-06-03 22:45
 **/
public class GorsonEventFactory implements EventFactory<GorsonEvent> {
    @Override
    public GorsonEvent newInstance() {
        return new GorsonEvent();
    }
}