package com.example.lab9dynamicview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lab9dynamicview.model.PostItem;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PostItem> listItem=new ArrayList<>();
        LinearLayout llscrollParent=(LinearLayout) findViewById(R.id.ll_scroll);

        for(int i=0;i<100;i++) {
            PostItem item=new PostItem("gxrdxnia",
                    "https://www.google.com/search?q=%EC%9A%B0%EC%9C%A0%EB%8B%88%EC%82%AC%EB%A7%89&sxsrf=ALeKk00d6VDJ5hGOo8GqI117GiqQTcV-Rg:1586679246766&tbm=isch&source=iu&ictx=1&fir=4Te9yRmJEutWnM%253A%252CIRLzGuq_uV-A6M%252C_&vet=1&usg=AI4_-kQ3vVAWT17qJDvzyzosaR8gsivMVQ&sa=X&ved=2ahUKEwjo0YDnuOLoAhXGBogKHStMA20Q9QEwCXoECAkQLg#imgrc=28thx2uTz7ofJM",
                    "hello",
                    1886,
                    true);
            listItem.add(i, item);
        }

        for(PostItem item :listItem) {
            View v=View.inflate(this, R.layout.post_item, null);
            TextView userName=(TextView) v.findViewById(R.id.userName);
            TextView postText=(TextView) v.findViewById(R.id.postText);
            userName.setText(item.getUserName());
            postText.setText(item.getPostText());

            llscrollParent.addView(v);
        }

    }
}
