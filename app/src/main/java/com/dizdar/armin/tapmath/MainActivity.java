package com.dizdar.armin.tapmath;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

        private TextView output;
        private TextView chosenNumber;
        private TextView numberOfClicks;

        private IncrementController i;
        int result;
        int click;
        int number;





        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            i = new IncrementController();
            output = (TextView)findViewById(R.id.output);
            numberOfClicks = (TextView) findViewById(R.id.numberOfClicks);
            chosenNumber = (TextView) findViewById(R.id.chosenNumber);
            makeToast();
        }



        public void makeToast() {
            Toast t = Toast.makeText(this, "Choose a number and then start tapping in the center of the screen " , Toast.LENGTH_LONG);
            t.show();
        }



        public int onClick (View view){
            switch (view.getId()) {
                case R.id.button1:
                    i.setControllerNumber(1);
                    update();
                    break;

                case R.id.button2:
                    i.setControllerNumber(2);
                    update();
                    break;

                case R.id.button3:
                    i.setControllerNumber(3);
                    update();
                    break;

                case R.id.button4:
                    i.setControllerNumber(4);
                    update();
                    break;

                case R.id.button5:
                    i.setControllerNumber(5);
                    update();
                    break;

                case R.id.button6:
                    i.setControllerNumber(6);
                    update();
                    break;

                case R.id.button7:
                    i.setControllerNumber(7);
                    update();
                    break;

                case R.id.button8:
                    i.setControllerNumber(8);
                    update();
                    break;

                case R.id.button9:
                    i.setControllerNumber(9);
                    update();
                    break;

                case R.id.button10:
                    i.setControllerNumber(10);
                    update();
                    break;

            }

            return number;

        }


        public void changeResult(View view){
            result = i.calculate();
            String res = Integer.toString((i.getZero()));
            output.setText(res);

            click = i.getClickCounter();
            String clickString = Integer.toString(click);
            numberOfClicks.setText(clickString);


        }

        public void update(){
            String res = Integer.toString((i.getZero()));
            output.setText(res);

            i.setClickCounter();
            int click = i.getClickCounter();
            String clickToString = Integer.toString(click);
            numberOfClicks.setText(clickToString);

            int e = i.getControllerNumber();
            String number = Integer.toString(e);
            chosenNumber.setText(number);
        }




    } //End of main