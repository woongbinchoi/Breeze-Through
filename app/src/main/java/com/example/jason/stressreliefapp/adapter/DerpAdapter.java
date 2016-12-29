package com.example.jason.stressreliefapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jason.stressreliefapp.R;
import com.example.jason.stressreliefapp.model.ListItem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2016-12-23.
 */

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder> {

    private List<ListItem> listData;
    private LayoutInflater inflater;

    private itemClickCallback itemClickCallback;

    public interface itemClickCallback {
        void onItemClick(int p);

        void onSecondaryiconClick(int p);

    }

    public void setItemClickCallback(final itemClickCallback itemClickCallback) {
        this.itemClickCallback = itemClickCallback;
    }

    public DerpAdapter(List<ListItem> listData, Context c) {
        this.inflater = LayoutInflater.from(c);
        this.listData = listData;
    }

    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card_item, parent, false);
        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.subtitle.setText(item.getSubTitle());
        holder.thumbnail.setImageResource(item.getImageResid());
        /*if (item.isFavourite()) {
            holder.secondaryicon.setImageResource(R.drawable.ic_star_black_24dp);
        } else {
            holder.secondaryicon.setImageResource(R.drawable.ic_star_border_black_24dp);
        }*/
    }

    public void setListData (ArrayList<ListItem> exerciselist) {

        this.listData.clear();
        this.listData.addAll(exerciselist);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class DerpHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView title;
        private TextView subtitle;
        private ImageView thumbnail;
        //private ImageView secondaryicon;
        private View container;
        private Button load;

        public DerpHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.lbl_item_text);
            subtitle = (TextView) itemView.findViewById(R.id.lbl_item_sub_title);
            thumbnail = (ImageView) itemView.findViewById(R.id.im_item_icon);
            //secondaryicon = (ImageView) itemView.findViewById(R.id.im_item_icon_secondary);
            //secondaryicon.setOnClickListener(this);
            //We'll need the container later on, when we add an View.OnClickListener
            load = (Button)itemView.findViewById(R.id.btn_card_load);
            load.setOnClickListener(this);
            container = itemView.findViewById(R.id.cont_item_root);
            //container.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btn_card_load) {
                itemClickCallback.onItemClick(getAdapterPosition());
            } else {
                //itemClickCallback.onSecondaryiconClick(getAdapterPosition());

            }
        }

    }
}
