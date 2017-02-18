package gdg.algiers.applicationpourdebutant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class QuizzActivity extends AppCompatActivity {

    int incrementer=0;
    ArrayList <QuestionEntity> questionArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizz_layout);
        Button answer = (Button) findViewById(R.id.answer);
        final RadioGroup choices = (RadioGroup) findViewById(R.id.choices);

        TextView question = (TextView) findViewById(R.id.question);
        RadioButton choice1= (RadioButton) findViewById(R.id.choice1);
        RadioButton choice2= (RadioButton) findViewById(R.id.choice2);
        RadioButton choice3= (RadioButton) findViewById(R.id.choice3);

        // Questions

        QuestionEntity q1= new QuestionEntity("في علم فلسطين","4 الوان","3 الوان","5 الوان","4 الوان");
        QuestionEntity q2= new QuestionEntity("عاصمة مصر","الاسكندرية","الجيزة","القاهرة","القاهرة");
        QuestionEntity q3= new QuestionEntity("عاصمة الجزائر","الجزائر","نيجيريا","طمبكتو","الجزائر");


        questionArray= new ArrayList<QuestionEntity>() ;

        questionArray.add(q1);
        questionArray.add(q2);
        questionArray.add(q3);


        question.setText(questionArray.get(0).getQuestion());
        choice1.setText(questionArray.get(0).getChoice1());
        choice2.setText(questionArray.get(0).getChoice2());
        choice3.setText(questionArray.get(0).getChoice3());



        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            try {

                RadioButton checked = (RadioButton) findViewById(choices.getCheckedRadioButtonId());

                if (checked.getText() == questionArray.get(incrementer).getRightChoice()) {

                    incrementer++;


                    TextView question = (TextView) findViewById(R.id.question);
                    RadioButton choice1 = (RadioButton) findViewById(R.id.choice1);
                    RadioButton choice2 = (RadioButton) findViewById(R.id.choice2);
                    RadioButton choice3 = (RadioButton) findViewById(R.id.choice3);

                    question.setText(questionArray.get(incrementer).getQuestion());
                    choice1.setText(questionArray.get(incrementer).getChoice1());
                    choice2.setText(questionArray.get(incrementer).getChoice2());
                    choice3.setText(questionArray.get(incrementer).getChoice3());


                }

            }catch (IndexOutOfBoundsException e){
                Intent  link = new Intent(QuizzActivity.this,CongratulationsActivity.class);
                startActivity(link);
            }


            }
        });


    }
}
