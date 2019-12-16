package com.blueroofstudio.materialdesignapp.ui.fragments.tab3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.blueroofstudio.materialdesignapp.R;

public class Tab3Fragment extends Fragment {
    private Tab3ViewModel viewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        viewModel =
                ViewModelProviders.of(this).get(Tab3ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_text, container, false);
        final TextView textView = root.findViewById(R.id.text_view);
        viewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
