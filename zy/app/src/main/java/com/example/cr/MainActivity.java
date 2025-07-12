package com.example.cr;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        navigation();
    }
    private RadioGroup myradioGroup;
    private RadioButton rbutton1,rbutton2,rbutton3,rbutton4;
    private Resources res;
    private Drawable icon_home_true,icon_home_false,icon_me_true,
            icon_me_false,icon_order_true,icon_order_false,
            icon_community_true,getIcon_community_false;
    private int fontColor_false,fontColor_true;

    private void initview(){
        myradioGroup=(RadioGroup) this.findViewById(R.id.main_radioGroup);
        rbutton1=(RadioButton) this.findViewById(R.id.main_radio0);
        rbutton2=(RadioButton) this.findViewById(R.id.main_radio1);
        rbutton3=(RadioButton) this.findViewById(R.id.main_radio2);
        rbutton4=(RadioButton) this.findViewById(R.id.main_radio3);
        res=getResources();
        icon_home_true=res.getDrawable(R.mipmap.icon_home_true);
        icon_home_false=res.getDrawable(R.mipmap.icon_home_false);
        icon_community_true=res.getDrawable(R.mipmap.icon_community_true);
        getIcon_community_false=res.getDrawable(R.mipmap.icon_community_false);
        icon_me_true=res.getDrawable(R.mipmap.icon_me_true);
        icon_me_false=res.getDrawable(R.mipmap.icon_me_false);
        icon_order_true=res.getDrawable(R.mipmap.icon_order_true);
        icon_order_false=res.getDrawable(R.mipmap.icon_order_false);
        fontColor_false=res.getColor(R.color.navigation_false);
        fontColor_true=res.getColor(R.color.public_green);
    }

    private void setAllColor(){
        rbutton1.setTextColor(fontColor_false);
        rbutton2.setTextColor(fontColor_false);
        rbutton3.setTextColor(fontColor_false);
        rbutton4.setTextColor(fontColor_false);
    }

    private void setAllImage(){
        rbutton1.setCompoundDrawablesWithIntrinsicBounds(null,icon_home_false,null,null);
        rbutton2.setCompoundDrawablesWithIntrinsicBounds(null,getIcon_community_false,null,null);
        rbutton3.setCompoundDrawablesWithIntrinsicBounds(null,icon_order_false,null,null);
        rbutton4.setCompoundDrawablesWithIntrinsicBounds(null,icon_me_false,null,null);
    }

    private void navigation(){
        myradioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                setAllColor();
                setAllImage();
                switch (i){
                    case R.id.main_radio0:
                        rbutton1.setTextColor(fontColor_true);
                        rbutton1.setCompoundDrawablesWithIntrinsicBounds(null,icon_home_true,null,null);
                        Toast.makeText(MainActivity.this,"首页",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.main_radio1:
                        rbutton2.setTextColor(fontColor_true);
                        rbutton2.setCompoundDrawablesWithIntrinsicBounds(null,icon_community_true,null,null);
                        Toast.makeText(MainActivity.this,"吃货驾到",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.main_radio2:
                        rbutton3.setTextColor(fontColor_true);
                        rbutton3.setCompoundDrawablesWithIntrinsicBounds(null,icon_order_true,null,null);
                        Toast.makeText(MainActivity.this,"我的订单",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.main_radio3:
                        rbutton4.setTextColor(fontColor_true);
                        rbutton4.setCompoundDrawablesWithIntrinsicBounds(null,icon_me_true,null,null);
                        Toast.makeText(MainActivity.this,"个人中心",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

}
