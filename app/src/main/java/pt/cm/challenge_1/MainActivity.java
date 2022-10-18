package pt.cm.challenge_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity implements ChangeFrag {

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
        changefrag(fragment2);

    }

    @Override
    public void changefrag(Fragment fragment) {
        this.getSupportFragmentManager().beginTransaction().replace(R.id.target_container, fragment).commit();
    }
}