package com.malyala.arka_infolabs.devmani.articletemplate;

public class ArticleModel {
    private String article_id;
    private String article_title;
    private String article_content;

    public ArticleModel(String article_id, String article_title, String article_content) {
        this.article_id = article_id;
        this.article_title = article_title;
        this.article_content = article_content;
    }

    public String getArticle_id() {
        return article_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public String getArticle_content() {
        return article_content;
    }
}
