package com.example.statki;
//                                                                                                    ↑ wow!
//                                                                                                        laser->
import android.os.*
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
ImageButton button = (ImageButton) findViewById(R.id.imageButton);
ImageButton button2 = (ImageButton) findViewById(R.id.ImageButton2);
ImageButton button3 = (ImageButton) findViewById(R.id.ImageButton3);
ImageButton button4 = (ImageButton) findViewById(R.id.ImageButton4);
ImageButton button5 = (ImageButton) findViewById(R.id.imageButton5);
ImageButton button6 = (ImageButton) findViewById(R.id.imageButton6);
ImageButton button7 = (ImageButton) findViewById(R.id.imageButton8);
ImageButton button8 = (ImageButton) findViewById(R.id.imageButton9);
ImageButton button9 = (ImageButton) findViewById(R.id.imageButton10);
ImageButton button10 = (ImageButton) findViewById(R.id.imageButton11);
ImageButton button11 = (ImageButton) findViewById(R.id.imageButton12);
ImageButton button12 = (ImageButton) findViewById(R.id.imageButton13);
ImageButton button13 = (ImageButton) findViewById(R.id.imageButton14);
ImageButton button14 = (ImageButton) findViewById(R.id.imageButton15);
ImageButton button15 = (ImageButton) findViewById(R.id.imageButton16);
ImageButton button16 = (ImageButton) findViewById(R.id.imageButton17);
ImageButton button17 = (ImageButton) findViewById(R.id.imageButton18);
ImageButton button18 = (ImageButton) findViewById(R.id.imageButton19);
ImageButton button19 = (ImageButton) findViewById(R.id.imageButton20);
ImageButton button20 = (ImageButton) findViewById(R.id.imageButton21);
ImageButton button21 = (ImageButton) findViewById(R.id.imageButton22);
ImageButton button22 = (ImageButton) findViewById(R.id.imageButton23);
ImageButton button23 = (ImageButton) findViewById(R.id.imageButton24);
ImageButton button24 = (ImageButton) findViewById(R.id.imageButton25);
ImageButton button25 = (ImageButton) findViewById(R.id.imageButton26);
ImageButton button26 = (ImageButton) findViewById(R.id.imageButton27);
ImageButton button27 = (ImageButton) findViewById(R.id.imageButton28);
ImageButton button28 = (ImageButton) findViewById(R.id.imageButton29);
ImageButton button29 = (ImageButton) findViewById(R.id.imageButton30);
ImageButton button30 = (ImageButton) findViewById(R.id.imageButton31);
ImageButton button31 = (ImageButton) findViewById(R.id.imageButton32);
ImageButton button32 = (ImageButton) findViewById(R.id.imageButton33);
ImageButton button33 = (ImageButton) findViewById(R.id.imageButton34);
ImageButton button34 = (ImageButton) findViewById(R.id.imageButton35);
ImageButton button35 = (ImageButton) findViewById(R.id.imageButton36);
ImageButton button36 = (ImageButton) findViewById(R.id.imageButton37);
ImageButton button37 = (ImageButton) findViewById(R.id.imageButton38);
ImageButton button38 = (ImageButton) findViewById(R.id.imageButton39);
ImageButton button39 = (ImageButton) findViewById(R.id.imageButton40);
ImageButton button40 = (ImageButton) findViewById(R.id.imageButton41);
ImageButton button41 = (ImageButton) findViewById(R.id.imageButton42);
ImageButton button42 = (ImageButton) findViewById(R.id.imageButton43);
ImageButton button43 = (ImageButton) findViewById(R.id.imageButton44);
ImageButton button44 = (ImageButton) findViewById(R.id.imageButton45);
ImageButton button45 = (ImageButton) findViewById(R.id.imageButton46);
ImageButton button46 = (ImageButton) findViewById(R.id.imageButton47);
ImageButton button47 = (ImageButton) findViewById(R.id.imageButton48);
ImageButton button48 = (ImageButton) findViewById(R.id.imageButton49);
ImageButton button49 = (ImageButton) findViewById(R.id.imageButton50);
ImageButton button50 = (ImageButton) findViewById(R.id.imageButton51);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button10.setEnabled(false);
        button11.setEnabled(false);
        button12.setEnabled(false);
        button13.setEnabled(false);
        button14.setEnabled(false);
        button15.setEnabled(false);
        button16.setEnabled(false);
        button17.setEnabled(false);
        button18.setEnabled(false);
        button19.setEnabled(false);
        button20.setEnabled(false);
        button21.setEnabled(false);
        button22.setEnabled(false);
        button23.setEnabled(false);
        button24.setEnabled(false);
        button25.setEnabled(false);
        button26.setEnabled(false);
        button27.setEnabled(false);
        button28.setEnabled(false);
        button29.setEnabled(false);
        button30.setEnabled(false);
        button31.setEnabled(false);
        button32.setEnabled(false);
        button33.setEnabled(false);
        button34.setEnabled(false);
        button35.setEnabled(false);
        button36.setEnabled(false);
        button37.setEnabled(false);
        button38.setEnabled(false);
        button39.setEnabled(false);
        button40.setEnabled(false);
        button41.setEnabled(false);
        button42.setEnabled(false);
        button43.setEnabled(false);
        button44.setEnabled(false);
        button45.setEnabled(false);
        button46.setEnabled(false);
        button47.setEnabled(false);
        button48.setEnabled(false);
        button49.setEnabled(false);
        button50.setEnabled(false);
        for(int i = 0; i < 5; i++){
            int random = new Random().nextInt(50);
            switch (random){
                case 0:
                    button.setEnabled(true);
                    break;
                case 1:
                    button2.setEnabled(true);
                    break;
                case 2:
                    button3.setEnabled(true);
                    break;
                case 3:
                    button4.setEnabled(true);
                    break;
                case 4:
                    button5.setEnabled(true);
                    break;
                case 5:
                    button6.setEnabled(true);
                    break;
                case 6:
                    button7.setEnabled(true);
                    break;
                case 7:
                    button8.setEnabled(true);
                    break;
                case 8:
                    button9.setEnabled(true);
                    break;
                case 9:
                    button10.setEnabled(true);
                    break;
                case 10:
                    button11.setEnabled(true);
                    break;
                case 11:
                    button12.setEnabled(true);
                    break;
                case 12:
                    button13.setEnabled(true);
                    break;
                case 13:
                    button14.setEnabled(true);
                    break;
                case 14:
                    button15.setEnabled(true);
                    break;
                case 15:
                    button16.setEnabled(true);
                    break;
                case 16:
                    button17.setEnabled(true);
                    break;
                case 17:
                    button18.setEnabled(true);
                    break;
                case 18:
                    button19.setEnabled(true);
                    break;
                case 19:
                    button20.setEnabled(true);
                    break;
                case 20:
                    button21.setEnabled(true);
                    break;
                case 21:
                    button22.setEnabled(true);
                    break;
                case 22:
                    button23.setEnabled(true);
                    break;
                case 23:
                    button24.setEnabled(true);
                    break;
                case 24:
                    button25.setEnabled(true);
                    break;
                case 25:
                    button26.setEnabled(true);
                    break;
                case 26:
                    button27.setEnabled(true);
                    break;
                case 27:
                    button28.setEnabled(true);
                    break;
                case 28:
                    button29.setEnabled(true);
                    break;
                case 29:
                    button30.setEnabled(true);
                    break;
                case 30:
                    button31.setEnabled(true);
                    break;
                case 31:
                    button32.setEnabled(true);
                    break;
                case 32:
                    button33.setEnabled(true);
                    break;
                case 33:
                    button34.setEnabled(true);
                    break;
                case 34:
                    button35.setEnabled(true);
                    break;
                case 35:
                    button36.setEnabled(true);
                    break;
                case 36:
                    button37.setEnabled(true);
                    break;
                case 37:
                    button38.setEnabled(true);
                    break;
                case 38:
                    button39.setEnabled(true);
                    break;
                case 39:
                    button40.setEnabled(true);
                    break;
                case 40:
                    button41.setEnabled(true);
                    break;
                case 41:
                    button42.setEnabled(true);
                    break;
                case 42:
                    button43.setEnabled(true);
                    break;
                case 43:
                    button44.setEnabled(true);
                    break;
                case 44:
                    button45.setEnabled(true);
                    break;
                case 45:
                    button46.setEnabled(true);
                    break;
                case 46:
                    button47.setEnabled(true);
                    break;
                case 47:
                    button48.setEnabled(true);
                    break;
                case 48:
                    button49.setEnabled(true);
                    break;
                case 49:
                    button50.setEnabled(true);
                    break;
                default:
                    break;
            }
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setVisibility(View.INVISIBLE);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2.setVisibility(View.INVISIBLE);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3.setVisibility(View.INVISIBLE);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4.setVisibility(View.INVISIBLE);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5.setVisibility(View.INVISIBLE);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button6.setVisibility(View.INVISIBLE);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button7.setVisibility(View.INVISIBLE);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button8.setVisibility(View.INVISIBLE);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button9.setVisibility(View.INVISIBLE);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button10.setVisibility(View.INVISIBLE);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button11.setVisibility(View.INVISIBLE);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button12.setVisibility(View.INVISIBLE);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button13.setVisibility(View.INVISIBLE);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button14.setVisibility(View.INVISIBLE);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button15.setVisibility(View.INVISIBLE);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button16.setVisibility(View.INVISIBLE);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button17.setVisibility(View.INVISIBLE);
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button18.setVisibility(View.INVISIBLE);
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button19.setVisibility(View.INVISIBLE);
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button20.setVisibility(View.INVISIBLE);
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button21.setVisibility(View.INVISIBLE);
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button22.setVisibility(View.INVISIBLE);
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button23.setVisibility(View.INVISIBLE);
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button24.setVisibility(View.INVISIBLE);
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button25.setVisibility(View.INVISIBLE);
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button26.setVisibility(View.INVISIBLE);
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button27.setVisibility(View.INVISIBLE);
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button28.setVisibility(View.INVISIBLE);
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button29.setVisibility(View.INVISIBLE);
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button30.setVisibility(View.INVISIBLE);
            }

        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button31.setVisibility(View.INVISIBLE);
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button32.setVisibility(View.INVISIBLE);
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button33.setVisibility(View.INVISIBLE);
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button34.setVisibility(View.INVISIBLE);
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button35.setVisibility(View.INVISIBLE);
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button36.setVisibility(View.INVISIBLE);
            }
        });
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button37.setVisibility(View.INVISIBLE);
            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button38.setVisibility(View.INVISIBLE);
            }
        });
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button39.setVisibility(View.INVISIBLE);
            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button40.setVisibility(View.INVISIBLE);
            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button41.setVisibility(View.INVISIBLE);
            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button42.setVisibility(View.INVISIBLE);
            }
        });
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button43.setVisibility(View.INVISIBLE);
            }
        });
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button44.setVisibility(View.INVISIBLE);
            }
        });
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button45.setVisibility(View.INVISIBLE);
            }
        });
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button46.setVisibility(View.INVISIBLE);
            }
        });
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button47.setVisibility(View.INVISIBLE);
            }
        });
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button48.setVisibility(View.INVISIBLE);
            }
        });
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button49.setVisibility(View.INVISIBLE);
            }
        });
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button50.setVisibility(View.INVISIBLE);
            }
    });}}
