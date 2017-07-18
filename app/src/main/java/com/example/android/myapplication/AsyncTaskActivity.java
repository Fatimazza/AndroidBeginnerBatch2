package com.example.android.myapplication;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AsyncTaskActivity extends AppCompatActivity {

    private Button button;
    private EditText time;
    private TextView finalResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);

        time = (EditText) findViewById(R.id.et_time);
        button = (Button) findViewById(R.id.btn_run);
        finalResult = (TextView) findViewById(R.id.tv_result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyAsyncTask myAsyncTask = new MyAsyncTask();
                myAsyncTask.execute();
            }
        });
    }

    private class MyAsyncTask extends AsyncTask<String, Void, String>{

        // <VarArg Param, ProgressValue Param, ResultValue Param>

        @Override
        protected String doInBackground(String... params) { //VarArg Param, Return ResultValue
            String result = "";
            for (int i=0; i<params.length; i++) {

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (isCancelled()){
                    break;
                }

                result += params[i];
            }
            return result;
        }

        //control+O to add Override Method

        @Override
        protected void onPostExecute(String s) { //ResultValue Param
            finalResult.setText(s);
        }

        @Override
        protected void onProgressUpdate(Void... values) { //ProgressValueParam
            super.onProgressUpdate(values);
        }
    }
}
