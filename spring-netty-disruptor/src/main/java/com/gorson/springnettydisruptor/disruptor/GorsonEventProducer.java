package com.gorson.springnettydisruptor.disruptor;

import com.gorson.springnettydisruptor.dto.GorsonDTO;
import com.lmax.disruptor.EventTranslatorOneArg;
import com.lmax.disruptor.RingBuffer;

/**
 * 此类的描述是：事件的生产者
 *
 * @create 2018-06-03 22:45
 **/
public class GorsonEventProducer {
    private final RingBuffer<GorsonEvent> ringBuffer;

    public GorsonEventProducer(RingBuffer<GorsonEvent> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }

    public synchronized void onData(GorsonDTO gorsonDTO) {
        ringBuffer.publishEvent(TRANSLATOR_ONE_ARG, gorsonDTO);
    }

    private static final EventTranslatorOneArg<GorsonEvent, GorsonDTO> TRANSLATOR_ONE_ARG = (gorsonEvent, l, gorsonDTO) -> {
        gorsonEvent.setId(gorsonDTO.getId());
    };
}