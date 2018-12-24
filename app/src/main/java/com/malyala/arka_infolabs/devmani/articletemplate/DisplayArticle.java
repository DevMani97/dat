package com.malyala.arka_infolabs.devmani.articletemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayArticle extends AppCompatActivity {

    private TextView g_art_id, g_art_title, g_art_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_article);



        
        g_art_id = findViewById(R.id.article_subtitle_r_id);
        g_art_title= findViewById(R.id.article_title_r_id);
        g_art_content = findViewById(R.id.article_content_r_id);


        Intent intent= getIntent();

        String astid = intent.getExtras().getString("Aid");
        String ac = intent.getExtras().getString("Atext");
        String atid = intent.getExtras().getString("Atitle");


        g_art_content.setText(ac);
        g_art_title.setText(atid);
        g_art_id.setText(astid);


    }


    public void onbp(View view)
    {

        finish();
    }




    @Override
    protected void onDestroy() {
        g_art_id.setText(null);

        g_art_title.setText(null);
        g_art_content.setText(null);
        super.onDestroy();

    }
}


