package com.example.assignmentt6;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAapter extends BaseAdapter {
    List<ContactModel> contacts;

    public ContactAapter(List<ContactModel> contacts) {
        this.contacts = contacts;
    }
    class ViewHolder{
        TextView textView;
        TextView topic;
        TextView content;
        TextView time;
        ImageView star;
    }
    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.textView=convertView.findViewById(R.id.text_view);
            viewHolder.topic=convertView.findViewById(R.id.text_topic);
            viewHolder.content=convertView.findViewById(R.id.text_content);
            viewHolder.time=convertView.findViewById(R.id.text_time);
            viewHolder.star=convertView.findViewById(R.id.image_star);
            convertView.setTag(viewHolder);
        }
        else
            viewHolder= (ViewHolder) convertView.getTag();

        ContactModel contactModel=contacts.get(position);
        //viewHolder.textView.getBackground().setColorFilter();
        viewHolder.textView.setText(contactModel.getTopic().charAt(0)+"");
        viewHolder.topic.setText(contactModel.getTopic());
        viewHolder.content.setText(contactModel.getContent());
        viewHolder.time.setText(contactModel.getTime());
        if(contactModel.getChose()==false)
            viewHolder.star.setImageResource(R.drawable.ic_star_border_black_24dp);
        else
            viewHolder.star.setImageResource(R.drawable.ic_star_black_24dp);

        viewHolder.star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               boolean isSelectes =contacts.get(position).getChose();
               contacts.get(position).setChose(!isSelectes);
               notifyDataSetChanged();
            }
        });


       return convertView;
    }
    

}
