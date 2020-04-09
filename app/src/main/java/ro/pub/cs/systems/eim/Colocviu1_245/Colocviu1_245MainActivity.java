package ro.pub.cs.systems.eim.Colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Colocviu1_245MainActivity extends AppCompatActivity {
    private Button button;
    private Button buttonAdd;
    private EditText upEditText;
    private EditText downEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_245_main);

        button = (Button) findViewById(R.id.down_button);
        buttonAdd = (Button) findViewById(R.id.up_button);
        upEditText = (EditText) findViewById(R.id.up_edit_text);
        downEditText = (EditText) findViewById(R.id.down_edit_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String setText = String.valueOf(upEditText.getText().toString());
                String theText = String.valueOf(downEditText.getText().toString());

                switch(v.getId()) {
                    case R.id.up_button:
                        if(setText.matches("-?(0|[1-9]\\d*)")) {
                            theText = theText.concat("+");
                            theText = theText.concat(setText);
                            downEditText.setText(theText);
                        }
                        break;
                }
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Colocviu1_245SecondaryActivity.class);
        startActivity(intent);
    }
}
