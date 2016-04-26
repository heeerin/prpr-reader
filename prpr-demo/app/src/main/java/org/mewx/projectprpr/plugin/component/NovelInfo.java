package org.mewx.projectprpr.plugin.component;

import android.content.ContentValues;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by MewX on 4/9/2016.
 * General info, and additional info stored in ContentValues.
 * Judge if empty, not display.
 *
 * InfoPairs Sample:
 * 文库 小学馆
 * 连载状态 已完成
 * 最后更新 2012-11-02
 */
@SuppressWarnings("unused")
public class NovelInfo {
    private @NonNull String title; // may be id? hash?
    private @NonNull String dataSource = ""; // TODO: set by parent
    private @NonNull String bookTag; // id in data source, just an identifier
    private @NonNull String author = "";
    private @NonNull String coverUrl = ""; // if has none, set empty
    private @NonNull ContentValues infoPairs = new ContentValues();

    public NovelInfo(@NonNull String bookTag, @NonNull String title) {
        this.bookTag = bookTag;
        this.title = title;
    }

    public NovelInfo(@NonNull String bookTag, @NonNull String title, @NonNull String author, @NonNull String coverUrl) {
        this(bookTag, title);
        this.author = author;
        this.coverUrl = coverUrl;
    }

    public NovelInfo(@NonNull String bookTag, @NonNull String title, @NonNull  String author, @NonNull String coverUrl, @Nullable ContentValues cv) {
        this(bookTag, title, author, coverUrl);
        if (cv != null)
            this.infoPairs = cv;
    }

    public @NonNull String getBookTag() {
        return bookTag;
    }

    public void setBookTag(@NonNull String bookTag) {
        this.bookTag = bookTag;
    }

    public @NonNull String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    public @NonNull String getDataSource() {
        return dataSource;
    }

    public @NonNull String getAuthor() {
        return author;
    }

    public void setAuthor(@NonNull String author) {
        this.author = author;
    }

    /**
     * This function should be called by parent class, so user can just ignore it.
     * @param dataSource a typical string to represent a specific data source website.
     */
    public void setDataSource(@NonNull String dataSource) {
        this.dataSource = dataSource;
    }

    @NonNull
    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(@NonNull String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public ContentValues getInfoPairs() {
        return infoPairs;
    }

    public void setInfoPairs(ContentValues infoPairs) {
        this.infoPairs = infoPairs;
    }
}
