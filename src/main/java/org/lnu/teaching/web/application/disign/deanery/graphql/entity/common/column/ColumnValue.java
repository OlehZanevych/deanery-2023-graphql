package org.lnu.teaching.web.application.disign.deanery.graphql.entity.common.column;

import lombok.Data;

@Data
public class ColumnValue {
    private final String column;
    private final Object value;
}
