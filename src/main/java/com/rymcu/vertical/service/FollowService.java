package com.rymcu.vertical.service;

import com.rymcu.vertical.core.service.Service;
import com.rymcu.vertical.entity.Follow;
import com.rymcu.vertical.web.api.exception.BaseApiException;

/**
 * @author ronger
 */
public interface FollowService extends Service<Follow> {
    /**
     * 判断是否关注
     * @param followingId
     * @param followingType
     * @return
     * @throws BaseApiException
     */
    Boolean isFollow(Integer followingId, String followingType) throws BaseApiException;

    /**
     * 关注操作
     * @param follow
     * @return
     * @throws BaseApiException
     */
    Boolean follow(Follow follow) throws BaseApiException;

    /**
     * 取消关注操作
     * @param follow
     * @return
     * @throws BaseApiException
     */
    Boolean cancelFollow(Follow follow) throws BaseApiException;
}