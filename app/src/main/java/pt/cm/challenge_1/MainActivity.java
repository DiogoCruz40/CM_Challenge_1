package pt.cm.challenge_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .add(R.id.target_container, new FragmentOne())
                .commit();
    }
    public void clickFrag2(View view) {
        int position = ((Spinner) findViewById(R.id.spinner)).getSelectedItemPosition();
        Bundle bundle = new Bundle();
        bundle.putInt("position",position);
        FragmentTwo fragment2 = new FragmentTwo();
        fragment2.setArguments(bundle);
        this.getSupportFragmentManager().beginTransaction().replace(R.id.target_container, fragment2).commit();
    }
    
}