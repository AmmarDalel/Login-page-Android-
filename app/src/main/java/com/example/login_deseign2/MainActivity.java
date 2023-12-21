package com.example.login_deseign2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtenez les vues que vous souhaitez animer
        EditText emailEditText = findViewById(R.id.email);
        EditText passwordEditText = findViewById(R.id.password);
        Button  login_btn= findViewById(R.id.btn_login) ;

        // Chargez l'animation depuis les ressources
        Animation slideUpAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_up);

        // Appliquez l'animation aux vues
        emailEditText.startAnimation(slideUpAnimation);
        passwordEditText.startAnimation(slideUpAnimation);
        login_btn.startAnimation(slideUpAnimation);

        ImageView imageViewLogo = findViewById(R.id.imageViewLogo);
        Glide.with(this)
                .load(R.drawable.login_img2)
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(imageViewLogo);
    }

}