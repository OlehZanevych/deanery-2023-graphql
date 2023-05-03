package org.lnu.teaching.web.application.disign.deanery.graphql.entity.department.field.selection;

import lombok.Data;

import java.util.List;

@Data
public class DepartmentFieldSelection {
    private final List<String> rootFields;
    private List<String> facultyFields;
}
