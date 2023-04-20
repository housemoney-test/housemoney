package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import entity.User;

@Mapper
public interface UserMapper {
	List<User>findAll();
	int create(User entity);
	User login(User entity);

}
