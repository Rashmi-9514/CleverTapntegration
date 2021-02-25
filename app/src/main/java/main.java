import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.clevertap.android.sdk.CleverTapAPI;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CleverTapAPI clevertapDefaultInstance = CleverTapAPI.getDefaultInstance(getApplicationContext());
        //Update pre-defined profile properties
        profileUpdate.put("Name", "Jack Montana");
        profileUpdate.put("Email", "jack@gmail.com");
//Update custom profile properties
        profileUpdate.put("Plan Type", "Silver");
        profileUpdate.put("Favorite Food", "Pizza");

        clevertapDefaultInstance.pushProfile(profileUpdate);
    }
}