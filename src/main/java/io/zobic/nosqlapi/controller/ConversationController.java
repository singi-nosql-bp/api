package io.zobic.nosqlapi.controller;

import io.zobic.nosqlapi.dto.mapper.ConversationMapper;
import io.zobic.nosqlapi.dto.response.ConversationResponse;
import io.zobic.nosqlapi.service.ConversationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/conversation")
@RequiredArgsConstructor
public class ConversationController {

    private final ConversationService conversationService;
    private final RequestContext requestContext;
    private final ConversationMapper conversationMapper;

    @GetMapping
    public List<ConversationResponse> getAllConversations() {
        return conversationService
                .getAll(requestContext.getUserId())
                .stream()
                .map(conversationMapper::toResponse).toList();
    }
}
