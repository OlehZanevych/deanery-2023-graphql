package org.lnu.teaching.web.application.disign.deanery.graphql.controller.query;

import org.lnu.teaching.web.application.disign.deanery.graphql.entity.query.departments.DepartmentQueries;
import org.lnu.teaching.web.application.disign.deanery.graphql.entity.query.faculties.FacultyQueries;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class QueryController {
    @QueryMapping
    public FacultyQueries faculties() {
        return new FacultyQueries();
    }
    @QueryMapping
    public DepartmentQueries departments() {
        return new DepartmentQueries();
    }
}
