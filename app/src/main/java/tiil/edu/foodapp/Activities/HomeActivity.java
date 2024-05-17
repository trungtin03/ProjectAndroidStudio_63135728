package tiil.edu.foodapp.Activities;

import static tiil.edu.foodapp.R.*;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

import tiil.edu.foodapp.R;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_home);

        LottieAnimationView lottieAnimationView = findViewById(R.id.lottieAnimationView);
        lottieAnimationView.setAnimation(R.raw.shoping2); // Đặt hoạt ảnh
        lottieAnimationView.setRepeatCount(LottieDrawable.INFINITE); // Lặp lại vô hạn
        lottieAnimationView.playAnimation(); // Bắt đầu phát hoạt ảnh
    }
}