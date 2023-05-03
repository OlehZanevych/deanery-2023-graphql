package org.lnu.teaching.web.application.disign.deanery.graphql.service.common;

import graphql.GraphQLContext;
import graphql.schema.DataFetchingFieldSelectionSet;
import org.lnu.teaching.web.application.disign.deanery.graphql.entity.common.response.Connection;
import reactor.core.publisher.Mono;

public interface CommonEntityService<Entity> {
    Mono<Connection<Entity>> getConnection(DataFetchingFieldSelectionSet fs, int limit, long offset, GraphQLContext context);
    Mono<Entity> findById(Long id, DataFetchingFieldSelectionSet fs, GraphQLContext context);
}
