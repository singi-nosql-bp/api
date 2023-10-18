package io.zobic.nosqlapi.dto.mapper;

import io.zobic.nosqlapi.domain.Conversation;
import io.zobic.nosqlapi.dto.response.ConversationResponse;
import org.springframework.stereotype.Component;

@Component
public class ConversationMapper { // TODO to mapStruct

    public ConversationResponse toResponse(Conversation model) {
        throw new UnsupportedOperationException();
    }
}
