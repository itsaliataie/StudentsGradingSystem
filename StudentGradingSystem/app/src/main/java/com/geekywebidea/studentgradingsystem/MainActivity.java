package com.geekywebidea.studentgradingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView idTvRes;
    TextView idRes;
    TextView cTvRes;
    TextView cRes;
    TextView marksTvRes;
    TextView marksRes;
    TextView gradesTvRes;
    TextView gradeRes;

    EditText idEdit;
    EditText courseEdit;
    EditText marksEdit;

    Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idTvRes = (TextView) findViewById(R.id.idTVRes);
        idRes = (TextView) findViewById(R.id.idRes);
        cTvRes = (TextView) findViewById(R.id.courseTVRes);
        cRes = (TextView) findViewById(R.id.courseRes);
        marksTvRes = (TextView) findViewById(R.id.marksTVRes);
        marksRes = (TextView) findViewById(R.id.marksRes);
        gradesTvRes = (TextView) findViewById(R.id.gradeTVRes);
        gradeRes = (TextView) findViewById(R.id.gradeRes);

        idEdit = (EditText) findViewById(R.id.idEdit);
        courseEdit = (EditText) findViewById(R.id.courseEdit);
        marksEdit = (EditText) findViewById(R.id.marksEdit);

        showButton = (Button) findViewById(R.id.showButton);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sSID = idEdit.getText().toString();
                int sID = Integer.parseInt(sSID);
                String courseName = courseEdit.getText().toString();
                String sMarks = marksEdit.getText().toString();
                double marks = Double.parseDouble(sMarks);

                if (marks <= 100) {

                    idTvRes.setText("Student ID");
                    cTvRes.setText("Course name");
                    marksTvRes.setText("Total Marks");
                    gradesTvRes.setText("Grade");

                    idRes.setText(""+sID);

                    cRes.setText(courseName.toUpperCase());

                    marksRes.setText("" + marks);

                    cal(marks);

                } else {
                    Toast.makeText(getApplicationContext(), "Grade should be less than 100",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public void cal(double marks) {

        if (marks >= 94 && marks <= 100) {
            gradeRes.setText("A");
        } else if(marks >= 90 && marks < 94) {
            gradeRes.setText("A-");
        } else if(marks >= 87 && marks < 90) {
            gradeRes.setText("B+");
        } else if(marks >= 84 && marks < 87) {
            gradeRes.setText("B");
        } else if(marks >= 80 && marks < 84) {
            gradeRes.setText("B-");
        } else if(marks >= 77 && marks < 80) {
            gradeRes.setText("C+");
        } else if(marks >= 74 && marks < 77) {
            gradeRes.setText("C");
        } else if(marks >= 70 && marks < 74) {
            gradeRes.setText("C-");
        } else if(marks >= 67 && marks < 70) {
            gradeRes.setText("D+");
        } else if(marks >= 60 && marks < 67) {
            gradeRes.setText("D");
        } else if(marks >= 0 && marks < 60) {
            gradeRes.setText("F");
        }

    }


}
