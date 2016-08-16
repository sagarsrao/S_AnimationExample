package com.cf.AnimationExample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class S_AnimationExampleActivity extends Activity {
    /** Called when the activity is first created. */
 
    Button b1;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final TextView tv=(TextView)findViewById(R.id.Tv);
       //LinearLayout l=(LinearLayout)findViewById(R.id.L1);
        b1=(Button)findViewById(R.id.button1);
        
         
      final Animation a=AnimationUtils.loadAnimation(this,R.anim.alpha);
    //        final Animation b=AnimationUtils.loadAnimation(this,R.anim.rotate);
//       final Animation c=AnimationUtils.loadAnimation(this,R.anim.scale);
      //  final Animation d =AnimationUtils.loadAnimation(this,R.anim.translate);        

         
       b1.setOnClickListener(new View.OnClickListener() 
       {
       			
       			public void onClick(View v) 
       {
       		// TODO Auto-generated method stub
       				tv.startAnimation(a);
       			}
       		});
               
    }

}
        
        
        
        
        
        
        
        
        
        
        
        
        
   