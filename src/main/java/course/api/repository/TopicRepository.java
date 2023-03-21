package course.api.repository;

import org.springframework.data.repository.CrudRepository;

import course.api.core.Topics;

public interface TopicRepository extends CrudRepository<Topics,String> {

}
