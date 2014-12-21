package com.webninjamobile.xyntax;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class UserAdapter extends ArrayAdapter<User>{

    Context context;
    int layoutResourceId;   
    User data[] = null;
   
    public UserAdapter(Context context, int layoutResourceId, User[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        UserHolder holder = null;
       
        if(row == null)
        {
            LayoutInflater inflater =(LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            row = inflater.inflate(layoutResourceId, parent, false);
           
            holder = new UserHolder();
//            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
           
            row.setTag(holder);
        }
        else
        {
            holder = (UserHolder)row.getTag();
        }
       
        User user = data[position];
        holder.txtTitle.setText(user.title);
        
        return row;
    }
   
    static class UserHolder
    {
        TextView txtTitle;
    }
}