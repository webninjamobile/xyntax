package com.webninjamobile.xyntax;

import android.content.ClipData.Item;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;


public class SettingsAdapter extends ArrayAdapter<Item>{

    Context context;
    int layoutResourceId;   
    Item data[] = null;
   
    public SettingsAdapter(Context context, int layoutResourceId, Item[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        SettingsHolder holder = null;
       
        if(row == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new SettingsHolder();
//            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
           
            row.setTag(holder);
        }
        else
        {
            holder = (SettingsHolder)row.getTag();
        }
       
//        Item item = data[position];
//        
//        holder.txtTitle.setText(item.title);

       
        return row;
    }
   
    static class SettingsHolder
    {
        TextView txtTitle;
        RadioButton radio0;
    }
}