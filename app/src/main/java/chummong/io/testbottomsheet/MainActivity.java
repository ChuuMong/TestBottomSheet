package chummong.io.testbottomsheet;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View bottomSheet = findViewById(R.id.bottom_sheet);
        findViewById(R.id.button_01).setOnClickListener(this);
        findViewById(R.id.button_02).setOnClickListener(this);
        findViewById(R.id.button_03).setOnClickListener(this);

        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_01:
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                break;

        }
    }
}
