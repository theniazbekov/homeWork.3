package com.example.homework3;

import android.animation.Animator;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.homework3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    boolean isBmw, isMers, isAudi;

    public MainActivity(ActivityMainBinding binding) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupListener();
    }

    private void setupListener() {
        binding.btnBmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isBmw) {
                    Toast.makeText(MainActivity.this, "TRUE", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(5)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnBmw.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnBmw.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnBmw);
                } else {
                    Toast.makeText(MainActivity.this, "FALSE", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(5)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnBmw.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnBmw.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnBmw);
                }
            }
        });

        binding.btnMers.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if (isMers) {
                    Toast.makeText(MainActivity.this, "TRUE", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(5)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnMers.setBackgroundColor(Color.GREEN);
                                }
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnMers.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnMers);

                } else {
                    Toast.makeText(MainActivity.this, "FALSE", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(5)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnMers.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnMers.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnMers);
                }
            }
        });
        binding.btnAudi.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if (isAudi) {
                    Toast.makeText(MainActivity.this, "TRUE", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(5)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnAudi.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnAudi.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnAudi);
                } else {
                    Toast.makeText(MainActivity.this, "FALSE", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(5)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnAudi.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnAudi.setBackgroundColor(Color.BLUE);
                                }
                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnAudi);
                }
            }
        });
    }


    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                binding.imImage.setImageResource(R.drawable.bmw);
                isBmw = true;
                isMers = false;
                isAudi = false;
                break;

            case R.id.btn_two:
                binding.imImage.setImageResource(R.drawable.mers);
                isBmw = false;
                isMers = true;
                isAudi = false;
                break;

            case R.id.btn_three:
                binding.imImage.setImageResource(R.drawable.audi);
                isBmw = false;
                isMers = false;
                isAudi = true;
                break;
        }
    }
}