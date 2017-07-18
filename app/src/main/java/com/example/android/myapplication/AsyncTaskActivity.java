package com.example.android.myapplication;

import android.app.ProgressDialog;
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
                String sleepTime = time.getText().toString();
                myAsyncTask.execute(sleepTime);
            }
        });
    }

    private class MyAsyncTask extends AsyncTask<String, String, String>{

        // <VarArg Param, ProgressValue Param, ResultValue Param>

        private String resp;
        ProgressDialog progressDialog;

        @Override
        protected String doInBackground(String... params) { //VarArg Param, Return ResultValue

            publishProgress(" sleeping..."); // Calls onProgressUpdate()

                try {
                    int time = Integer.parseInt(params[0])*1000;
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    resp = e.getMessage();
                } catch (Exception e) {
                    e.printStackTrace();
                    resp = e.getMessage();
                }
                return resp;
        }

        //control+O to add Override Method


        @Override
        protected void onPreExecute() {
            progressDialog = ProgressDialog.show(AsyncTaskActivity.this,
                "ProgressDialog",
                "Wait for "+time.getText().toString()+ " seconds");
        }

        @Override
        protected void onPostExecute(String s) { //ResultValue Param
            // execution of result of Long time consuming operation
            progressDialog.dismiss();
            finalResult.setText("Slept for "+ time.getText().toString()+ " minutes");
        }

        @Override
        protected void onProgressUpdate(String... values) { //ProgressValueParam
            finalResult.setText("progress " +values[0]);

        }
    }
}
