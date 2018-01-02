package com.example.victor.mobdev;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by victor on 02/01/2018.
 */

/*public class Adapter extends  RecyclerView.Adapter<Adapter.BindingHolder> {

    /*private Context mContext;
    private List<Book> books = Book.listAll(Book.class);

    public Adapter(Context mContext) {

        this.mContext = mContext;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ArticleItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.activity_main2, parent, false);

        return new BindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        ArticleItemBinding binding = holder.binding;
        binding.setAvm(new ArticleViewModel(books.get(position), mContext));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private ArticleItemBinding binding;

        public BindingHolder(ArticleItemBinding binding) {
            super(binding.contactCard);
            this.binding = binding;
        }
    }
}*/
