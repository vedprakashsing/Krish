package akssmk.com.agriculturalapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import akssmk.com.agriculturalapp.R;
import akssmk.com.agriculturalapp.adapters.ProblemShowAdapter;
import akssmk.com.agriculturalapp.adapters.StateDepartmentAdapter;

public class StateDepartment extends AppCompatActivity {

    private StateDepartmentAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_recycler);

        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        String[] array=getResources().getStringArray(R.array.States);
        String[] links=getResources().getStringArray(R.array.state_links);

        adapter = new StateDepartmentAdapter(this,array,links);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        findViewById(R.id.progress).setVisibility(View.GONE);
    }
}
