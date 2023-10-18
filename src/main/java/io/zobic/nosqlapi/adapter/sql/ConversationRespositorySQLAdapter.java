package io.zobic.nosqlapi.adapter.sql;

import io.zobic.nosqlapi.domain.Conversation;
import io.zobic.nosqlapi.repository.ConversationRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class ConversationRespositorySQLAdapter implements ConversationRepository {
    @Override
    public List<Conversation> findAll(UUID userId) {
        throw new UnsupportedOperationException();
    }
}
