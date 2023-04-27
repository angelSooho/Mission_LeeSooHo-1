package com.example.mission_leesooho.global.event;

import com.example.mission_leesooho.boundedContext.likeablePerson.entity.LikeablePerson;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class EventAfterModifyAT extends ApplicationEvent {
    private final LikeablePerson likeablePerson;
    private final int oldAttractiveTypeCode;

    public EventAfterModifyAT(Object source, LikeablePerson likeablePerson, int oldAttractiveTypeCode, int newAttractiveTypeCode) {
        super(source);
        this.likeablePerson = likeablePerson;
        this.oldAttractiveTypeCode = oldAttractiveTypeCode;
    }
}