package com.ssm.service;

import com.ssm.po.News;
import com.ssm.utils.PageBean;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/11 4:52 下午
 * @Description: 新闻Service层接口
 */
public interface NewsService {
    PageBean<News> findNewsByPage(String keywords, Integer newsListCategoryId, Integer currentPage, Integer pageSize);
    News getNewsByNewsId(Integer newsId);
    int setNewsPublishStatus(News news);
    int addNews(News news);
    int editNews(News news);
    int delNews(Integer newsId);
}
