package com.tes.tapf.sensors;

import android.hardware.SensorEvent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.hardware.Sensor;
import  android.hardware.SensorManager;
import  android.hardware.SensorEventListener;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    SensorManager sensorManager;
    Sensor sensor;
    List<Sensor> list;
    TextView textView;
    TextView textViewValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =  findViewById(R.id.textView);
        textViewValues = findViewById(R.id.textViewValues);
        textViewValues.setText("text view ready");
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        list = sensorManager.getSensorList(Sensor.TYPE_ALL);
        for (int i = 0; i<list.size(); i++) {
            textView.append(list.get(i).toString());
            textView.append("\n");
        }
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    }

    @Override
    protected void onPause(){
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    protected void onResume(){
        super.onResume();
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor1, int accuracy){

    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent){
        if(sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER){
            float x = sensorEvent.values[0];
            float y = sensorEvent.values[1];
            float z = sensorEvent.values[2];
            textViewValues.setText("--------------\n"+"X: "+x+"\nY: "+y+"\nZ: "+z);
        }else{
            textViewValues.setText("No Sensor data");
        }
    }
}
