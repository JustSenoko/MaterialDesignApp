package com.blueroofstudio.materialdesignapp.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TabWidget;

import com.blueroofstudio.materialdesignapp.R;
import com.blueroofstudio.materialdesignapp.ui.adapters.TabAdapter;
import com.blueroofstudio.materialdesignapp.ui.fragments.map.MapFragment;
import com.blueroofstudio.materialdesignapp.ui.fragments.progressbar.ProgressBarFragment;
import com.blueroofstudio.materialdesignapp.ui.fragments.tab3.Tab3Fragment;
import com.google.android.material.tabs.TabLayout;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Fragment fragment1 = new ProgressBarFragment();
        Fragment fragment2 = new MapFragment();
        Fragment fragment3 = new Tab3Fragment();

        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(fragment1, "progress");
        adapter.addFragment(fragment2, "map");
        adapter.addFragment(fragment3, "tab 3");

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
