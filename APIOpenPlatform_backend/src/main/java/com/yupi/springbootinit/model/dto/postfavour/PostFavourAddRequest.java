package com.Koa.springbootinit.model.dto.postfavour;

import java.io.Serializable;
import lombok.Data;

/**
 * 帖子收藏 / 取消收藏请求
 *
 * @author <a href=" https://github.com/Zhangwhhoumiandoushixiadade">程序员Koa</a>
 * @from <a href=" https://github.com/Zhangwhhoumiandoushixiadade">Koa</a>
 */
@Data
public class PostFavourAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}