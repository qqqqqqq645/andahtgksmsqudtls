package com.example.a210.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<ListViewItem> listViewItemList = new ArrayList<>();

    public ListViewAdapter(){

    }
    @Override
    public int getCount(){
        return listViewItemList.size();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final int pos = position;
        final Context context = parent.getContext();

        //listview_item Layout�� inflate �Ͽ� convertView ���� ȹ��.

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row,parent,false);
        }

        ImageView iconImageView = (ImageView)convertView.findViewById(R.id.imageView1);
        TextView titleTextView = (TextView)convertView.findViewById(R.id.textView1);
        TextView descTextView = (TextView) convertView.findViewById(R.id.textView2);
        TextView locationTextView = (TextView)convertView.findViewById(R.id.textView3);

        //Data Set(listViewTtemList)���� position �� ��ġ�� ������ ���� ȹ��
        ListViewItem listViewItem = listViewItemList.get(position);

        //������ �� �� ������ ������ �ݿ�
        iconImageView.setImageDrawable(listViewItem.getIcon());
        titleTextView.setText(listViewItem.getTitle());
        descTextView.setText(listViewItem.getDesc());
        locationTextView.setText(listViewItem.getLocation());
        return convertView;
    }
    //������ ��ġ(position)�� �ִ� �����Ϳ� ����� ������(row)�� ID�� ���� : �ʼ� ����
    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public Object getItem(int position){
        return listViewItemList.get(position);
    }

    public void addItem(Drawable icon, String title, String desc,String location){
        ListViewItem item = new ListViewItem();

        item.setIcon(icon);
        item.setTitle(title);
        item.setDesc(desc);
        item.setLocation(location);

        listViewItemList.add(item);
    }

}