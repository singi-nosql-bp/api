package io.zobic.nosqlapi.adapter.sql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface ConversationJPARepository extends JpaRepository<ConversationJPAEntity, UUID> {
}
