package gdg.algiers.applicationpourdebutant;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button login = (Button) findViewById(R.id.logmein);


        // Code of login
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText login= (EditText) findViewById(R.id.login);
                EditText password= (EditText) findViewById(R.id.password);
                TextView welcome=(TextView) findViewById(R.id.welcome);

                if(login.getText().toString().equals("yacine") && password.getText().toString().equals("password")){


                    Intent  link = new Intent(MainActivity.this,QuizzActivity.class);
                    startActivity(link);

                }else {
                    welcome.setText("Wrong address");
                }


            }
        });



    }

}
