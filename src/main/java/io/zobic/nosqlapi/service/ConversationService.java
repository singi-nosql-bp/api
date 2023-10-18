package io.zobic.nosqlapi.service;

import io.zobic.nosqlapi.domain.Conversation;
import io.zobic.nosqlapi.repository.ConversationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ConversationService {

    private final ConversationRepository conversationRepository;

    public List<Conversation> getAll(UUID userId) {
        return conversationRepository.findAll(userId);
    }
}
