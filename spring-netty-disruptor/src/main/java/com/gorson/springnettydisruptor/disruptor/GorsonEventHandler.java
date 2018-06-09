package com.gorson.springnettydisruptor.disruptor;

import com.lmax.disruptor.EventHandler;

/**
 * 此类的描述是：事件处理器
 *
 * @author GorsonLi@wezhuiyi.com
 * @create 2018-06-03 22:45
 **/
public class GorsonEventHandler implements EventHandler<GorsonEvent> {

    @Override
    public void onEvent(GorsonEvent gorsonEvent, long l, boolean b) throws Exception {
//        System.out.println(JSON.toJSONString(gorsonEvent));
        //TODO 业务处理逻辑
    }
}
