package org.lnu.teaching.web.application.disign.deanery.graphql.repository.department;

import org.lnu.teaching.web.application.disign.deanery.graphql.entity.department.Department;
import org.lnu.teaching.web.application.disign.deanery.graphql.entity.department.field.selection.DepartmentFieldSelection;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;

public interface DepartmentRepository {
    Mono<Department> create(Department department);
    Flux<Department> findAll(DepartmentFieldSelection fieldSelection, int limit, long offset);
    Mono<Department> findById(Long id, DepartmentFieldSelection fieldSelection);
    Mono<Long> count();
    Mono<Boolean> update(Department department);
    Mono<Boolean> delete(Long id);
    Flux<Department> findByFacultyIds(Collection<Long> facultyIds, Collection<String> fields);
}
