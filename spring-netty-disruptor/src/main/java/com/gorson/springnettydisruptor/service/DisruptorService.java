package com.gorson.springnettydisruptor.service;

import com.gorson.springnettydisruptor.disruptor.GorsonEvent;
import com.gorson.springnettydisruptor.disruptor.GorsonEventFactory;
import com.gorson.springnettydisruptor.disruptor.GorsonEventHandler;
import com.gorson.springnettydisruptor.disruptor.GorsonEventProducer;
import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;

/**
 * 此类的描述是：
 *
 * @author GorsonLi@wezhuiyi.com
 * @create 2018-06-03 22:45
 **/
@Service
public class DisruptorService implements InitializingBean {
    private GorsonEventProducer gorsonEventProducer;
    private Disruptor<GorsonEvent> disruptor;

    @Override
    public void afterPropertiesSet() throws Exception {
        init();
    }

    private void init() {
//        springnettydisruptor = new Disruptor<>(new ChatLogEventFactory(),
//                65536,
//                Executors.newCachedThreadPool(),
//                ProducerType.SINGLE,
//                new BlockingWaitStrategy());

        disruptor = new Disruptor<>(new GorsonEventFactory(),
                65536,
//                Executors.newFixedThreadPool(16),
                Executors.defaultThreadFactory(),
                ProducerType.SINGLE,
                new BlockingWaitStrategy());

        disruptor.handleEventsWith(new GorsonEventHandler());

        disruptor.start();

        RingBuffer<GorsonEvent> ringBuffer = disruptor.getRingBuffer();
        gorsonEventProducer = new GorsonEventProducer(ringBuffer);
    }

    public GorsonEventProducer getGorsonEventProducer() {
        return gorsonEventProducer;
    }

    public Disruptor<GorsonEvent> getDisruptor() {
        return disruptor;
    }
}