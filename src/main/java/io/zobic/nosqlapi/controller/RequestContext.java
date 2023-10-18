package io.zobic.nosqlapi.controller;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.UUID;

@Getter
@Component
@RequestScope
public class RequestContext {

    private UUID userId; // TODO populated via SecurityContext in filter
}
