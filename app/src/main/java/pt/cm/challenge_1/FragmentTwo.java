package pt.cm.challenge_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    public FragmentTwo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        int position = getArguments().getInt("position");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        SharedViewModel viewModel = new ViewModelProvider(getActivity()).get(SharedViewModel.class);
        ((EditText) view.findViewById(R.id.owneredit)).setText(viewModel.getOwners().getValue().get(position));
        ((EditText) view.findViewById(R.id.ageedit)).setText(viewModel.getAges().getValue().get(position));
        ((EditText) view.findViewById(R.id.nameedit)).setText(viewModel.getNames().getValue().get(position));

        view.findViewById(R.id.gotofrag1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    viewModel.setAges(((EditText) view.findViewById(R.id.ageedit)).getText().toString(),position);
                    viewModel.setNames(((EditText) view.findViewById(R.id.nameedit)).getText().toString(),position);
                    viewModel.setOwners(((EditText) view.findViewById(R.id.owneredit)).getText().toString(),position);
                    Bundle bundle = new Bundle();
                    bundle.putInt("position",position);
                    FragmentOne fragment1 = new FragmentOne();
                    fragment1.setArguments(bundle);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.target_container, fragment1).commit();
            }
        });
        return view;
    }
}