package com.Koa.springbootinit.mapper;

import com.Koa.springbootinit.model.entity.Post;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 帖子数据库操作测试
 *
 * @author <a href=" https://github.com/Zhangwhhoumiandoushixiadade">程序员Koa</a>
 * @from <a href=" https://github.com/Zhangwhhoumiandoushixiadade">Koa</a>
 */
@SpringBootTest
class PostMapperTest {

    @Resource
    private PostMapper postMapper;

    @Test
    void listPostWithDelete() {
        List<Post> postList = postMapper.listPostWithDelete(new Date());
        Assertions.assertNotNull(postList);
    }
}