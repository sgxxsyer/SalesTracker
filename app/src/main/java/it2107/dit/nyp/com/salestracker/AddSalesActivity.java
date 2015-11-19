package it2107.dit.nyp.com.salestracker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Date;

import it2107.dit.nyp.com.salestracker.entity.Sale;

public class AddSalesActivity extends Activity {
    EditText etItemName;
    EditText etItemCostPrice;
    EditText etItemSellingPrice;
    EditText etDateOfSale;
    EditText etQuantitySold;
    Button btnSaveChanges;
    CheckBox chkEditDate;
    RadioButton rbtnStaffRateYes;
    RadioButton rbtnStaffRateNo;
    Sale s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_sales);


        etItemName =(EditText)findViewById(R.id.etName);
        etItemCostPrice =(EditText)findViewById(R.id.etCostPrice);
        etItemSellingPrice =(EditText)findViewById(R.id.etSellingprice);
        etDateOfSale =(EditText)findViewById(R.id.etDateOfSale);
        etQuantitySold =(EditText)findViewById(R.id.etQtyprice);
        btnSaveChanges=(Button) findViewById(R.id.btnSaveChgs);
        chkEditDate=(CheckBox) findViewById(R.id.chkEditDate);
        rbtnStaffRateNo=(RadioButton)findViewById(R.id.rbtnStaffrateNo);
        rbtnStaffRateYes=(RadioButton)findViewById(R.id.rbtnStaffrateYes);
        btnSaveChanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayString("Clicked");
               String itemName =etItemName.getText().toString();
                double costPrice = Double.parseDouble(etItemCostPrice.getText().toString());
                double sellingPrice = Double.parseDouble(etItemSellingPrice.getText().toString());
                int quantitySold = Integer.parseInt(etQuantitySold.getText().toString());
                Date dateSold =new Date();
                boolean staffRate =true;

                s= new Sale(staffRate,itemName, costPrice, sellingPrice, quantitySold,dateSold);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_sales, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private  void displayString(String s){
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
    }

}
