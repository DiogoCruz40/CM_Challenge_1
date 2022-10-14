package pt.cm.challenge_1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> text = new MutableLiveData<>();

    public void setText(String input)
    {
        text.setValue(input);
    }

    public LiveData<String> getText()
    {
        return text;
    }
}