package example.com.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sharma786 on 13/03/2018.
 */

public class NewsAdapter extends ArrayAdapter<String> {
    public NewsAdapter(@NonNull Context context,String[] s) {
        super(context,R.layout.listlayout,s);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        View customView=layoutInflater.inflate(R.layout.listlayout,parent,false);
        String singleNewsItem=getItem(position);
        TextView textView=(TextView)customView.findViewById(R.id.tvTitle);
        textView.setText(singleNewsItem);
        return customView;
    }
}
