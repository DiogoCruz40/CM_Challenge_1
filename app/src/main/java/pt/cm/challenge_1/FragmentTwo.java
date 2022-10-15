package pt.cm.challenge_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTwo extends Fragment {

    public FragmentTwo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);

//        SharedViewModel viewModel = new ViewModelProvider(getActivity()).get(SharedViewModel.class);
//        viewModel.getText().observe(getViewLifecycleOwner(),text -> {
//            //update UI
//        });
        return view;
    }
}