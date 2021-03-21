package com.maxhayday.cw.cw04.strategy;

import lombok.AllArgsConstructor;
import lombok.experimental.Delegate;

@AllArgsConstructor
public class RadioAlarm implements Alarm, Radio {
    @Delegate
    private Radio radio = new RadioImpl();
    @Delegate(excludes = AlarmExlusions.class)
    private Alarm alarm = new AlarmImpl();

    @Override
    public void c() {

    }
}
