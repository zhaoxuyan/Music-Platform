package me.wlw.music.service;

import me.wlw.music.model.Music;

/**
 * 播放进度监听器
 * Created by zxy/ztp on 2018/6/17.
 */
public interface OnPlayerEventListener {

    /**
     * 切换歌曲
     */
    void onChange(Music music);

    /**
     * 继续播放
     */
    void onPlayerStart();

    /**
     * 暂停播放
     */
    void onPlayerPause();

    /**
     * 更新进度
     */
    void onPublish(int progress);

    /**
     * 缓冲百分比
     */
    void onBufferingUpdate(int percent);
}
