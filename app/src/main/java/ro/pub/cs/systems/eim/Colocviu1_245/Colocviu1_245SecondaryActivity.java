package ro.pub.cs.systems.eim.Colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Colocviu1_245SecondaryActivity extends AppCompatActivity {
    public static int findSum(String str)
    {
        // A temporary string
        String temp = "";

        // holds sum of all numbers present in the string
        int sum = 0;

        // read each character in input string
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            // if current character is a digit
            if (Character.isDigit(ch))
                temp += ch;

                // if current character is an alphabet
            else
            {
                // increment sum by number found earlier
                // (if any)
                sum += Integer.parseInt(temp);

                // reset temporary string to empty
                temp = "0";
            }
        }

        // atoi(temp.c_str()) takes care of trailing
        // numbers
        return sum + Integer.parseInt(temp);
    }
    protected void onCreate(Bundle savedInstanceState) {
        int sum = 0;
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        String theSum = i.getStringExtra("theSum");
        sum = findSum(theSum);
        Intent intent = new Intent();
        intent.putExtra("suma", Integer.toString(sum));
        setResult(RESULT_OK, intent);
        finish();
        //return sum;
    }
}
