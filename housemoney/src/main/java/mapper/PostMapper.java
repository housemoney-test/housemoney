package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import entity.Post;

@Mapper
public interface PostMapper{
    List<Post> findAll();
}