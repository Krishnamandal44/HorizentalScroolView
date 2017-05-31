package rayan.avik.horizentalscroolview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView period_1st, period_2nd, period_3rd, period_4th,period_5th, period_6th, period_7th, period_8th;
    TextView mon1stClass, mon2ndClass, mon3rdClass, mon4thClass, mon5thClass, mon6thClass, mon7thClass, mon8thClass;
    TextView tue1stClass, tue2ndClass, tue3rdClass, tue4thClass, tue5thClass, tue6thClass, tue7thClass, tue8thClass;
    TextView wed1stClass, wed2ndClass, wed3rdClass, wed4thClass, wed5thClass, wed6thClass, wed7thClass, wed8thClass;
    TextView thu1stClass, thu2ndClass, thu3rdClass, thu4thClass, thu5thClass, thu6thClass, thu7thClass, thu8thClass;
    TextView fri1stClass, fri2ndClass, fri3rdClass, fri4thClass, fri5thClass, fri6thClass, fri7thClass, fri8thClass;
    TextView sat1stClass, sat2ndClass, sat3rdClass, sat4thClass, sat5thClass, sat6thClass, sat7thClass, sat8thClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //////////////////Find ViewBy ID //////////////////

        //////////PERIOD//////////
        period_1st = (TextView) findViewById(R.id.period_1st);
        period_2nd = (TextView) findViewById(R.id.period_2nd);
        period_3rd = (TextView) findViewById(R.id.period_3rd);
        period_4th = (TextView) findViewById(R.id.period_4th);
        period_5th = (TextView) findViewById(R.id.period_5th);
        period_6th = (TextView) findViewById(R.id.period_6th);
        period_7th = (TextView) findViewById(R.id.period_7th);
        period_8th = (TextView) findViewById(R.id.period_8th);

        /////////MONDAY////////////
        mon1stClass = (TextView) findViewById(R.id.tv_mon_1stclass);
        mon2ndClass = (TextView) findViewById(R.id.tv_mon_2ndclass);
        mon3rdClass = (TextView) findViewById(R.id.tv_mon_3rdclass);
        mon4thClass = (TextView) findViewById(R.id.tv_mon_4thclass);
        mon5thClass = (TextView) findViewById(R.id.tv_mon_5thclass);
        mon6thClass = (TextView) findViewById(R.id.tv_mon_6thclass);
        mon7thClass = (TextView) findViewById(R.id.tv_mon_7thclass);
        mon8thClass = (TextView) findViewById(R.id.tv_mon_8thclass);

        /////////TUESDAY///////////
        tue1stClass = (TextView) findViewById(R.id.tv_tue_1stclass);
        tue2ndClass = (TextView) findViewById(R.id.tv_tue_2ndclass);
        tue3rdClass = (TextView) findViewById(R.id.tv_tue_3rdclass);
        tue4thClass = (TextView) findViewById(R.id.tv_tue_4thclass);
        tue5thClass = (TextView) findViewById(R.id.tv_tue_5thclass);
        tue6thClass = (TextView) findViewById(R.id.tv_tue_6thclass);
        tue7thClass = (TextView) findViewById(R.id.tv_tue_7thclass);
        tue8thClass = (TextView) findViewById(R.id.tv_tue_8thclass);

        ////////////WEDNESDAY//////////////
        wed1stClass = (TextView) findViewById(R.id.tv_wed_1stclass);
        wed2ndClass = (TextView) findViewById(R.id.tv_wed_2ndclass);
        wed3rdClass = (TextView) findViewById(R.id.tv_wed_3rdclass);
        wed4thClass = (TextView) findViewById(R.id.tv_wed_4thclass);
        wed5thClass = (TextView) findViewById(R.id.tv_wed_5thclass);
        wed6thClass = (TextView) findViewById(R.id.tv_wed_6thclass);
        wed7thClass = (TextView) findViewById(R.id.tv_wed_7thclass);
        wed8thClass = (TextView) findViewById(R.id.tv_wed_8thclass);

        ///////////THURSDAY//////////////////
        thu1stClass = (TextView) findViewById(R.id.tv_thu_1stclass);
        thu2ndClass = (TextView) findViewById(R.id.tv_thu_2ndclass);
        thu3rdClass = (TextView) findViewById(R.id.tv_thu_3rdclass);
        thu4thClass = (TextView) findViewById(R.id.tv_thu_4thclass);
        thu5thClass = (TextView) findViewById(R.id.tv_thu_5thclass);
        thu6thClass = (TextView) findViewById(R.id.tv_thu_6thclass);
        thu7thClass = (TextView) findViewById(R.id.tv_thu_7thclass);
        thu8thClass = (TextView) findViewById(R.id.tv_thu_8thclass);

        //////////FRIDAY//////////////
        fri1stClass = (TextView) findViewById(R.id.tv_fri_1stclass);
        fri2ndClass = (TextView) findViewById(R.id.tv_fri_2ndclass);
        fri3rdClass = (TextView) findViewById(R.id.tv_fri_3rdclass);
        fri4thClass = (TextView) findViewById(R.id.tv_fri_4thclass);
        fri5thClass = (TextView) findViewById(R.id.tv_fri_5thclass);
        fri6thClass = (TextView) findViewById(R.id.tv_fri_6thclass);
        fri7thClass = (TextView) findViewById(R.id.tv_fri_7thclass);
        fri8thClass = (TextView) findViewById(R.id.tv_fri_8thclass);

        /////////////SATDAY/////////////////////
        sat1stClass = (TextView) findViewById(R.id.tv_sat_1stclass);
        sat2ndClass = (TextView) findViewById(R.id.tv_sat_2ndclass);
        sat3rdClass = (TextView) findViewById(R.id.tv_sat_3rdclass);
        sat4thClass = (TextView) findViewById(R.id.tv_sat_4thclass);
        sat5thClass = (TextView) findViewById(R.id.tv_sat_5thclass);
        sat6thClass = (TextView) findViewById(R.id.tv_sat_6thclass);
        sat7thClass = (TextView) findViewById(R.id.tv_sat_7thclass);
        sat8thClass = (TextView) findViewById(R.id.tv_sat_8thclass);

    }
}
