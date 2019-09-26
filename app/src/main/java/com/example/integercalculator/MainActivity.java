package com.example.integercalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Constants for button values
    private static final int BUTTON_0_VAL = 0;
    private static final int BUTTON_1_VAL = 1;
    private static final int BUTTON_2_VAL = 2;
    private static final int BUTTON_3_VAL = 3;
    private static final int BUTTON_4_VAL = 4;
    private static final int BUTTON_5_VAL = 5;
    private static final int BUTTON_6_VAL = 6;
    private static final int BUTTON_7_VAL = 7;
    private static final int BUTTON_8_VAL = 8;
    private static final int BUTTON_9_VAL = 9;

    private static final int NO_OPERATOR_CODE = -1;
    private static final int PLUS_CODE = 0;
    private static final int MINUS_CODE = 1;
    private static final int STAR_CODE = 2;
    private static final int SLASH_CODE = 3;

    private static final int INVERT = -1;

    private static final int BASE = 10;

    private static final String DISPLAY_EMPTY = "";
    private static final String DISPLAY_DEFAULT = "0";

    private static final String OVERFLOW_ERROR = "OVERFLOW";

    //String that holds what is currently displayed
    private String displayVal = "0";

    //Stores first operand
    private int operand1 = 0;

    //holds value of operator
    private int operator = -1;

    private boolean error = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when buttonPlus is pressed
     *
     * @param view does something idk...
     */
    public void buttonPlusPressed( View view ) {
        if( !error ){
            if( operator == NO_OPERATOR_CODE) {
                operand1 = Integer.parseInt(displayVal, BASE);
                displayVal = DISPLAY_DEFAULT;
                updateDisplay();
            }
            operator = PLUS_CODE;
        }
    }
    /**
     * Called when buttonEnter is pressed
     *
     * @param view does something idk...
     */
    public void buttonEnterPressed( View view ) {
        if(error) {
            displayVal = DISPLAY_DEFAULT;
            error = false;
            operator = NO_OPERATOR_CODE;
        }
        switch(operator){
            case NO_OPERATOR_CODE:
                break;
            case PLUS_CODE:
                int operand2 = Integer.parseInt(displayVal,BASE);
                int result = operand1 + operand2;
                displayVal = Integer.toString(result);
                break;
            case MINUS_CODE:
                displayVal = Integer.toString(operand1 - Integer.getInteger(displayVal, BASE) );
                break;
            case STAR_CODE:
                displayVal = Integer.toString(operand1 * Integer.getInteger(displayVal, BASE) );
                break;
            case SLASH_CODE:
                displayVal = Integer.toString(operand1 / Integer.getInteger(displayVal, BASE) );
                break;
            default:
                break;
        }
        updateDisplay();
        operand1 = 0;
        operator = NO_OPERATOR_CODE;
    }

    /**
     * Called when buttonInvert is pressed
     *
     * @param view does something idk...
     */
    public void buttonInvertPressed( View view ){
        if(!error){
            int currentVal = Integer.valueOf(displayVal, BASE);
            currentVal *= INVERT;
            displayVal = Integer.toString(currentVal);
        } else {
            displayVal = DISPLAY_DEFAULT;
        }
        updateDisplay();
    }

    /**
     * Called when user presses button0
     *
     * @param view used for something idk...
     */
    public void button0Pressed( View view ) {
        if( error ) {
            displayVal = DISPLAY_EMPTY;
            error = false;
            updateDisplay();
        } else {
            try {
                if( Integer.parseInt(displayVal) == Integer.parseInt(DISPLAY_DEFAULT) ) {
                    displayVal = "";
                }
            } catch (NumberFormatException e) {
                displayVal = OVERFLOW_ERROR;
                error = true;
                updateDisplay();
            }
        }
        if( !error ) {
            displayVal += BUTTON_0_VAL;
            updateDisplay();
        }
    }

    /**
     * Called when user presses button1
     *
     * @param view used for something idk...
     */
    public void button1Pressed( View view ) {
        if( error ) {
            displayVal = DISPLAY_EMPTY;
            error = false;
            updateDisplay();
        } else {
            try {
                if( Integer.parseInt(displayVal) == Integer.parseInt(DISPLAY_DEFAULT) ) {
                    displayVal = "";
                }
            } catch (NumberFormatException e) {
                displayVal = OVERFLOW_ERROR;
                error = true;
                updateDisplay();
            }
        }
        if( !error ) {
            displayVal += BUTTON_1_VAL;
            updateDisplay();
        }
    }

    /**
     * Called when user presses button2
     *
     * @param view used for something idk...
     */
    public void button2Pressed( View view ) {
        if( error ) {
            displayVal = DISPLAY_EMPTY;
            error = false;
            updateDisplay();
        } else {
            try {
                if( Integer.parseInt(displayVal) == Integer.parseInt(DISPLAY_DEFAULT) ) {
                    displayVal = "";
                }
            } catch (NumberFormatException e) {
                displayVal = OVERFLOW_ERROR;
                error = true;
                updateDisplay();
            }
        }
        if( !error ) {
            displayVal += BUTTON_2_VAL;
            updateDisplay();
        }
    }

    /**
     * Called when user presses button3
     *
     * @param view used for something idk...
     */
    public void button3Pressed( View view ) {
        if( error ) {
            displayVal = DISPLAY_EMPTY;
            error = false;
            updateDisplay();
        } else {
            try {
                if( Integer.parseInt(displayVal) == Integer.parseInt(DISPLAY_DEFAULT) ) {
                    displayVal = "";
                }
            } catch (NumberFormatException e) {
                displayVal = OVERFLOW_ERROR;
                error = true;
                updateDisplay();
            }
        }
        if( !error ) {
            displayVal += BUTTON_3_VAL;
            updateDisplay();
        }
    }

    /**
     * Called when user presses button4
     *
     * @param view used for something idk...
     */
    public void button4Pressed( View view ) {
        if( error ) {
            displayVal = DISPLAY_EMPTY;
            error = false;
            updateDisplay();
        } else {
            try {
                if( Integer.parseInt(displayVal) == Integer.parseInt(DISPLAY_DEFAULT) ) {
                    displayVal = "";
                }
            } catch (NumberFormatException e) {
                displayVal = OVERFLOW_ERROR;
                error = true;
                updateDisplay();
            }
        }
        if( !error ) {
            displayVal += BUTTON_4_VAL;
            updateDisplay();
        }
    }

    /**
     * Called when user presses button5
     *
     * @param view used for something idk...
     */
    public void button5Pressed( View view ) {
        if( error ) {
            displayVal = DISPLAY_EMPTY;
            error = false;
            updateDisplay();
        } else {
            try {
                if( Integer.parseInt(displayVal) == Integer.parseInt(DISPLAY_DEFAULT) ) {
                    displayVal = "";
                }
            } catch (NumberFormatException e) {
                displayVal = OVERFLOW_ERROR;
                error = true;
                updateDisplay();
            }
        }
        if( !error ) {
            displayVal += BUTTON_5_VAL;
            updateDisplay();
        }
    }

    /**
     * Called when user presses button6
     *
     * @param view used for something idk...
     */
    public void button6Pressed( View view ) {
        if( error ) {
            displayVal = DISPLAY_EMPTY;
            error = false;
            updateDisplay();
        } else {
            try {
                if( Integer.parseInt(displayVal) == Integer.parseInt(DISPLAY_DEFAULT) ) {
                    displayVal = "";
                }
            } catch (NumberFormatException e) {
                displayVal = OVERFLOW_ERROR;
                error = true;
                updateDisplay();
            }
        }
        if( !error ) {
            displayVal += BUTTON_6_VAL;
            updateDisplay();
        }
    }

    /**
     * Called when user presses button7
     *
     * @param view used for something idk...
     */
    public void button7Pressed( View view ) {
        if( error ) {
            displayVal = DISPLAY_EMPTY;
            error = false;
            updateDisplay();
        } else {
            try {
                if( Integer.parseInt(displayVal) == Integer.parseInt(DISPLAY_DEFAULT) ) {
                    displayVal = "";
                }
            } catch (NumberFormatException e) {
                displayVal = OVERFLOW_ERROR;
                error = true;
                updateDisplay();
            }
        }
        if( !error ) {
            displayVal += BUTTON_7_VAL;
            updateDisplay();
        }
    }

    /**
     * Called when user presses button8
     *
     * @param view used for something idk...
     */
    public void button8Pressed( View view ) {
        if( error ) {
            displayVal = DISPLAY_EMPTY;
            error = false;
            updateDisplay();
        } else {
            try {
                if( Integer.parseInt(displayVal) == Integer.parseInt(DISPLAY_DEFAULT) ) {
                    displayVal = "";
                }
            } catch (NumberFormatException e) {
                displayVal = OVERFLOW_ERROR;
                error = true;
                updateDisplay();
            }
        }
        if( !error ) {
            displayVal += BUTTON_8_VAL;
            updateDisplay();
        }
    }

    /**
     * Called when user presses button9
     *
     * @param view used for something idk...
     */
    public void button9Pressed( View view ) {
        if( error ) {
            displayVal = DISPLAY_EMPTY;
            error = false;
            updateDisplay();
        } else {
            try {
                if( Integer.parseInt(displayVal) == Integer.parseInt(DISPLAY_DEFAULT) ) {
                    displayVal = "";
                }
            } catch (NumberFormatException e) {
                displayVal = OVERFLOW_ERROR;
                error = true;
                updateDisplay();
            }
        }
        if( !error ) {
            displayVal += BUTTON_9_VAL;
            updateDisplay();
        }
    }

    /**
     * Updates the display to hold the current displayVal
     */
    private void updateDisplay() {
        if( !error ) {
            try {
                //checking to see if int is valid
                int willGetGarbageCollected = Integer.getInteger(displayVal, BASE);
            } catch (NumberFormatException e) {
                displayVal = OVERFLOW_ERROR;
                error = true;
            }
        }
        TextView display = findViewById(R.id.display);
        display.setText(displayVal);
    }

}
