package android.com.demopiechart;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class LineChartActivity extends AppCompatActivity {

    private LineChart mChart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_line_chart);

        mChart = (LineChart) findViewById(R.id.chart1);

        addValues();

    }

    //https://www.numetriclabz.com/android-line-chart-using-mpandroidchart-tutorial/
    private void addValues()
    {
        // creating list of entry
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(4f, 0));
        entries.add(new Entry(8f, 1));
        entries.add(new Entry(6f, 2));
        entries.add(new Entry(2f, 3));
        entries.add(new Entry(15f, 4));
        entries.add(new Entry(9f, 5));

        LineDataSet dataset = new LineDataSet(entries, "");

        // creating labels
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");

        // set data
        LineData data = new LineData(labels, dataset);
        mChart.setData(data); // set the data and list of lables into chart
        mChart.setBorderColor(Color.RED);
        dataset.setDrawFilled(true);
      //  dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        mChart.setDescription("Description");  // set the description
       // mChart.animateXY(2000, 2000);
        mChart.animateY(3000);
    }
}