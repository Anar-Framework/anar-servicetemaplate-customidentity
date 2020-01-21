package af.gov.anar.dck.domain.service;


import af.gov.anar.dck.domain.model.Group;
import af.gov.anar.dck.domain.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface GroupService {
	
	public Group create(Group group);
    public List<Group> delete(Long id);
    public List<Group> findAll();
    public List<Group> findAllByEnv(String envSlug);
    public List<Group> findAllByUserAndEnv(User user, String envSlug);
    public Group findById(Long id);
    public boolean update(Long id, Group group);

}