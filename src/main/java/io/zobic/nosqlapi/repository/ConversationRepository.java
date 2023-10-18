package io.zobic.nosqlapi.repository;

import io.zobic.nosqlapi.domain.Conversation;

import java.util.List;
import java.util.UUID;

public interface ConversationRepository {

    List<Conversation> findAll(UUID userId);
}
