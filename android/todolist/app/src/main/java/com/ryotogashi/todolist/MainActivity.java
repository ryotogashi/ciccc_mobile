package com.ryotogashi.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private WordListAdapter mWordListAdapter;
    private WordList mWordList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWordList = new WordList();

        mWordListAdapter = new WordListAdapter(this, mWordList);

        mRecyclerView = findViewById(R.id.recycler_view);

        mRecyclerView.setAdapter(mWordListAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
