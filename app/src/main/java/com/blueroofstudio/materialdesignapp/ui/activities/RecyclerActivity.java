package com.blueroofstudio.materialdesignapp.ui.activities;

import android.os.Bundle;

import com.blueroofstudio.materialdesignapp.providers.FruitDataProvider;
import com.blueroofstudio.materialdesignapp.ui.recyclerview.RVAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.blueroofstudio.materialdesignapp.R;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        FruitDataProvider data = new FruitDataProvider();
        RVAdapter adapter = new RVAdapter(data.getList());
        recyclerView.setAdapter(adapter);
    }
}
