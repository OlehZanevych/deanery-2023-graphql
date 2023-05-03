package org.lnu.teaching.web.application.disign.deanery.graphql.util;

import org.lnu.teaching.web.application.disign.deanery.graphql.entity.common.response.Connection;

import java.util.List;

public class ConnectionUtil {
    public static <T> Connection<T> createConnectionResponse(List<T> nodes) {
        return new Connection<>(nodes);
    }
}
