package pt.cm.challenge_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class FragmentOne extends Fragment {

    public FragmentOne() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);
        initspinnerfooter(view.findViewById(R.id.spinner), view.findViewById(R.id.owner), view.findViewById(R.id.name), view.findViewById(R.id.age), view.findViewById(R.id.imageView2));

        return view;
    }

    private void initspinnerfooter(Spinner spinner, TextView owner, TextView name, TextView age, ImageView image) {
        SharedViewModel viewModel = new ViewModelProvider(getActivity()).get(SharedViewModel.class);
        viewModel.getNames().observe(getViewLifecycleOwner(), names -> {
            //update UI
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, names);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            if(getArguments() != null)
            {
                int pos = getArguments().getInt("position");
                spinner.setSelection(pos);
            }
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    image.setImageResource(viewModel.getImages().getValue().get(position));
                    owner.setText(viewModel.getOwners().getValue().get(position));
                    name.setText(names.get(position));
                    age.setText(viewModel.getAges().getValue().get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // TODO Auto-generated method stub
                }
            });
        });
    }


}