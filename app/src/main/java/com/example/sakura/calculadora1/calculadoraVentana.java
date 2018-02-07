package com.example.sakura.calculadora1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculadoraVentana extends AppCompatActivity {
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_0;
    Button Mas,Menos,Mul,Div,Punto,Igual,Clear;
    int Operacion;

    EditText Pantalla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_ventana);
        btn_1=(Button)findViewById(R.id.btn1);
        btn_2=(Button)findViewById(R.id.btn2);
        btn_3=(Button)findViewById(R.id.btn3);
        btn_4=(Button)findViewById(R.id.btn4);
        btn_5=(Button)findViewById(R.id.btn5);
        btn_6=(Button)findViewById(R.id.btn6);
        btn_7=(Button)findViewById(R.id.btn7);
        btn_8=(Button)findViewById(R.id.btn8);
        btn_9=(Button)findViewById(R.id.btn9);
        btn_0=(Button)findViewById(R.id.btn0);
        btn_0=(Button)findViewById(R.id.btn0);
        //Operaciones
        Mas=(Button)findViewById(R.id.btnMas);
        Menos=(Button)findViewById(R.id.btnMenos);
        Mul=(Button)findViewById(R.id.btnMul);
        Div=(Button)findViewById(R.id.btnDiv);
        //Mas

        Clear=(Button)findViewById(R.id.btnCle);
        Punto=(Button)findViewById(R.id.btnP);
        Igual=(Button)findViewById(R.id.btnIg);


        Pantalla=(EditText)findViewById(R.id.edt);

    }

    public void add1(View view){
        String cad = Pantalla.getText().toString();
        cad+="1";
        Pantalla.setText(cad);

    }
    public void add2(View view){
        String cad = Pantalla.getText().toString();
        cad+="2";
        Pantalla.setText(cad);

    }
    public void add3(View view){
        String cad = Pantalla.getText().toString();
        cad+="3";
        Pantalla.setText(cad);

    }
    public void add4(View view){
        String cad = Pantalla.getText().toString();
        cad+="4";
        Pantalla.setText(cad);

    }
    public void add5 (View view){
        String cad = Pantalla.getText().toString();
        cad+="5";
        Pantalla.setText(cad);

    }
    public void add6(View view){
        String cad = Pantalla.getText().toString();
        cad+="6";
        Pantalla.setText(cad);

    }
    public void add7(View view){
        String cad = Pantalla.getText().toString();
        cad+="7";
        Pantalla.setText(cad);

    }
    public void add8(View view){
        String cad = Pantalla.getText().toString();
        cad+="8";
        Pantalla.setText(cad);

    }

    public void add9 (View view){
        String cad = Pantalla.getText().toString();
        cad+="9";
        Pantalla.setText(cad);

    }
    public void add0 (View view){
        String cad = Pantalla.getText().toString();
        cad+="0";
        Pantalla.setText(cad);

    }
    public void  mas(View view){
        String cad = Pantalla.getText().toString();
        cad+="+";
        Pantalla.setText(cad);
        Operacion = 1;


    }
    public void menos(View view){
        String cad = Pantalla.getText().toString();
        cad+="-";
        Pantalla.setText(cad);
        Operacion = 2;
    }
    public void  Mul(View view){
        String cad = Pantalla.getText().toString();
        cad+="x";
        Pantalla.setText(cad);
        Operacion = 3;

    }
    public void Div(View view){
        String cad = Pantalla.getText().toString();
        cad+="/";
        Pantalla.setText(cad);
        Operacion = 4;

    }
    public void punto(View view){
        String cad = Pantalla.getText().toString();
        cad+=".";
        Pantalla.setText(cad);

    }


    public void Clear(View view){

        Pantalla.setText("");

    }

    //Igual
    public void Igual(View view){
        String cad = Pantalla.getText().toString();
        //String op = "+-x/";
        String[] Variables = cad.split("[+\\-]");
                 Variables = cad.split("/");
                 Variables = cad.split("x");

        float A = Float.parseFloat(Variables[0]);
        float B = Float.parseFloat(Variables[1]);
        float Resultado;

        switch(Operacion){

            case 1:
                 Resultado = A + B;

                Pantalla.setText( Float.toString(Resultado));

                break;

            case 2:
                 Resultado = A - B;
                Pantalla.setText( Float.toString(Resultado));

                break;

            case 3:
                 Resultado = A * B;
                Pantalla.setText( Float.toString(Resultado));

                break;
            case 4:
                 Resultado = A / B;
                Pantalla.setText( Float.toString(Resultado));

                break;

        }




        cad+="-";
        Pantalla.setText(cad);

    }





    public void sumar(){
        int a=0,b=0;

        a=Integer.parseInt(Pantalla.getText().toString());
    }
}
