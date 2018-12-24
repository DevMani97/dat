package com.malyala.arka_infolabs.devmani.articletemplate;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    private Context mContext;
    private List<ArticleModel> mData;
    int lastPosition = -1;


    public RecyclerViewAdapter(Context mContext, List<ArticleModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view  = mInflater.inflate(R.layout.article_items_list, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int position) {

        myViewHolder.tv_article_id.setText(mData.get(position).getArticle_id());
        myViewHolder.tv_article_title.setText(mData.get(position).getArticle_title());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(mContext,DisplayArticle.class);
                intent.putExtra("Aid",mData.get(position).getArticle_id());
                intent.putExtra("Atitle",mData.get(position).getArticle_title());

                intent.putExtra("Atext",mData.get(position).getArticle_content());
                mContext.startActivity(intent);

            }
        });


        if(position >lastPosition) {

            Animation animation = AnimationUtils.loadAnimation(mContext,
                    R.anim.myanim);
            myViewHolder.itemView.startAnimation(animation);
            lastPosition = position;
        }

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

         TextView tv_article_id;
         TextView  tv_article_title;
         CardView cardView;



    public MyViewHolder(@NonNull View itemView){


        super(itemView);

        tv_article_title = itemView.findViewById(R.id.article_title_id);
        tv_article_id = itemView.findViewById(R.id.article_subtitle_id);
        cardView = itemView.findViewById(R.id.cardviewid);



    }
    }

    @Override
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        recyclerView.setAdapter(null);
        recyclerView.setLayoutManager(null);
        recyclerView.setOnClickListener(null);

        super.onDetachedFromRecyclerView(recyclerView);
    }
}
