package service;

@Service
public class GetAllPostsService {
    
    @Autowired
    private PostMapper mapper;
    
    @Transactional
    public List<User>getAllPostsService(){
        
    }
}