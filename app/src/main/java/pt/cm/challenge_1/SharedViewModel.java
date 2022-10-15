package pt.cm.challenge_1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Arrays;
import java.util.List;

public class SharedViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<List<String>> names, owners, ages;
    private MutableLiveData<List<Integer>> images;

    public MutableLiveData<List<Integer>> getImages() {
        if (images == null) {
            images = new MutableLiveData<List<Integer>>(Arrays.asList(R.mipmap.snail_foreground, R.mipmap.frog_foreground, R.mipmap.rhino_foreground));
        }
        return images;
    }

    public MutableLiveData<List<String>> getNames() {
        if (names == null) {
            names = new MutableLiveData<List<String>>(Arrays.asList("snail", "frog", "rhino"));
        }
        return names;
    }

    public void setNames(String name, int position) {
        List<String> namelist = names.getValue();
        namelist.set(position, name);
        names.setValue(namelist);
    }

    public MutableLiveData<List<String>> getOwners() {
        if (owners == null) {
            owners = new MutableLiveData<List<String>>(Arrays.asList("Diogo", "Andre", "Mariana"));
        }
        return owners;
    }

    public void setOwners(String owner, int position) {
        List<String> ownerlist = owners.getValue();
        ownerlist.set(position, owner);
        owners.setValue(ownerlist);
    }

    public MutableLiveData<List<String>> getAges() {
        if (ages == null) {
            ages = new MutableLiveData<List<String>>(Arrays.asList("5", "12", "34"));
        }
        return ages;
    }

    public void setAges(String age, int position) {
        List<String> agelist = ages.getValue();
        agelist.set(position, age);
        ages.setValue(agelist);
    }
}