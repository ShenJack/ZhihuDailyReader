package com.example.shenjack.zhihudailyreader.data.source;

import android.support.annotation.NonNull;

import com.example.shenjack.zhihudailyreader.data.BeforePosts;
import com.example.shenjack.zhihudailyreader.data.Detail;
import com.example.shenjack.zhihudailyreader.data.Post;
import com.example.shenjack.zhihudailyreader.data.StoriesBean;
import com.example.shenjack.zhihudailyreader.data.TodayPosts;

import java.util.List;

/**
 * Created by ShenJack on 2017/6/1.
 */

public interface StoryDataSource {
    interface GetPostCallBack{
        void onPostLoaded(Post post);

        void onDataNotAvailable();
    }


    io.reactivex.Observable<TodayPosts> getTodayStories();

    io.reactivex.Observable<List<TodayPosts.TopStoriesBean>> getTopStories();

    io.reactivex.Observable<BeforePosts> getBeforeStories(String  date);

    io.reactivex.Observable<Detail> getStoryDetail(@NonNull String postId);

    void savePost(@NonNull StoriesBean storiesBean);

    void readPost(@NonNull StoriesBean storiesBean);

    void readPost(@NonNull int postId);

    void refreshPosts();

}
