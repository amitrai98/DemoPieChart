package android.com.demopiechart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void openPieChart(View view) {
        startActivity(new Intent(ListActivity.this, MainActivity.class));
    }

    public void openLineChart(View view) {
        startActivity(new Intent(ListActivity.this, LineChartActivity.class));
    }
}
