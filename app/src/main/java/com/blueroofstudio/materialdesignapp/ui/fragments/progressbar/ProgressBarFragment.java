package com.blueroofstudio.materialdesignapp.ui.fragments.progressbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.blueroofstudio.materialdesignapp.R;
import com.blueroofstudio.materialdesignapp.ui.fragments.progressbar.ProgressBarViewModel;
import com.google.android.material.button.MaterialButton;

public class ProgressBarFragment extends Fragment {

    private ProgressBarViewModel progressBarViewModel;
    private ProgressBar progressBar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        progressBarViewModel =
                ViewModelProviders.of(this).get(ProgressBarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_progress_bar, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        progressBarViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        final MaterialButton btnStartStop = root.findViewById(R.id.btn_start_stop);
        btnStartStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBarViewModel.setProgressBarVisibility(progressBar.getVisibility() == View.INVISIBLE);
            }
        });

        progressBar = root.findViewById(R.id.progressBar);
        progressBarViewModel.getProgressBarVisibility().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean visibility) {
                if (visibility) {
                    progressBar.setVisibility(View.VISIBLE);
                    btnStartStop.setText("Stop");
                } else {
                    progressBar.setVisibility(View.INVISIBLE);
                    btnStartStop.setText("Start");
                }
            }
        });
        return root;
    }
}