package com.blueroofstudio.materialdesignapp.ui.fragments.tab3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Tab3ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Tab3ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is fragment 3");
    }

    public LiveData<String> getText() {
        return mText;
    }
}