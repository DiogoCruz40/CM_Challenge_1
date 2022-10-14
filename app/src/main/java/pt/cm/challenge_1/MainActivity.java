package pt.cm.challenge_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().beginTransaction()
                .add(R.id.target_container, new FragmentOne())
                .commit();

        SharedViewModel viewModel = new ViewModelProvider(this).get(SharedViewModel.class);
    }
}