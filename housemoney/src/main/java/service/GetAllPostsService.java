package service;

import org.springframework.stereotype.Service;

@Service
public class GetAllPostsService {
    
    @Autowired
    private PostMapper mapper;
    
    @Transactional
    public List<User>getAllPostsService(){
        return mapper.findAll();
    }
}