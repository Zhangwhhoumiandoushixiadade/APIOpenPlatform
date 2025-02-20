package com.Koa.springbootinit.esdao;

import com.Koa.springbootinit.model.dto.post.PostEsDTO;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
 * @author <a href=" https://github.com/Zhangwhhoumiandoushixiadade">程序员Koa</a>
 * @from <a href=" https://github.com/Zhangwhhoumiandoushixiadade">Koa</a>
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}