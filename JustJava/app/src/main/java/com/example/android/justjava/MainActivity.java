/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        // displayPrice(quantity * 5);
/*     int price = calculatePrice();
        String priceMessage=" Total  $" + price ;
        priceMessage = priceMessage + " \n Thank you." ;
        displayMessage(priceMessage);
*/
        CheckBox whippedCreamBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasWippedCreamBox = whippedCreamBox.isChecked();


        CheckBox ChocolateBox = (CheckBox) findViewById(R.id.chocolate_checkbox) ;
        boolean  hasChocolateBox = ChocolateBox.isChecked();

        EditText orderOwner =  (EditText) findViewById(R.id.order_owner_name);

        String orderOwnerName =orderOwner.getText().toString() ;

        ///
        /// for learning purpose
        /// String content = edtEditText.getText().toString();

        Log.v("MainActivity", "Has Whipped Cram " + hasWippedCreamBox);

        // int price = calculatePrice();


        String orderSummary = createOrderSummary(hasWippedCreamBox,hasChocolateBox , orderOwnerName);

        //displayMessage(orderSummary);

            composeEmail(orderSummary,orderOwnerName);
    }

    public String composeEmail(String orderDetails , String orderOwner) {
        String  subject = null;
        Uri     attachment = null ;
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto"));
        intent.setType("text/html");
        intent.putExtra(Intent.EXTRA_SUBJECT,"ORDER OWNER NAME : "+ orderOwner);
        intent.putExtra(intent.EXTRA_TEXT, orderDetails );
        intent.putExtra(Intent.EXTRA_STREAM, attachment);
        if (intent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent);
        }
        return orderDetails ;
    }

    /**
     * Calculates the price of the order.
     *  @param addWhippedCream  boolean for check if whippedcream is checked
     *  @param addChocolate  boolean for check if chocolate cream is checked
     * whippedCram + 1$ extra
     * chocolate  + 2$ extra
     *
     */
    private int calculatePrice(boolean addChocolate, boolean addWhippedCream ) {
        /*
        int price = quantity * 5;
        return price;
        or
        */


        int price = quantity*5 ;

        if (addChocolate)
        {
            price = price + 2 * quantity ;

        }
        if (addWhippedCream )
        {
            price = price + 1 * quantity;

        }

        return  price ;

    }


    /*
     * method creatOrederSummary
     * take the total quantaty of the order
     * take the total price of the oreder

     * return the full summary of the order
     * @return orderSummary
     */

    @SuppressLint("StringFormatInvalid")
    private String createOrderSummary (boolean addWhippedCream , boolean addChocolate, String orderOwner)
    {
        //String orederOwner = "Kaptin kunal";

        int price = calculatePrice(addChocolate , addWhippedCream);

         /*
            if (addChocolate)
            {
                price = price + 1 * quantity ;

            }
                if (addWhippedCream )
            {
                price = price + 2 * quantity;

            }
       */

        String orderSummary ;
        orderSummary =
                 getString(R.string.name) + "   : " + orderOwner +
                        "\n "+ getString(R.string.has_Whipped_Cream ) + "  :" + addWhippedCream +
                        "\n " + getString(R.string.has_Chocolate) + "    :" + addChocolate +
                        "\n  : " + getString(R.string.quantity) + "  :"+  quantity + getString(R.string.cups) +
                        "\n " + getString(R.string.price, NumberFormat.getCurrencyInstance().format(price))  + "  :"  + price +
                        "\n" + getString(R.string.thank_you) ;
//        return  orderSummary;



/*
        Intent intent = new Intent();
        intent = new Intent(intent.ACTION_SENDTO);
        intent.setType("text/html");
        intent.putExtra(Intent.EXTRA_EMAIL, "emailaddress@emailaddress.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        intent.putExtra(Intent.EXTRA_TEXT, orderOwner);

        startActivity(Intent.createChooser(intent, "Send Email"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
*/
        return  orderSummary;

    }






    /**
     * This method displays the increment quantity value on the screen.
     */
    public void increment(View view) {

        if (quantity >0 &&  quantity >=100)
        {
            Context context = getApplicationContext();
            CharSequence text = "please enter Number between 1 to 100 Cups ";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        else
        {
            quantity = quantity + 1;
            displayQuantity(quantity);
        }
    }

    /**
     * This method displays the decrement quantity value on the screen.
     */
    public void decrement(View view) {

        if (quantity <=0)
        {
            Context context = getApplicationContext();
            CharSequence text = "please enter Number between 1 to 100 Cups ";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else
        {
            quantity = quantity - 1;
            displayQuantity(quantity);
        }
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number ) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

//    /**
//     * This method displays the given price on the screen.
//     */
//     private void displayPrice(int number) {
//        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
//        priceTextView.setText(java.text.NumberFormat.getCurrencyInstance().format(number));
//    }


    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

}