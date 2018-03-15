package example.com.android.newsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Biz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biz);
        String[] news = {"news1 title", "news2 title", "news3 title", "news4 title", "news5 title","news1 title", "news2 title", "news3 title", "news4 title", "news5 title"};
        ListAdapter listAdapter = new NewsAdapter(this, news);
        ListView listView = (ListView) findViewById(R.id.listeview);
        listView.setAdapter(listAdapter);
    }

    public static void click(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.biz:

                Intent intent = new Intent(view.getContext(), Biz.class);
                view.getContext().startActivity(intent);
                break;
            case R.id.all:
                Intent intent1 = new Intent(view.getContext(), MainActivity.class);
                view.getContext().startActivity(intent1);
                break;
            case R.id.politics:
                Intent intent2 = new Intent(view.getContext(), Politics.class);
                view.getContext().startActivity(intent2);
                break;
            case R.id.technology:
                Intent intent3 = new Intent(view.getContext(), Tech.class);
                view.getContext().startActivity(intent3);
                break;

        }
    }

    @Override
    public void onBackPressed() {
        Intent intent1 = new Intent(this, MainActivity.class);
    startActivity(intent1);

    }
}
