package pt.cm.challenge_1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Arrays;
import java.util.List;

public class SharedViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData <List<String>> names, owners, ages;
    private  MutableLiveData <List<Integer>> images;

    public MutableLiveData <List<Integer>> getImages() {
        if (images == null) {
            images = new MutableLiveData<List<Integer>>(Arrays.asList(R.mipmap.snail_foreground,R.mipmap.frog_foreground,R.mipmap.rhino_foreground));
        }
        return images;
    }

    public MutableLiveData <List<String>> getNames() {
        if (names == null) {
            names = new MutableLiveData<List<String>>(Arrays.asList("snail", "frog", "rhino"));
        }
        return names;
    }

    public MutableLiveData <List<String>> getOwners() {
        if (owners == null) {
            owners = new MutableLiveData<List<String>>(Arrays.asList("Diogo", "Andre", "Mariana"));
        }
        return owners;
    }

    public MutableLiveData <List<String>> getAges() {
        if (ages == null) {
            ages = new MutableLiveData<List<String>>(Arrays.asList("5", "12", "34"));
        }
        return ages;
    }

//    public void setNames(String input)
//    {
//        text.setValue(input);
//    }

//    public LiveData<String> getText()
//    {
//        return text;
//    }
}