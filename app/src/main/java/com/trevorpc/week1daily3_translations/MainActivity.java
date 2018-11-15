package com.trevorpc.week1daily3_translations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvRotsYourBrain;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRotsYourBrain =findViewById(R.id.hello_message);

        Person person = new Person(25,false,true,"Trevor");

        tvRotsYourBrain.setText("age:"+person.getAge()+",  hunger:"+person.isHungry()+" soul:"+
                person.isSoul()+" name:"+person.getName());


    }
}
