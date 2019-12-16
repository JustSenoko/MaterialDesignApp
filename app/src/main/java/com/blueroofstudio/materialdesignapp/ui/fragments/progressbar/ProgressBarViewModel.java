package com.blueroofstudio.materialdesignapp.ui.fragments.progressbar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProgressBarViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<Boolean> mProgressBarVisibility;

    public ProgressBarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is progress bar fragment");

        mProgressBarVisibility = new MutableLiveData<>();
        mProgressBarVisibility.setValue(false);
    }

    LiveData<String> getText() {
        return mText;
    }
    LiveData<Boolean> getProgressBarVisibility() {
        return mProgressBarVisibility;
    }
    void setProgressBarVisibility(Boolean visibility) {
        mProgressBarVisibility.setValue(visibility);
    }
}