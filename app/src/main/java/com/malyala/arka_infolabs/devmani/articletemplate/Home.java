package com.malyala.arka_infolabs.devmani.articletemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {


    List<ArticleModel> adm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




        adm = new ArrayList<>();

        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));

        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));
        adm.add(new ArticleModel("1","article one",getResources().getString(R.string.partone)));



        RecyclerView myrv = findViewById(R.id.recyclerviewid);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,adm);
        myrv.setLayoutManager(new LinearLayoutManager(this));
        myrv.setAdapter(myAdapter);
    }


    public void showBottomSheetDialogFragment(View view) {
        BottomSheetFragment bottomSheetFragment = new BottomSheetFragment();
        bottomSheetFragment.show(getSupportFragmentManager(), bottomSheetFragment.getTag());
    }



    @Override
    protected void onDestroy() {
        System.gc();
        super.onDestroy();
    }
}
