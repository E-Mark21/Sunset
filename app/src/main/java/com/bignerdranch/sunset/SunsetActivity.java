package com.bignerdranch.sunset;

import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class SunsetActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return SunsetFragment.newInstance();
    }
}