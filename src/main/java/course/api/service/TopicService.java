package course.api.service;

//import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import course.api.core.Topics;
import course.api.repository.TopicRepository;

@Service
public class TopicService {
	@Autowired
	TopicRepository topicRepository;
	/*private List<Topics> topics= new ArrayList<>(Arrays.asList(
			new Topics("C1","Java","Core Java"),
			new Topics("C2","Spring","Spring Framework"),
			new Topics("C3","Spring","Spring Boot")
			));*/
	public List<Topics> getAllTopic()
	{
		//return topics;
		List<Topics> topics=new ArrayList<Topics>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
		
	}
	public Topics getTopic(String id)
	{
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id).get();
		
	}
	public void addTopic(Topics topic) {
		//topics.add(topic);
		topicRepository.save(topic);
		
	}
	public void updateTopic(String id, Topics topic) {
	/* for(int i=0;i<topics.size();i++) {
		Topics t=topics.get(i);
		if(t.getId().equals(id))
		{
			topics.set(i, topic);
			return;
		}
	}*/
		topicRepository.save(topic);

   }
	public void deleteTopic(String id) {
		//topics.removeIf(t->t.getId().equals(id));
		topicRepository.deleteById(id);
	}
}
